from flask import Flask,request, render_template
import imghdr,  os, win32api

app = Flask(__name__)

from inference import get_flower_name

@app.route('/', methods= ['GET', 'POST'])
def hello_world():
	if request.method == 'GET':
		return render_template("index.html", value = "hello jatt")

	if request.method == 'POST':
		if 'file' not in request.files:
			print("file not uploaded")
			win32api.MessageBox(0, 'Input Some image first', 'WARNING', 0x00001000) 
			return render_template("index.html", value = "hello jatt") 

		file = request.files['file']
		
		ty = imghdr.what(file)
		if((ty == "jpeg" or ty == "jpg" or ty == "JPG" or ty == "JPEG")):
			image = file.read()
			category, flower_name = get_flower_name(image_bytes = image)
			return render_template('result.html', flower = flower_name, category = category)
		else:
			win32api.MessageBox(0, 'Only accepts .jpg or .jpeg files', 'WARNING', 0x00001000) 
			return render_template("index.html", value = "hello jatt")
if __name__ == '__main__':
	app.run(debug = True, port = os.getenv('PORT', 25566))







	