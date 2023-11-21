class Memory:
    def __init__(self, capacity):
        self.capacity = capacity

    def add_capacity(self, additional_capacity):
        self.capacity += additional_capacity

    def get_capacity(self):
        return self.capacity
