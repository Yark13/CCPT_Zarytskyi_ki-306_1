/**
 * 
 */
package CI306.Zarytskyi.Lab3;

/**
 * Клас-драйвер для демонстрації функціоналу класу Computer.
 */
public class ProgramDriver {

    /**
     * Метод main, який є точкою входу в програму.
     * Використовується для створення об'єкта класу Computer та виклику його методів.
     * @param args Аргументи командного рядка (не використовуються у цьому випадку).
     */
    public static void main(String[] args) {
        // Ініціалізація об'єктів процесора, пам'яті та графічної карти
        Processor processor = new Processor("Intel i7 10700H");
        Memory memory = new Memory(8);
        GraphicsCard graphicsCard = new GraphicsCard("NVIDIA GeForce RTX 3070");

        // Створення об'єкта класу Computer з використанням ініціалізованих комплектуючих
        ComputerInterface myComputer = new Laptop(processor, memory, graphicsCard);

        // Виклик методів для демонстрації функціоналу класу Computer
        myComputer.turnOn();
        myComputer.displayComputerInfo();
        myComputer.runProgram("3D Game");
        myComputer.upgradeMemory(16);
        myComputer.getMemoryCapacity(); // Цей результат можна зберегти або вивести
        myComputer.updateProcessorModel("Intel i9 10700H");
        myComputer.getProcessorModel(); // Цей результат можна зберегти або вивести
        myComputer.turnOff();
    }
}

