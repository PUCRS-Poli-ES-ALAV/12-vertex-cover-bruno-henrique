import java.util.*;

class Node {
    int id;
    List<Edge> outgoingEdges;

    public Node(int id) {
        this.id = id;
        this.outgoingEdges = new ArrayList<>();
    }
}

class Edge {
    Node source;
    Node destination;

    public Edge(Node source, Node destination) {
        this.source = source;
        this.destination = destination;
    }
}

class Graph {
    List<Node> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(Node source, Node destination) {
        Edge edge = new Edge(source, destination);
        source.outgoingEdges.add(edge);
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação do grafo
        Graph graph = new Graph();

        // Criação dos nós
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        // Adição dos nós ao grafo
        graph.addNode(node1);
        graph.addNode(node2);
        graph.addNode(node3);
        graph.addNode(node4);
        graph.addNode(node5);
        graph.addNode(node6);
        graph.addNode(node7);

        // Adição das arestas
        graph.addEdge(node1, node2);
        graph.addEdge(node2, node3);
        graph.addEdge(node3, node4);
        graph.addEdge(node4, node5);
        graph.addEdge(node5, node6);
        graph.addEdge(node6, node7);
        graph.addEdge(node7, node1);

        // Exemplo de percorrimento dos nós e arestas
        for (Node node : graph.nodes) {
            System.out.println("Node " + node.id + " has outgoing edges to:");
            for (Edge edge : node.outgoingEdges) {
                System.out.println(" - Node " + edge.destination.id);
            }
            System.out.println();
        }
    }
}
