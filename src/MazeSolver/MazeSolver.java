package MazeSolver;

public class MazeSolver {

    private int startRow;
    private int startCol;
    private int [][] maze;
    private boolean[][] visited;

    public MazeSolver(int[][] maze, int startRow, int startCol) {
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startRow = startRow;
        this.startCol = startCol;
    }



    public void findWay() {
        if (dfs(startRow, startCol))
            System.out.println("Solution exists...");
        else
            System.out.println("Solution doesn't exists...");
    }



    public boolean isFeasible(int row, int col) {
        //We check the vertical dimension
        if (row < 0 || row > maze.length - 1)
            return false;

        //We check the horizontal dimension
        if (col < 0 || col > maze.length - 1)
            return false;

        //When we have already considered that state
        if (visited[row][col])
            return false;

        //There is a obstacle in the way
        if (maze[row][col] == 1)
            return false;

        return true;
    }

    private boolean dfs(int row, int column) {
        // Base case
        if (row==maze.length - 1 && column == maze.length -1)
            return true;

        if (isFeasible(row, column)) {
            visited[row][column] = true;
            // Then we have to visit the next cells (U, D, L R)
            // Going Down
            if (dfs(row + 1, column))
                return true;
            // Going Up
            if (dfs(row - 1, column))
                return true;
            // Going Right
            if (dfs(row, column + 1))
                return true;
            // Going Left
            if (dfs(row, column - 1))
                return true;

            //Backtrack
            visited[row][column] = false;
            return false;
        }

        return false;
    }

}
