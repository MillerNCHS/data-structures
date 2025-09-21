import java.util.Stack;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    


    private static class Pair {
        int row, col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }
    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int startRow, int startCol)
    {
        Stack<Pair> stack = new Stack<>();
        int fillValue = 1;

        stack.push(new Pair(startRow, startCol));

        while (!stack.isEmpty()) {
            Pair current = stack.pop();
            int row = current.row;
            int col = current.col;

            if (row < 0 || row >= SIZE || col < 0 || col >= SIZE) {
                continue;
            }

            if (pixels[row][col] != 0) {
                continue;
            }

            pixels[row][col] = fillValue;
            fillValue++;

            stack.push(new Pair(row - 1, col)); // North
            stack.push(new Pair(row, col + 1)); // East
            stack.push(new Pair(row + 1, col)); // South
            stack.push(new Pair(row, col - 1)); // West
        }
    }
    

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
