/**
 * 
 */
package CI306.Zarytskyi.Lab2;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас, який представляє графічну карту комп'ютера.
 */
public class GraphicsCard {
	static private String listofGraphicsCard;
    private String model;

    /**
     * Конструктор класу GraphicsCard для ініціалізації моделі графічної карти.
     * @param model Модель графічної карти.
     */
    public GraphicsCard(String model) {
        this.model = model;
        listofGraphicsCard += (this.model + ", ");
    }
    
    public String GetAllGraphicsCard() {
    	return listofGraphicsCard;
    }

    /**
     * Метод для отримання моделі графічної карти.
     * @return Модель графічної карти.
     */
    public String getModel() {
        return this.model;
    }
}
