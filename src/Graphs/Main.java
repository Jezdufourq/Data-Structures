package Graphs;

import java.util.*;

public class Main {



    public static void main (String[] args) {
        // define edges on graph
        // the constructor will accept an array of edges
        // e.g [[0,1,2],[0,2,4]...]
        // in this case [0,1,2]  is representing [0]--2-->[1] the edge of value 2 between the nodes 0 and 1
        List<Edge> edges = Arrays.asList(new Edge(0, 1, 2),new Edge(0, 2, 4),
                new Edge(1, 2, 4),new Edge(2, 0, 5), new Edge(2, 1, 4),
                new Edge(3, 2, 3), new Edge(4, 5, 1),new Edge(5, 4, 3));

        Graph graph = new Graph(edges);

        Graph.printGraph(graph);

    }
}
