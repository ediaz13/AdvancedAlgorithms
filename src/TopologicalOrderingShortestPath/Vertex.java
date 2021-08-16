package TopologicalOrderingShortestPath;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
    private String name;
    private boolean visited;
    //Shortest path from the source vertex to actual
    private int minDistance;
    //The previous node in the shortest path
    private Vertex predecessor;
    private List<Edge> adjacencyList;

    public Vertex(String name) {
        this.name = name;
        this.minDistance = Integer.MAX_VALUE;
        this.adjacencyList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return  name + " - " + predecessor;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public int getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(int minDistance) {
        this.minDistance = minDistance;
    }

    public Vertex getPredecessor() {
        return predecessor;
    }

    public void setPredecessor(Vertex predecessor) {
        this.predecessor = predecessor;
    }

    public List<Edge> getNeighbours() {
        return adjacencyList;
    }

    public void addNeighbour(Edge edge) {
        this.adjacencyList.add(edge);
    }
}
