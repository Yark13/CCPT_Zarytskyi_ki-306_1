package CI306.Zarytskyi.Lab_6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Клас, що реалізує предметну область "Трюм корабля"
 */
public class ShipHold<T extends Comparable<T>> {
    private List<T> items;

    /**
     * Конструктор класу ShipHold
     */
    public ShipHold() {
        items = new ArrayList<>();
    }
    /**
     * Метод для розміщення елемента у трюмі
     */
    public void placeItem(T item) {
        items.add(item);
    }
    /**
     * Метод для видалення елемента з трюму
     * @param item будь-який елемент, типу параметру класу ShipHold
     */
    public void removeItem(T item) {
        items.remove(item);
    }
    /**
     * Метод для знаходження максимального елемента у трюмі
     */
    public T findMaxItem() {
        if (items.isEmpty()) {
            return null;
        }
        return Collections.max(items);
    }
    /**
     * Метод для виведення всіх елементів у трюмі
     */
    public void displayItems() {
        System.out.println("Елементи у трюмі:");
        for (T item : items) {
            System.out.println(item);
        }
    }
}