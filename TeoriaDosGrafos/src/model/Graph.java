/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Graph {

    private String id, edgedefault;
    private List<Node> nodes = new ArrayList<Node>();
    private List<Edge> edge = new ArrayList<Edge>();

    public Graph() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdgedefault() {
        return edgedefault;
    }

    public void setEdgedefault(String edgedefault) {
        this.edgedefault = edgedefault;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> getEdge() {
        return edge;
    }

    public void setEdge(List<Edge> edge) {
        this.edge = edge;
    }

    public void addAresta(Edge aresta) {
        this.edge.add(aresta);
    }

    public String matrizAdjacencia(Graph graph) {
        String espaco = " ";
        int size = graph.nodes.size(), i, j;
        int matriz[][] = new int[size][size];
        String matrizTotal = "";
        for (Edge aresta : graph.getEdge()) {
            int no1 = graph.getNodes().indexOf(aresta.getNode1());
            int no2 = graph.getNodes().indexOf(aresta.getNode2());
            matriz[no1][no2] = 1;
            matriz[no2][no1] = 1;
        }
        for (int a = 0; a < size; a++) {
            matrizTotal += espaco + graph.getNodes().get(a).getId();
        }
        for (i = 0; i < size; i++) {
            matrizTotal += "\n" + graph.getNodes().get(i).getId();
            for (j = 0; j < size; j++) {
                matrizTotal += espaco + matriz[i][j];
            }
        }
        return ("\n\n " + matrizTotal);
    }

    public String listaAdjacencia(Graph graph) {
        String lista = "";
        int size = graph.nodes.size(), i, j;
        int matriz[][] = new int[size][size];
        for (Edge aresta : graph.getEdge()) {
            int no1 = graph.getNodes().indexOf(aresta.getNode1());
            int no2 = graph.getNodes().indexOf(aresta.getNode2());
            matriz[no1][no2] = 1;
            matriz[no2][no1] = 1;
        }
        for (i = 0; i < size; i++) {
            lista += "\n" + graph.getNodes().get(i).getId();
            for (j = 0; j < size; j++) {
                if (matriz[i][j] == 1) {
                    lista += " -->" + graph.getNodes().get(j).getId();
                }
            }
        }
        return lista;
    }
}
