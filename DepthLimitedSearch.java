import java.util.Stack;

public class DepthLimitedSearch {

    public void search(Vertex start, int depth) {
        if (depth > 0) {
            System.out.print(start + " ");
            for (Vertex adjacency : start.getAdjacencies()) {
                search(adjacency, depth - 1);
            }
        }
    }

}