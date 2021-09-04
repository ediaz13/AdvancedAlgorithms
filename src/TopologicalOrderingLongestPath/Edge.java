package TopologicalOrderingLongestPath;

public class Edge {
    private Vertex target;
    private int weight;

    public Edge(Vertex target, int wight) {
        this.target = target;
        this.weight = wight;
    }

    public Vertex getTarget() {
        return target;
    }

    public int getWeight() {
        return weight;
    }

}
