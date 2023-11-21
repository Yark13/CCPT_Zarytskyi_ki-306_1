package CI306.Zarytskyi.Lab_6;
/**
 * Клас для демонстрації використання класу ShipHold та демонстрування результатів на дисплей.
 */
public class ShipHoldDriver {
	/**
     * Головний метод, який демонструє використання класу ShipHold.
     *
     * @param args Аргументи командного рядка (не використовуються в цьому контексті).
     */
    public static void main(String[] args) {
        // Створення екземпляру класу ShipHold для цілих чисел
        ShipHold<Integer> intShipHold = new ShipHold<>();
        intShipHold.placeItem(10);
        intShipHold.placeItem(5);
        intShipHold.placeItem(20);
        intShipHold.displayItems();
        Integer maxIntItem = intShipHold.findMaxItem();
        System.out.println("Максимальний елемент у трюмі для цілих чисел: " + maxIntItem);

        // Створення екземпляру класу ShipHold для об'єктів CargoItem
        ShipHold<CargoItem> cargoShipHold = new ShipHold<>();
        cargoShipHold.placeItem(new CargoItem("Коробки", 150));
        cargoShipHold.placeItem(new CargoItem("Бочки", 200));
        cargoShipHold.placeItem(new CargoItem("Мішки", 100));
        cargoShipHold.displayItems();
        CargoItem maxCargoItem = cargoShipHold.findMaxItem();
        System.out.println("Максимальний елемент у трюмі для вантажів: " + maxCargoItem);
        
        new MyClass<String, Integer>().print_data("Hello", 324);
        
    }
}