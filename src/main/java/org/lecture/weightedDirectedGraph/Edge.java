package org.lecture.weightedDirectedGraph;

public class Edge {
    int fromNode;
    int toNode;
    int weight;

    public Edge(int fromNode, int toNode, int weight) {
        this.fromNode = fromNode;
        this.toNode = toNode;
        this.weight = weight;
    }
}
