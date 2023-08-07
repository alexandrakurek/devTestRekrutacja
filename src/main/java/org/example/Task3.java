package org.example;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read the number of pairs (n) from the first line of input
        int n = scanner.nextInt();

        // Create an adjacency list to represent the graph
        Map<Integer, List<Integer>> graph = new HashMap<>();

        // Read n pairs of positive integers and build the adjacency list
        for (int i = 0; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            graph.putIfAbsent(u, new ArrayList<>());
            graph.putIfAbsent(v, new ArrayList<>());

            graph.get(u).add(v);
            graph.get(v).add(u); // If the graph is undirected
        }
// Perform DFS to count separated graphs
        int numSeparatedGraphs = countSeparatedGraphs(graph);

        // Print the result
        System.out.println(numSeparatedGraphs);
    }

    private static int countSeparatedGraphs(Map<Integer, List<Integer>> graph) {
        int numSeparatedGraphs = 0;
        Set<Integer> visited = new HashSet<>();

        for (int vertex : graph.keySet()) {
            if (!visited.contains(vertex)) {
                numSeparatedGraphs++;
                dfs(vertex, graph, visited);
            }
        }

        return numSeparatedGraphs;
    }

    private static void dfs(int vertex, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        visited.add(vertex);
        List<Integer> neighbors = graph.get(vertex);
        for (int neighbor : neighbors) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited);
            }
        }

    }


}

