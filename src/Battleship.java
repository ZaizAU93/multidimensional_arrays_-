import java.util.Random;

public class Battleship {
    private static final int SIZE = 10;
    private static final int EMPTY = 0;
    private static final int SHIP = 1;

    private int[][] board;

    public Battleship() {
        board = new int[SIZE][SIZE];
    }

    public int[][] generateSingleShips() {
        int[][] singleShips = new int[SIZE][SIZE];
        int count = 0;

        Random random = new Random();

        while (count < 10) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);

            if (singleShips[row][col] == EMPTY) {
                singleShips[row][col] = SHIP;
                count++;
            }
        }

        return singleShips;
    }

    public int[][] generateDoubleShips() {
        int[][] doubleShips = new int[SIZE][SIZE];
        int count = 0;

        Random random = new Random();

        while (count < 10) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);

            if (row + 1 < SIZE && doubleShips[row][col] == EMPTY && doubleShips[row + 1][col] == EMPTY) {
                doubleShips[row][col] = SHIP;
                doubleShips[row + 1][col] = SHIP;
                count++;
            }
        }

        return doubleShips;
    }

    public int[][] generateTripleShips() {
        int[][] tripleShips = new int[SIZE][SIZE];
        int count = 0;

        Random random = new Random();

        while (count < 5) {
            int row = random.nextInt(SIZE);
            int col = random.nextInt(SIZE);

            if (row + 2 < SIZE && tripleShips[row][col] == EMPTY && tripleShips[row + 1][col] == EMPTY && tripleShips[row + 2][col] == EMPTY) {
                tripleShips[row][col] = SHIP;
                tripleShips[row + 1][col] = SHIP;
                tripleShips[row + 2][col] = SHIP;
                count++;
            }
        }

        return tripleShips;
    }

    public int[][] generateAllShips() {
        int[][] allShips = new int[SIZE][SIZE];

        allShips = generateSingleShips();
        int[][] doubleShips = generateDoubleShips();
        int[][] tripleShips = generateTripleShips();

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (doubleShips[row][col] == SHIP) {
                    allShips[row][col] = SHIP;
                }

                if (tripleShips[row][col] == SHIP) {
                    allShips[row][col] = SHIP;
                }
            }
        }

        return allShips;
    }

    public void printBoard(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
