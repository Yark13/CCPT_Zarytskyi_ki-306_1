package CI306.Zarytskyi.Lab_5;
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
        CounterFunctions calculator = new CounterFunctions();
        double x = 1;
        String filePathText = "result_text.txt";
        String filePathBinary = "result_binary.dat";

        try {
            String result = calculator.calculateExpression(x);

            // Запис результату у текстовий файл
            calculator.writeResultToTextFile(result, filePathText);
            System.out.println("Text file: Calculation completed successfully. Result written to " + filePathText);

            // Запис результату у двійковий файл
            calculator.writeResultToBinaryFile(result, filePathBinary);
            System.out.println("Binary file: Calculation completed successfully. Result written to " + filePathBinary);

            // Читання результату з текстового файлу
            String resultFromTextFile = calculator.readResultFromTextFile(filePathText);
            System.out.println("Result from text file: " + resultFromTextFile);

            // Читання результату з двійкового файлу
            String resultFromBinaryFile = calculator.readResultFromBinaryFile(filePathBinary);
            System.out.println("Result from binary file: " + resultFromBinaryFile);
        } catch (ArithmeticException | IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

