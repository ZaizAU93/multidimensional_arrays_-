public class Islands {
    public  int countIslands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    markIsland(grid, i, j, m, n);
                }
            }
        }

        return count;
    }

    public  void markIsland(int[][] grid, int i, int j, int m, int n) {
        if (i < 0 || i >= m || j < 0 || j >= n || grid[i][j] != 1) return;

        grid[i][j] = -1;

        markIsland(grid, i - 1, j, m, n);
        markIsland(grid, i + 1, j, m, n);
        markIsland(grid, i, j - 1, m, n);
        markIsland(grid, i, j + 1, m, n);
    }
}
