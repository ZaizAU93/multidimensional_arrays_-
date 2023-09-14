import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner line = new Scanner(System.in);
        Random random = new Random();


        //������ 1:
        //1.1 �������� ��������� ������ � ��������� ��� ���������������� ������� � �������
        //������ Random.
        System.out.println("������� ������������ ���������� �������");
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
        array.�onsoleOutput(n, m, twooMas);

        //1.2 ������� ������������ �������� � ��������� 2-������ �������.
        System.out.println("������������ �������� ������� = " + MaxElem);

        //������ 2:
        //������� �������� n-������ ������(�� 3 �������). ��������� ���������� ����� � ��.

        System.out.println("������� ����������� ��������� 3-������� ������� (m, n, p):");
        n = line.nextInt();
        m = line.nextInt();
        int p = line.nextInt();
        int[][][] arr = new int[n][m][p]; // �������� ��������� 3-������� �������

        int count = 0; // ������� �����

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = count; // ���������� ������ ��������� count
                    count++;
                }
            }
        }

        System.out.println("���������� �����: " + count);

        //������ 3:
        //������� ����� ��������� �� ������� ���������:
        System.out.println("������� �����������  2-������� ������� n:");
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

        array.�onsoleOutput(n, n, twooMas);
        System.out.println("C���� ��������� ������� ��������� = " + sum);

        //������ �� ����� ������� mxn ����
        System.out.println("������� ����������� ����������� �������:");
        n = line.nextInt();
        m = line.nextInt();

        int[][] arr_1 = new int[n][m];

        count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr_1[i][j] = count; // ��������� �������
                count++;
            }
        }
        array.�onsoleOutput(n, m, arr_1);

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

        System.out.println("��������������� ������");
        array.�onsoleOutput(n, m, arr_1);

        count = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr_1[j][i] = count;
                count++;
            }
        }
        System.out.println("��������������� ������");
        array.�onsoleOutput(n, m, arr_1);

        //��� ������ �� �������� � ��������. �������� ��� ������� �� ������������������ �������� '%', '2', '0' .
        // ������� ���������, � ������� ���������� �����, ����� ��� ����������.
        // ������� �������� ����� ������� � ��� ������ ��������, �� ������ �����.

       char[] chars = {'h', 'k', ' ', 'r', ' ', 'l','h', ' ','h', 'k'};

        System.out.println("�������� ������:" + Arrays.toString(chars) + "� ��� ������ ����� = " + chars.length);

        int newLength = chars.length ;
        int newIndex = newLength-1;

        for (int i = 0; i <= chars.length - 1; i++) {
            if (chars[i] == ' ') {
                chars[i] = '%';
                chars[++i] = '2';
                chars[++i] = 'p';
            }
            //else {
              //  chars[i] = chars[i];
            //}
        }


        System.out.println("������ ����� ������:" + Arrays.toString(chars) + "� ��� ������ ����� = " + chars.length);





    // ������� ���
    Battleship battleship = new Battleship();



        System.out.println("Single Ships:");
    int[][] singleShips = battleship.generateSingleShips();
        battleship.printBoard(singleShips);

        System.out.println("Double Ships:");
    int[][] doubleShips = battleship.generateDoubleShips();
        battleship.printBoard(doubleShips);

        System.out.println("Triple Ships:");
    int[][] tripleShips = battleship.generateTripleShips();
        battleship.printBoard(tripleShips);

        System.out.println("All Ships:");
    int[][] allShips = battleship.generateAllShips();
        battleship.printBoard(allShips);
//�������
        Islands is = new Islands();
        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 1, 0, 1},
                {0, 0, 0, 1, 1}
        };

        System.out.println();
        array.�onsoleOutput( grid.length,grid[0].length, grid);
        int islandCount = is.countIslands(grid);
        System.out.println("���������� ��������: " + islandCount);


    }
}