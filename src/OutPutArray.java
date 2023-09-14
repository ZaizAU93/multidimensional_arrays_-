public class OutPutArray {
    public int k, p;
    public int[][] array;

    public void ñonsoleOutput(int k, int p, int[][] array) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
