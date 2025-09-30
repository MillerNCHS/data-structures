import java.util.LinkedList;
import java.util.Queue;

public class Grid {
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];

    /**
     * Flood fill, starting with the given row and column.
     */
    public void floodfill(int startRow, int startCol) {
        Queue<Pair> queue = new LinkedList<>();
        int fillValue = 1;

        queue.add(new Pair(startRow, startCol));

        while (!queue.isEmpty()) {
            Pair current = queue.remove();
            int row = current.getRow();
            int col = current.getColumn();

            // Bounds check
            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                continue;
            }

            // Already filled
            if (pixels[row][col] != 0) {
                continue;
            }

            // Fill pixel
            pixels[row][col] = fillValue++;
            
            // Enqueue neighbors in N, E, S, W order
            queue.add(new Pair(row - 1, col)); // North
            queue.add(new Pair(row, col + 1)); // East
            queue.add(new Pair(row + 1, col)); // South
            queue.add(new Pair(row, col - 1)); // West
        }
    }

    @Override
    public String toString() {
        String r = "";
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                r = r + String.format("%4d", pixels[i][j]);
            }
            r = r + "\n";
        }
        return r;
    }
}
