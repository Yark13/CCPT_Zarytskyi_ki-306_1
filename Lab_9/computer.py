from processor import Processor
from memory import Memory
from graphics_card import GraphicsCard

class Computer:
    def __init__(self, processor=Processor(""), memory=Memory(0), graphics_card=GraphicsCard("")):
        self.processor = processor
        self.memory = memory
        self.graphics_card = graphics_card

    def turn_on(self):
        self.log("Комп'ютер увімкнено.")

    def turn_off(self):
        self.log("Комп'ютер вимкнено.")

    def run_program(self, program):
        self.log(f"Виконується програма: {program}")

    def upgrade_memory(self, additional_memory):
        self.memory.add_capacity(additional_memory)
        self.log(f"Пам'ять розширено на {additional_memory} ГБ.")

    def get_processor_model(self):
        self.log(f"Отримання назви моделі процесора, а саме: {self.processor.get_model()}")
        return self.processor.get_model()

    def get_memory_capacity(self):
        capacity = self.memory.get_capacity()
        self.log(f"Отримання інформації про місткість пам'яті комп'ютера, яка становить: {capacity} ГБ")
        return capacity

    def get_graphics_card_model(self):
        self.log(f"Отримання назви моделі відеокарти, а саме: {self.graphics_card.get_model()}")
        return self.graphics_card.get_model()

    def update_processor_model(self, new_model):
        self.processor.set_model(new_model)
        self.log(f"Модель процесора оновлено на: {new_model}")

    def display_computer_info(self):
        self.log(f"Інформація про комп'ютер:\n"
                 f"Процесор: {self.get_processor_model()}\n"
                 f"Пам'ять: {self.get_memory_capacity()} ГБ\n"
                 f"Графічна карта: {self.get_graphics_card_model()}")

    def log(self, message):
        with open("log.txt", "a") as writer:
            writer.write(message + "\n")
