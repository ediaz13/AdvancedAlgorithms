public class App {
    private static int[][] adjacencyMatrix = {
            {0, 2, 4, 0},
            {0, 0, 0, 3},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
    };

    public static void main(String[] args) {

        //Find all edges
        for (int i = 0; i < adjacencyMatrix.length; i++) {
            for (int j= 0; j < adjacencyMatrix.length; j++){
                if (adjacencyMatrix[i][j] != 0) {
                    System.out.println("Edge with weight: " + adjacencyMatrix[i][j]);
                }
            }
        }

        //If you know the vertices then the lookup is O(1) (Ordo constant) quite fast
        //Is there a connection between node A and node C
        System.out.println(adjacencyMatrix[0][2]);

        //Adjacency list representation
        Vertex a = new Vertex("A");
        Vertex b = new Vertex("B");
        Vertex c = new Vertex("C");
        Vertex d = new Vertex("D");


        a.addNeighbor(c);
        a.addNeighbor(b);
        b.addNeighbor(d);

        a.showNeighbors();
        b.showNeighbors();
        c.showNeighbors();
        d.showNeighbors();
    }
}
