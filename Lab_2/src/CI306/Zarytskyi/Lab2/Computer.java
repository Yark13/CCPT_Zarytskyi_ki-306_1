package CI306.Zarytskyi.Lab2;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Клас, який представляє комп'ютер.
 */
public class Computer {
    private Processor processor;
    private Memory memory;
    private GraphicsCard graphicsCard;

    /**
     * Конструктор для створення комп'ютера з параметрами за замовчуванням.
     * Ініціалізує об'єкти Processor, Memory та GraphicsCard з порожніми значеннями.
     */
    public Computer() {
        this.processor = new Processor("");
        this.memory = new Memory(0);
        this.graphicsCard = new GraphicsCard("");
    }

    /**
     * Конструктор для створення комп'ютера з вказаними комплектуючими.
     * @param processor Процесор комп'ютера.
     * @param memory Пам'ять комп'ютера.
     * @param graphicsCard Графічна карта комп'ютера.
     */
    public Computer(Processor processor, Memory memory, GraphicsCard graphicsCard) {
        this.processor = processor;
        this.memory = memory;
        this.graphicsCard = graphicsCard;
    }

    /**
     * Метод для включення комп'ютера.
     */
    public void turnOn() {
        log("Комп'ютер увімкнено.");
    }

    /**
     * Метод для вимкнення комп'ютера.
     */
    public void turnOff() {
        log("Комп'ютер вимкнено.");
    }

    /**
     * Метод для виконання програми на комп'ютері.
     * @param program Назва програми, яку слід виконати.
     */
    public void runProgram(String program) {
        log("Виконується програма: " + program);
    }

    /**
     * Метод для розширення обсягу пам'яті комп'ютера.
     * @param additionalMemory Кількість додаткової пам'яті в гігабайтах.
     */
    public void upgradeMemory(int additionalMemory) {
        memory.addCapacity(additionalMemory);
        log("Пам'ять розширено на " + additionalMemory + " ГБ.");
    }

    /**
     * Метод для отримання моделі процесора комп'ютера.
     * @return Модель процесора.
     */
    public String getProcessorModel() {
    	log("Отримання назву моделі процесора, а саме: " + processor.getModel());
        return processor.getModel();
    }

    /**
     * Метод для отримання обсягу встановленої пам'яті комп'ютера.
     * @return Обсяг пам'яті в гігабайтах.
     */
    public int getMemoryCapacity() {
    	log("Отримання інформації про місткість пам'яті комп'ютера, яка становить: " + memory.getCapacity() + "ГБ");
        return memory.getCapacity();
    }

    /**
     * Метод для отримання моделі графічної карти комп'ютера.
     * @return Модель графічної карти.
     */
    public String getGraphicsCardModel() {
    	log("Отримання назву моделі відеокарти, а саме: " + graphicsCard.getModel());
        return graphicsCard.getModel();
    }

    /**
     * Метод для оновлення моделі процесора комп'ютера.
     * @param newModel Нова модель процесора.
     */
    public void updateProcessorModel(String newModel) {
        processor.setModel(newModel);
        log("Модель процесора оновлено на: " + newModel);
    }

    /**
     * Метод для виведення інформації про комп'ютер у консоль або в файл "log.txt".
     */
    public void displayComputerInfo() {
        log("Інформація про комп'ютер:\n" +
                "Процесор: " + getProcessorModel() + "\n" +
                "Пам'ять: " + getMemoryCapacity() + " ГБ\n" +
                "Графічна карта: " + getGraphicsCardModel());
    }

    /**
     * Метод для виведення message у файл "log.txt".
     */
    private void log(String message) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("log.txt", true))) {
            writer.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

