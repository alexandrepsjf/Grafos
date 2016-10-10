/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Alexandre
 */
public class Edge {
    Node node1;
    Node node2; 
    String nome;

    public Edge(Node node1, Node node2) {
        this.node1 = node1;
        this.node2 = node2;
       this.nome=(String)( node1.getId()+ node2.getId());
    }

    public Edge() {
    }
    
    

    public Node getNode1() {
        return node1;
    }

    public void setNode1(Node node1) {
        this.node1 = node1;
    }

    public Node getNode2() {
        return node2;
    }

    public void setNode2(Node node2) {
        this.node2 = node2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
