from computer import Computer
from processor import Processor
from memory import Memory
from graphics_card import GraphicsCard
from screenLaptor import ScreenLaptor

class Laptop(Computer, ScreenLaptop):
    def __init__(self, processor=Processor(""), memory=Memory(0), graphics_card=GraphicsCard(""),
                 size=None, resolution=None, screen_type=None):
        Computer.__init__(self, processor, memory, graphics_card)
        ScreenLaptop.__init__(self, size, resolution, screen_type)
