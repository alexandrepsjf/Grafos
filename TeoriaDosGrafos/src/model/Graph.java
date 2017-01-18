/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Graph {

    private String id, edgedefault;
    private ArrayList<Node> nodes = new ArrayList<Node>();
    private ArrayList<Edge> edge = new ArrayList<>();

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

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public void setNodes(ArrayList<Node> nodes) {
        this.nodes = (nodes);
    }

    public ArrayList<Edge> getEdge() {
        return edge;
    }

    public void setEdge(ArrayList<Edge> edge) {
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
        return ("\n\n\n " + matrizTotal);
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
                    lista += " ->" + graph.getNodes().get(j).getId();
                }
                lista+=";";
            }
            
        }
        return lista;
    }

    public String matrizIncidencia(Graph graph) {
        String incidencia = " ";
        String espaco = " ";
        int index = 0, i, j;
        int size1 = graph.getNodes().size();
        int size2 = graph.getEdge().size();
        int matriz[][] = new int[size1][size2];
        for (Edge aresta : graph.getEdge()) {
            int no1 = graph.getNodes().indexOf(aresta.getNode1());
            int no2 = graph.getNodes().indexOf(aresta.getNode2());
            matriz[no1][index] = 1;
            matriz[no2][index] = 1;
            index++;
        }
        for (int a = 0; a < size2; a++) {
            incidencia += espaco + graph.getEdge().get(a).getId();
        }
        for (i = 0; i < size1; i++) {
            incidencia += "\n" + graph.getNodes().get(i).getId();
            for (j = 0; j < size2; j++) {
                incidencia += espaco + espaco + matriz[i][j];
            }
        }
        return incidencia;

    }

    public String conjunto(Graph graph) {
        String conjunto , no = "", arestas = "";
        for (Node vertice : graph.getNodes()) {
            no += vertice.getId() + " --> ";
        }
        for (Edge aresta : graph.getEdge()) {
            arestas += aresta.getId() + " --> ";
        }
        conjunto = "Vértices \n" + no + "\n Arestas \n" + arestas;
        return conjunto;
    }
    public String grauNo(Graph graph, String selected){
        String grauTotal="";
        for (Edge aresta : graph.getEdge()) {
            aresta.getNode1().grau=0;
            aresta.getNode2().grau=0;
        }
        for (Edge aresta : graph.getEdge()) {
            aresta.getNode1().grau+=1;
            aresta.getNode2().grau+=1;
        }
        if(selected.isEmpty()){
        
         for (Node no : graph.getNodes()) {
               
                    grauTotal = "\n Grau Vertice " + no.getId() + " é " + no.getGrau();
                
            }}else{
             for (Node no : graph.getNodes()) {
                if (no.getId().equals(selected)) {
                    grauTotal = " Grau Vertice " + no.getId() + " é " + no.getGrau();
                }
            }
        }
        return grauTotal;
}
}
