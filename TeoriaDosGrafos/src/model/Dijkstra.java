package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dijkstra {

    // assumes Nodes are numbered 0, 1, ... n and that the source Node is 0
    public static ArrayList<Node> findShortestPath(Graph graph,Node source, Node target) {
        Node[] nodes = new Node[graph.getNodes().size()];
        Edge[] edges = new Edge[graph.getEdge().size()];
        int y = 0, k = 0;
        for (Node n : graph.getNodes()) {
            nodes[y] = n;
            y++;
        }
        for (Edge e : graph.getEdge()) {
            edges[k] = e;
            k++;
        }
        int[][] Weight = initializeWeight(nodes, edges);
        int[] D = new int[nodes.length];
        Node[] P = new Node[nodes.length];
        ArrayList<Node> C = new ArrayList<Node>();

        // initialize:
        // (C)andidate set,
        // (D)yjkstra special path length, and
        // (P)revious Node along shortest path
        for (int i = 0; i < nodes.length; i++) {
            C.add(nodes[i]);
            D[i] = Weight[0][i];
            if (D[i] != Integer.MAX_VALUE) {
                P[i] = nodes[0];
            }
        }

        // crawl the graph
        for (int i = 0; i < nodes.length - 1; i++) {
            // find the lightest Edge among the candidates
            int l = Integer.MAX_VALUE;
            Node n = nodes[0];
            for (Node j : C) {
                if (D[j.getDistancia()] < l) {
                    n = j;
                    l = D[j.getDistancia()];
                }
            }
            C.remove(n);

            // see if any Edges from this Node yield a shorter path than from source->that Node
            for (int j = 0; j < nodes.length - 1; j++) {
                if (D[n.getDistancia()] != Integer.MAX_VALUE && Weight[n.getDistancia()][j] != Integer.MAX_VALUE && D[n.getDistancia()] + Weight[n.getDistancia()][j] < D[j]) {
                    // found one, update the path
                    D[j] = D[n.getDistancia()] + Weight[n.getDistancia()][j];
                    P[j] = n;
                }
            }
        }
        // we have our path. reuse C as the result list
        C.clear();
        Node loc = target;
        C.add(target);
        // backtrack from the target by P(revious), adding to the result list
        while (P[loc.getDistancia()] != nodes[0]) {
            if (P[loc.getDistancia()] == null) {
                // looks like there's no path from source to target
                return null;
            }
            C.add(0, P[loc.getDistancia()]);
            loc = P[loc.getDistancia()];
        }
        C.add(0, nodes[0]);
        return C;
    }

    static private int[][] initializeWeight(Node[] nodes, Edge[] edges) {
        int[][] Weight = new int[nodes.length][nodes.length];
        for (int i = 0; i < nodes.length; i++) {
            Arrays.fill(Weight[i], Integer.MAX_VALUE);
        }
        for (Edge e : edges) {
            Weight[e.node1.getDistancia()][e.node2.getDistancia()] = e.weight;
        }
        return Weight;
    }
}
