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
    }


}

