package org.lecture.weightedDirectedGraph;

import java.util.ArrayList;

public class WeightedDirectedGraph {
    /**
     * []: This denotes an array that holds elements of the type ArrayList<Edge>.
     * The [] signifies that this is an array-type variable.
     * <p>
     * <p>
     * adjacencyList: This is the variable name,and
     * it holds an array of ArrayList<Edge> elements.
     * So, adjacencyList is an array, and each element of the array is
     * an ArrayList<Edge>
     */
    ArrayList<Edge>[] adjacencyList;
    int vertices;

    public WeightedDirectedGraph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new ArrayList<Edge>();
        }
    }

    public void addEdge(int fromNode, int toNode, int weight) {
        Edge edge = new Edge(fromNode, toNode, weight);
        adjacencyList[fromNode].add(edge);
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            ArrayList<Edge> list = adjacencyList[i];
            for (int j = 0; j < list.size(); j++) {
                System.out.println("Knote-" + i + " --" + list.get(j).weight + "--> " + "Knote-" + list.get(j).toNode);
            }
        }
    }
}
