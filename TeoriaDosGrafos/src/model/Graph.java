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
     private List<Node> Vertices = new ArrayList<Node>();
    private List<Edge> Arestas = new ArrayList<Edge>();

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

    public List<Node> getVertices() {
        return Vertices;
    }

    public void setVertices(List<Node> Vertices) {
        this.Vertices = Vertices;
    }

    public List<Edge> getArestas() {
        return Arestas;
    }

    public void setArestas(List<Edge> Arestas) {
        this.Arestas = Arestas;
    }
    public void addAresta( Edge aresta){
        this.Arestas.add(aresta);
    }
    
}
