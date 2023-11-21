package CI306.Zarytskyi.Lab3;

public interface ComputerInterface {
    /**
     * Метод для включення комп'ютера.
     */
    public void turnOn();

    /**
     * Метод для вимкнення комп'ютера.
     */
    public void turnOff();

    /**
     * Метод для виконання програми на комп'ютері.
     * @param program Назва програми, яку слід виконати.
     */
    public void runProgram(String program);

    /**
     * Метод для розширення обсягу пам'яті комп'ютера.
     * @param additionalMemory Кількість додаткової пам'яті в гігабайтах.
     */
    public void upgradeMemory(int additionalMemory);

    /**
     * Метод для отримання моделі процесора комп'ютера.
     * @return Модель процесора.
     */
    public String getProcessorModel();

    /**
     * Метод для отримання обсягу встановленої пам'яті комп'ютера.
     * @return Обсяг пам'яті в гігабайтах.
     */
    public int getMemoryCapacity();

    /**
     * Метод для отримання моделі графічної карти комп'ютера.
     * @return Модель графічної карти.
     */
    public String getGraphicsCardModel();

    /**
     * Метод для оновлення моделі процесора комп'ютера.
     * @param newModel Нова модель процесора.
     */
    public void updateProcessorModel(String newModel);

    /**
     * Метод для виведення інформації про комп'ютер у консоль.
     */
    public void displayComputerInfo();
}
