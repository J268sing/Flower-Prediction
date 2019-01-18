# Flower-Prediction-app
This is the final project of the Facbeook's PyTorch challenge program on Udacity. This is a CNN model bulit by fine-tuning the pre-trained VGG19 model by modifiying the classifying layer with custom feed forward network that has 2 hidden layers and ReLU activation functions. It was trained on google collab.
Then I deployed the model into a Web app using flask that takes in a flower image and uses a the pretrained network to predict name of the species of flower that is the nearest look-alike (neighbour) of flower present in the image, out of 102 flower species on which the the model has been trained on.

The model requires that the user must input an image that has flower in it. Otherwise, it will assume the presence of flower and will give the nearest look-alike.
The model accepts only .jpg or .jpeg type images.


