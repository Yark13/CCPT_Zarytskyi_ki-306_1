import sys

def read_from_text_file(filename):
    # Читання даних з текстового файлу
    data = []
    with open(filename, 'r') as file:
        lines = file.readlines()
        for line in lines:
            data.append(float(line))
    return data

rows_num = int(read_from_text_file('SizeMatrix.txt')[0])
lst = []
filler = input("Введіть символ-заповнювач: ")

if len(filler) != 1:
    print("Будь ласка, введіть лише один символ-заповнювач")
    sys.exit(1)

counter = 1  # Змінна для визначення кількості елементів у рядку

for i in range(rows_num):
    lst.append([])
    row_string = ""
    for j in range(counter):
        if j == 0 or j == counter - 1:
            lst[i].append(ord(filler))
            row_string += chr(lst[i][j])
        else:
            lst[i].append(ord(' '))  # Додаємо пропуск для інших елементів
            row_string += ' '
    counter += 1 if i < rows_num // 2 else -1  # Збільшуємо або зменшуємо лічильник
    print(row_string)

# Додатковий блок для обробки парного розміру матриці
if rows_num % 2 == 0:
    lst.append([ord(filler)])
    print(chr(lst[-1][0]))

# Запис матриці у файл
with open('matrix_output.txt', 'w') as file:
    for row in lst:
        file.write(''.join(map(chr, row)) + '\n')

print("Матрицю успішно записано у файл 'matrix_output.txt'")
