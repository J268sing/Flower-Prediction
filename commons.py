import io
import torch
import torch.nn as nn
from torchvision import models
from PIL import Image
import torchvision.transforms as transforms


def load_model():
	
    checkpoint = 'checkpoint.pt'
    model = models.vgg19(pretrained=True)
    custom_classifier = nn.Sequential(nn.Linear(25088,408),
                                      nn.ReLU(),
                                      nn.Dropout(0.2),
                                      nn.Linear(408,204),
                                      nn.ReLU(),
                                      nn.Dropout(0.2),
                                      nn.Linear(204, 102),
                                      nn.LogSoftmax(dim = 1)
                                      )
    
     
    model.classifier = custom_classifier
    model.load_state_dict(torch.load(checkpoint, map_location = 'cpu'), strict  = False)
    model.eval()
    return model




def get_tensor(image_bytes):
	my_transforms =  transforms.Compose([transforms.Resize(255),
                                       transforms.RandomResizedCrop(224),
                                       transforms.ToTensor(),
                                       transforms.Normalize([0.485, 0.456, 0.406], 
                                                            [0.229, 0.224, 0.225])])
	image = Image.open(io.BytesIO(image_bytes))
	return my_transforms(image).unsqueeze(0)
