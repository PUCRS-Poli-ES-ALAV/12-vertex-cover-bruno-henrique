import java.util.HashSet;
import java.util.Set;

public class Mainn {
    public static void main(String[] args) {
        Set<Edge> C = new HashSet<>();
        Set<Edge> E = new HashSet<>();
        // Adicione as arestas apropriadas ao conjunto E

            E.add(new Edge(1, 2));
            E.add(new Edge(2, 3));
            E.add(new Edge(3, 4));
            E.add(new Edge(4, 5));
            E.add(new Edge(5, 6));
            E.add(new Edge(6, 7));
            E.add(new Edge(7, 1));
            

        Set<Edge> EPrime = new HashSet<>(E);

        while (!EPrime.isEmpty()) {
            Edge chosenEdge = null;
            for (Edge edge : EPrime) {
                chosenEdge = edge;
                break;
            }

            if (chosenEdge != null) {
                int u = chosenEdge.getU();
                int v = chosenEdge.getV();

                C.add(chosenEdge);
                EPrime.remove(chosenEdge);

                Set<Edge> edgesToRemove = new HashSet<>();
                for (Edge edge : EPrime) {
                    if (edge.getU() == u || edge.getV() == v) {
                        edgesToRemove.add(edge);
                    }
                }

                EPrime.removeAll(edgesToRemove);
            }
        }

        // Exibir o conjunto C resultante
        for (Edge edge : C) {
            System.out.println("(" + edge.getU() + ", " + edge.getV() + ")");
        }
    }
}

class Edge {
    private int u;
    private int v;

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }

    public int getU() {
        return u;
    }

    public int getV() {
        return v;
    }
}
