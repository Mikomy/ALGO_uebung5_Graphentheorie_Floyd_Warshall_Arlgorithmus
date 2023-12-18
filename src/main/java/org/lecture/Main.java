package org.lecture;

import org.lecture.algorithm.FloydWarshall;

import org.lecture.algorithm.Algorithm;
import org.lecture.weightedDirectedGraph.WeightedDirectedGraph;


public class Main {
    public static void main(String[] args) {

        try {
            // Create an instance of WeightedDirectedGraph class
            int vertices = 4;
            WeightedDirectedGraph graph = new WeightedDirectedGraph(vertices);
            graph.addEdge(1, 2, 10);
            graph.addEdge(1, 3, 3);
            graph.addEdge(2, 4, 4);
            graph.addEdge(3, 2, 2);
            graph.addEdge(3, 4, 5);

            graph.printGraph();

            Algorithm algo = new FloydWarshall();
            algo.floydWarshall(graph);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}