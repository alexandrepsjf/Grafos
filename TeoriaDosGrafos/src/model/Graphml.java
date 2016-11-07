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
public class Graphml {
    private List<Graph> graphml;
private String xmlns = "<? Xml version = \"1.0\" encoding = \"UTF-8\"?>\n";
    public List<Graph> getGraphml() {
        return graphml;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public void setGraphml(List<Graph> graphml) {
        this.graphml = graphml;
    }

    public Graphml() {
        this.graphml = new ArrayList<Graph>();
    }
    public void addGrafo( Graph grafo){
        graphml.add(grafo);
    }
    public Graph getGrafo( int index){
    return this.graphml.get(index);}
    }

