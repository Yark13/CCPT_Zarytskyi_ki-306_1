package CI306.Zarytskyi.Lab_5;

import java.io.*;

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

    /**
     * Метод для запису результату у текстовий файл.
     *
     * @param result   Результат обчислення виразу у вигляді рядка.
     * @param filePath Шлях до текстового файлу, у який буде записаний результат.
     */
    public void writeResultToTextFile(String result, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            writer.println("Result: " + result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для читання результату з текстового файлу.
     *
     * @param filePath Шлях до текстового файлу, з якого буде зчитаний результат.
     * @return Рядок, який представляє собою результат обчислення виразу.
     * @throws IOException Виняток, який виникає при помилках читання з файлу.
     */
    public String readResultFromTextFile(String filePath) throws IOException {
        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line);
            }
        }
        return result.toString();
    }

    /**
     * Метод для запису результату у двійковий файл.
     *
     * @param result   Результат обчислення виразу у вигляді рядка.
     * @param filePath Шлях до двійкового файлу, у який буде записаний результат.
     */
    public void writeResultToBinaryFile(String result, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для читання результату з двійкового файлу.
     *
     * @param filePath Шлях до двійкового файлу, з якого буде зчитаний результат.
     * @return Рядок, який представляє собою результат обчислення виразу.
     * @throws IOException            Виняток, який виникає при помилках читання з файлу.
     * @throws ClassNotFoundException Виняток, який виникає, якщо клас не знайдений при зчитуванні об'єкта.
     */
    public String readResultFromBinaryFile(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (String) ois.readObject();
        }
    }
}
