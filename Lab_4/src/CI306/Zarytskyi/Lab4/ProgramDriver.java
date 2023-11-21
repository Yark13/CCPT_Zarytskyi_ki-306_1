package CI306.Zarytskyi.Lab4;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * Клас для демонстрації використання класу CounterFunctions та запису результатів у файл.
 */
public class ProgramDriver {

    /**
     * Головний метод, який демонструє використання класу CounterFunctions.
     *
     * @param args Аргументи командного рядка (не використовуються в цьому контексті).
     */
    public static void main(String[] args) {
        // Приклад використання
        CounterFunctions calculator = new CounterFunctions();
        double x = 1; // Значення x для обчислення виразу
        String filePath = "result.txt"; // Шлях до файлу для запису результату

        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))){
            String result = calculator.calculateExpression(x);
            writer.println("Result: " + result);
            System.out.println("Calculation completed successfully. Result written to " + filePath);
        } 
        catch (ArithmeticException | IOException e) {
            System.err.println("Error: " + e.getMessage());
        } 
    }
}
