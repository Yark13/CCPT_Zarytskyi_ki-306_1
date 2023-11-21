import math
import struct

def f(x):
    # Реалізація функції f(x) = ctg(x) / sin(7x-1)
    try:
        result = math.atan(1 / math.tan(x)) / math.sin(7 * x - 1)
        return result
    except ZeroDivisionError:
        print("Ділення на нуль. Неможливо обчислити функцію для заданого x.")
        return None

def save_to_text_file(filename, data):
    # Запис результатів у текстовий файл
    with open(filename, 'w') as file:
        for item in data:
            file.write(str(item) + '\n')

def save_to_binary_file(filename, data):
    # Запис результатів у двійковий файл
    with open(filename, 'wb') as file:
        for item in data:
            file.write(struct.pack('d', item))

def read_from_text_file(filename):
    # Читання даних з текстового файлу
    data = []
    with open(filename, 'r') as file:
        lines = file.readlines()
        for line in lines:
            data.append(float(line))
    return data

def read_from_binary_file(filename):
    # Читання даних з двійкового файлу
    data = []
    with open(filename, 'rb') as file:
        while True:
            try:
                item = struct.unpack('d', file.read(8))
                if not item:
                    break
                data.append(item[0])
            except struct.error:
                break
    return data

if __name__ == "__main__":
    # Приклад використання:
    x_values = [0.1, 0.2, 0.3, 0.4, 0.5]  # Значення x для обчислення

    # Обчислення значень функції для заданих x
    results = [f(x) for x in x_values]

    # Запис результатів у текстовий файл
    save_to_text_file('results.txt', results)

    # Запис результатів у двійковий файл
    save_to_binary_file('results.bin', results)

    # Читання результатів з файлів
    results_from_text_file = read_from_text_file('results.txt')
    results_from_binary_file = read_from_binary_file('results.bin')

    # Виведення результатів
    print("Результати з текстового файлу:", results_from_text_file)
    print("Результати з двійкового файлу:", results_from_binary_file)

