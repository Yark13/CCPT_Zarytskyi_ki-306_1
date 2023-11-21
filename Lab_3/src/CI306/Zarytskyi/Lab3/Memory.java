package CI306.Zarytskyi.Lab3;

/**
 * Клас, який представляє пам'ять комп'ютера.
 */
public class Memory {
    private int capacity;

    /**
     * Конструктор класу Memory для ініціалізації обсягу пам'яті.
     * @param capacity Початковий обсяг пам'яті в гігабайтах.
     */
    public Memory(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Метод для додавання додаткового обсягу пам'яті до поточного.
     * @param additionalCapacity Додатковий обсяг пам'яті в гігабайтах.
     */
    public void addCapacity(int additionalCapacity) {
        this.capacity += additionalCapacity;
    }

    /**
     * Метод для отримання поточного обсягу пам'яті.
     * @return Обсяг пам'яті в гігабайтах.
     */
    public int getCapacity() {
        return this.capacity;
    }
}

