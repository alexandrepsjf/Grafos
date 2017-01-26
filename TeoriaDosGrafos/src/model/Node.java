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
public class Node implements Comparable<Node> {

    String id;
    int grau;
    int distancia;
    private boolean visitado = false;
    private Node pai;
    private List<Edge> arestas = new ArrayList<Edge>();

    public int getDistancia() {
        return distancia;
    }

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public Node getPai() {
        return pai;
    }

    public void setPai(Node pai) {
        this.pai = pai;
    }

    public List<Edge> getArestas() {
        return arestas;
    }

    public void setArestas(List<Edge> arestas) {
        this.arestas = arestas;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Node() {
    }

    public String getId() {
        return id;
    }

    public int getGrau() {
        return grau;
    }

    public void setGrau(int grau) {
        this.grau = grau;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Node vertice) {
        if (this.getDistancia() < vertice.getDistancia()) {
            return -1;
        } else if (this.getDistancia() == vertice.getDistancia()) {
            return 0;
        }

        return 1;
    }
    public void visitar() {
        this.visitado = true;
    }

    public boolean verificarVisita() {
        return visitado;
    }
}
