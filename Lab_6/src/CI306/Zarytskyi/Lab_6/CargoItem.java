package CI306.Zarytskyi.Lab_6;
/**
 * Клас, що реалізує речі, які мають ім'я і вагу
 */
class CargoItem implements Comparable<CargoItem> {
    private String name;
    private int weight;
    /**
     * конструктор, для створення класу CargoItem
     * @param name ім'я речі
     * @param weight вага речі
     */
    public CargoItem(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    /**
     * Метод, який призначений для порівняння двох item-ів між собою за властивістю ваги
     */
    @Override
    public String toString() {
        return name + " (Weight: " + weight + " kg)";
    }
    /**
     * Метод, який призначений для порівняння двох item-ів між собою за властивістю ваги
     * @param other це другий item з яким порівнюється даний item
     */
    @Override
    public int compareTo(CargoItem other) {
        return Integer.compare(this.weight, other.weight);
    }
}
