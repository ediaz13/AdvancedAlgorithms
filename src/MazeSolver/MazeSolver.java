package MazeSolver;

public class MazeSolver {

    private int startRow;
    private int startCol;
    private int [][] maze;
    private boolean[][] visited;

    public MazeSolver(int startRow, int startCol, int[][] maze, boolean[][] visited) {
        this.maze = maze;
        this.visited = new boolean[maze.length][maze.length];
        this.startRow = startRow;
        this.startCol = startCol;
    }
}
