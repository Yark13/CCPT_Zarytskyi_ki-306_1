class Processor:
    def __init__(self, model):
        self.model = model

    def get_model(self):
        return self.model

    def set_model(self, new_model):
        self.model = new_model
