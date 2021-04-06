package Graphs;

public class Edge {
    public int src; // Source node
    public int dest; // Destination node
    public int weight; // Weight between these nodes

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}
