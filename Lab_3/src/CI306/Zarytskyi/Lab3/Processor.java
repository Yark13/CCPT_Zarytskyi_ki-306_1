/**
 * 
 */
package CI306.Zarytskyi.Lab3;

/**
 * Клас, який представляє процесор комп'ютера.
 */
public class Processor {
    private String model;

    /**
     * Конструктор класу Processor для ініціалізації моделі процесора.
     * @param model Модель процесора.
     */
    public Processor(String model) {
        this.model = model;
    }

    /**
     * Метод для отримання моделі процесора.
     * @return Модель процесора.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Метод для оновлення моделі процесора.
     * @param newModel Нова модель процесора.
     */
    public void setModel(String newModel) {
        this.model = newModel;
    }
}
