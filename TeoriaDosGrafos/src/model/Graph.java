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
    public void addAresta( Edge aresta){
        this.edge.add(aresta);
    }
    
}
