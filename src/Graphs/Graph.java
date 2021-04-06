package Graphs;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.*;

/**
 * Implementation of a Graph using an adjacency list approach
 * source - https://www.softwaretestinghelp.com/java-graph-tutorial/
 */
public class Graph {
    private List<List<Node>> adjList = new ArrayList<>();

    static class Node {
        int value; // value of the node (this could be A,B,C etc or 1,2,3
        int weight; // weight of edge connecting node

        Node(int value, int weight) {
            this.value = value;
            this.weight = weight;
        }

    }

    // Constructor
    public Graph(List<Edge> edges) {

        // mem allocation for adjacency list
        // edges represent the size of the graph - allocation mem for the size of the graph
        for (int i = 0; i < edges.size(); i++){
            adjList.add(i, new ArrayList<>());
        }

        // add edges to the graph
        for (Edge e: edges){
            adjList.get(e.src).add(new Node(e.dest, e.weight));
        }
    }

    // This is the recursive method
    private void dfsHelper(Node node, boolean visited[]) {
        // predef nodeVal
        int nodeVal;
        // we have visited this node
        visited[node.value] = true;

        // need to find all of the children nodes
        List<Node> childrenNodes = adjList.get(node.value);

        // Print to screen
        System.out.println(node.value + "->");
        for(Node currNode: childrenNodes){
            nodeVal = currNode.value;
            if(!visited[nodeVal]) {
                dfsHelper(currNode, visited);
            }
        }
    }

    public void dfs(Node rootNode) {
        boolean visited[] = new boolean[adjList.size()];

        dfsHelper(rootNode, visited);
    }

    public static void printGraph(Graph graph){
        int srcVertex = 0;
        int listSize = graph.adjList.size();

        System.out.println("Contents of the graph");

        System.out.println("The contents of the graph:");
        while (srcVertex < listSize) {
            //traverse through the adjacency list and print the edges
            for (Node edge : graph.adjList.get(srcVertex)) {
                System.out.print("Vertex:" + srcVertex + " ==> " + edge.value +
                        " (" + edge.weight + ")\t");
            }

            System.out.println();
            srcVertex++;
        }
    }

}

