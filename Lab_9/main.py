from computer import Computer
from processor import Processor
from memory import Memory
from graphics_card import GraphicsCard

if __name__ == "__main__":
    processor = Processor("Intel i7 10700H")
    memory = Memory(8)
    graphics_card = GraphicsCard("NVIDIA GeForce RTX 3070")

    my_computer = Computer(processor, memory, graphics_card)

    my_computer.turn_on()
    my_computer.display_computer_info()
    my_computer.run_program("3D Game")
    my_computer.upgrade_memory(16)
    my_computer.get_memory_capacity()  # Можна зберегти або вивести результат
    my_computer.update_processor_model("Intel i9 10700H")
    my_computer.get_processor_model()  # Можна зберегти або вивести результат
    my_computer.turn_off()
