import sys

rows_num = int(input("������ ����� ��������� �������: "))
lst = []
filler = input("������ ������-����������: ")

if len(filler) != 1:
    print("���� �����, ������ ���� ���� ������-����������")
    sys.exit(1)

counter = 1  # ����� ��� ���������� ������� �������� � �����

for i in range(rows_num):
    lst.append([])
    for j in range(counter):
        lst[i].append(ord(filler))
        print(chr(lst[i][j]), end=" ")
    counter += 1 if i < rows_num // 2 else -1  # �������� ��� �������� ��������
    print()

# ���������� ���� ��� ������� ������� ������ �������
if rows_num % 2 == 0:
    lst.append([ord(filler)])
    print(chr(lst[-1][0]))
