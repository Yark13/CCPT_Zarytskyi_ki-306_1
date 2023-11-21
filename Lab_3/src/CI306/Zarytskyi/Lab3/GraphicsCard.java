/**
 * 
 */
package CI306.Zarytskyi.Lab3;

/**
 * Клас, який представляє графічну карту комп'ютера.
 */
public class GraphicsCard {
    private String model;

    /**
     * Конструктор класу GraphicsCard для ініціалізації моделі графічної карти.
     * @param model Модель графічної карти.
     */
    public GraphicsCard(String model) {
        this.model = model;
    }

    /**
     * Метод для отримання моделі графічної карти.
     * @return Модель графічної карти.
     */
    public String getModel() {
        return this.model;
    }
}
