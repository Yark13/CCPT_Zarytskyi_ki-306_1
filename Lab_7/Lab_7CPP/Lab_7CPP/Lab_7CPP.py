import sys

rows_num = int(input("Введіть розмір квадратної матриці: "))
lst = []
filler = input("Введіть символ-заповнювач: ")

if len(filler) != 1:
    print("Будь ласка, введіть лише один символ-заповнювач")
    sys.exit(1)

counter = 1  # Змінна для визначення кількості елементів у рядку

for i in range(rows_num):
    lst.append([])
    for j in range(counter):
        lst[i].append(ord(filler))
        print(chr(lst[i][j]), end=" ")
    counter += 1 if i < rows_num // 2 else -1  # Збільшуємо або зменшуємо лічильник
    print()

# Додатковий блок для обробки парного розміру матриці
if rows_num % 2 == 0:
    lst.append([ord(filler)])
    print(chr(lst[-1][0]))
