import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);
        Random random = new Random();


        //Задача 1:
        //1.1 Создайте двумерный массив и заполните его псевдослучайными числами с помощью
        //класса Random.
        System.out.println("Введите размероность двумерного массива");
        int n = line.nextInt();
        int m = line.nextInt();
        int[][] twooMas = new int[n][m];

        int MaxElem = twooMas[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                twooMas[i][j] = random.nextInt(100);
                if (MaxElem <= twooMas[i][j]) {
                    MaxElem = twooMas[i][j];
                }
            }
        }

        OutPutArray array = new OutPutArray();
        array.сonsoleOutput(n, m, twooMas);

        //1.2 Найдите максимальное значение в созданном 2-мерном массиве.
        System.out.println("Максимальное значение массива = " + MaxElem);

        //Задача 2:
        //Создать зубчатый n-мерный массив(от 3 уровней). Посчитать количество ячеек в нём.

        System.out.println("Введите размерность зубчатого 3-мерного массива (m, n, p):");
        n = line.nextInt();
        m = line.nextInt();
        int p = line.nextInt();
        int[][][] arr = new int[n][m][p]; // создание зубчатого 3-мерного массива

        int count = 0; // счетчик ячеек

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = count; // заполнение ячейки значением count
                    count++;
                }
            }
        }

        System.out.println("Количество ячеек: " + count);

        //Задача 3:
        //Найдите сумму элементов на главной диагонали:
        System.out.println("Введите размерность  2-мерного массива n:");
        n = line.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                twooMas[i][j] = random.nextInt(100);
                if (i == j) {
                    sum += twooMas[i][i];
                }
            }
        }

        array.сonsoleOutput(n, n, twooMas);
        System.out.println("Cумма элементов главной диоганали = " + sum);

        //Ввести на экран матрицу mxn вида
        System.out.println("Введите размерность двумероного массива:");
        n = line.nextInt();
        m = line.nextInt();

        int[][] arr_1 = new int[n][m];

        count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr_1[i][j] = count; // заполнени массива
                count++;
            }
        }
        array.сonsoleOutput(n, m, arr_1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int l = 0; l < m - j - 1; l++) {
                    if (arr_1[i][l] < arr_1[i][l + 1]) {
                        int temp = arr_1[i][l];
                        arr_1[i][l] = arr_1[i][l + 1];
                        arr_1[i][l + 1] = temp;
                    }
                }
            }
        }

        System.out.println("преобразованный массив");
        array.сonsoleOutput(n, m, arr_1);

        count = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr_1[j][i] = count;
                count++;
            }
        }
        System.out.println("преобразованный массив");
        array.сonsoleOutput(n, m, arr_1);

        //Дан массив из символов и пробелов. Заменить все пробелы на последовательность символов '%', '2', '0' .
        // Порядок сохранить, в массиве достаточно места, чтобы все вместилось.
        // Вернуть конечную длину массива и сам массив изменить, не делать новый.

        char[] chars = {'h', 'k', ' ', 'r', ' ', 'l'};

        System.out.println("Исходный массив:" + Arrays.toString(chars) + "и его длинна равнв = " + chars.length);

        int spaceCount = 0;

        for (char i : chars) {
            if (i == ' ') {
                spaceCount++;
            }
        }

        int newLength = chars.length + 2 * spaceCount;
        int newIndex = newLength - 1;

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[newIndex--] = ' ';
                chars[newIndex--] = ' ';
                chars[newIndex--] = ' ';
            } else {
                chars[newIndex--] = chars[i];
            }
        }


        System.out.println("Массив после замены:" + Arrays.toString(chars) + "и его длинна равнв = " + chars.length);
    }
}