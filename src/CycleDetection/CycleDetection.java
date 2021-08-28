package CycleDetection;

import java.util.List;

public class CycleDetection {

    public void detectCycle (List<Vertex> graph) {
        //There are multiple independent clusters
        for (Vertex v : graph) {
            if (!v.isVisited()) {
                dfs(v);
            }
        }
    }

    private void dfs (Vertex vertex) {
        vertex.setVisited(true);
        for (Vertex v : vertex.getNeighbors()) {
            if (v.isBeingVisited()) {
                System.out.println("Backward edge ... there is a cycle");
                return;
            }
            if (!v.isVisited()) {
                v.setVisited(true);
                dfs(v);
            }
            vertex.setBeingVisited(false);
            vertex.setVisited(true);
        }
    }
}
