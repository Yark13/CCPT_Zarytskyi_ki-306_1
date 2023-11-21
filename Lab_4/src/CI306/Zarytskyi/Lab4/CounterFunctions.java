package CI306.Zarytskyi.Lab4;

/**
 * Клас для виконання розрахунків на основі математичного виразу.
 * Реалізує метод для обчислення виразу та обробки виняткових ситуацій.
 */
public class CounterFunctions {

    /**
     * Метод обчислення виразу для заданого значення x.
     *
     * @param x Значення x, для якого обчислюється вираз.
     * @return Результат обчислення виразу у вигляді рядка.
     * @throws ArithmeticException Виняток, який виникає при деяких арифметичних помилках,
     *                            таких як ділення на нуль.
     */
    public String calculateExpression(double x) throws ArithmeticException {

        double tangent = Math.tan(x);

        // Обробка випадку, коли ctg(x) не існує (тобто tan(x) = 0)
        if (Double.compare(tangent, 0.0) == 0) {
            throw new ArithmeticException("Ctg(" + x + ") doesn't exist");
        }

        double numerator = 1 / tangent;
        double denominator = Math.sin(7 * x - 1);

        // Обробка випадку, коли знаменник дорівнює нулю (виключення ділення на нуль)
        if (Double.compare(denominator, 0.0) == 0) {
        	throw new ArithmeticException("Division by zero is not allowed.");
        }

        return Double.toString(numerator / denominator);
    }
}
