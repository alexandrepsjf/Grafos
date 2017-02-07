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
    private boolean hasCycle = false;
    public Graph() {
    }

    public boolean isHasCycle() {
        return hasCycle;
    }

    public void setHasCycle(boolean hasCycle) {
        this.hasCycle = hasCycle;
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
        String conjunto, no = "", arestas = "";
        for (Node vertice : graph.getNodes()) {
            no += vertice.getId() + " --> ";
        }
        for (Edge aresta : graph.getEdge()) {
            arestas += aresta.getId() + " --> ";
        }
        conjunto = "Vértices \n" + no + "\n Arestas \n" + arestas;
        return conjunto;
    }

    public String grauNo(Graph graph, String selected) {
        String grauTotal = "";
        for (Edge aresta : graph.getEdge()) {
            aresta.getNode1().grau = 0;
            aresta.getNode2().grau = 0;
        }
        for (Edge aresta : graph.getEdge()) {
            aresta.getNode1().grau += 1;
            aresta.getNode2().grau += 1;
        }
        if (selected.isEmpty()) {
            for (Node no : graph.getNodes()) {

                grauTotal += "\n Grau Vertice " + no.getId() + " é " + no.getGrau();

            }
        } else {
            for (Node no : graph.getNodes()) {
                if (no.getId().equals(selected)) {
                    grauTotal = " Grau Vertice " + no.getId() + " é " + no.getGrau();
                }
            }
        }
        return grauTotal;
    }
      // Retorna a aresta a apartir dos v�rtices de origem e destino
     public Edge encontrarAresta(Node origem, Node destino){
    	 for (int i = 0; i < this.edge.size() ; i++){
    		 if (edge.get(i).getNode1().equals(origem) && edge.get(i).getNode2().equals(destino))
    			 return edge.get(i);
    	 }
    	 return null;
     }

     public Edge menorPeso() {
        int j;

        for (j = 0; j < graph.getEdge().size(); j++) {
            if ((graph.getEdge().get(j).isVisitado() == false)) {
                graph.getEdge().get(j).setVisitado(true);

                for (int i = (j + 1); i < graph.getEdge().size(); i++) {

                    if ((graph.getEdge().get(i).isVisitado() == false)
                            && (graph.getEdge().get(j).getWeight() > graph.getEdge().get(i).getWeight())) {

                        graph.getEdge().get(j).setVisitado(false);
                        j = i;
                        graph.getEdge().get(j).setVisitado(true);
                    }
                }
                
                break;
            }
        }

        return graph.getEdge().get(j);
    }



public boolean temCiclo(Edge aresta){
		
		Node anterior = aresta.getNode2();
		
		for(int j=0; j<this.getEdge().size() ;j++){
			
			for(int i=0; i<this.getEdge().size() ;i++){
				
				if ((aresta==this.getEdge().get(i))&&(this.getEdge().get(i).isVisitado()==false))
					this.getEdge().get(i).setVisitado(true);
				else if (aresta!=this.getEdge().get(i)){
					
					if (anterior.equals(this.getEdge().get(i).getNode1())){
						
						if	(aresta.getNode1().equals(this.getEdge().get(i).getNode2())){
							this.limparArestaVisitada();
							this.hasCycle = true;
							return true;
						}else{
							anterior = this.getEdge().get(i).getNode2();
							this.getEdge().get(i).setVisitado(true);
						}	
						
					}else if (anterior.equals(this.getEdge().get(i).getNode2())){
						
						if	(aresta.getNode1().equals(this.getEdge().get(i).getNode1())){
							this.limparArestaVisitada();
							this.hasCycle = true;
							return true;
						}else{
							anterior = this.getEdge().get(i).getNode1();
							this.getEdge().get(i).setVisitado(true);
						}
					}
				}
			}
		}
		this.limparArestaVisitada();
		this.hasCycle = false;
		return false;
	}
public void limparArestaVisitada(){
		for(int i=0; i<this.getEdge().size() ;i++)
			this.getEdge().get(i).setVisitado(false);
	}



}