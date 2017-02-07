/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CaminhoMinimo {

    List<Node> menorCaminho = new ArrayList<Node>(); // Lista dos vertices pertencentes ao menor caminho
    Node caminho = new Node();   // Recebe o vertices de menor caminho
    Node atual = new Node();    // Guarda o vertice que esta sendo visitado
    Node vizinho = new Node();   // Marca o vizinho do vertice atualmente visitado
    List<Node> naoVisitados = new ArrayList<Node>(); // Lista dos vertices que ainda nao foram visitados
    int trocarLinha = 10;                       // Valor para acrescentar a cada mudan�a de linha do caminho 

    /*
     * Algoritmo de Dijkstra Modificado
     */
    public List<Node> encontrarMenorCaminhoDijkstra(Graph grafo, Node v1, Node v2) {
        // seta todas as arestas dos vertices
        for (Node no : grafo.getNodes()) {
            for (Edge aresta : grafo.getEdge()) {
                if (no.equals(aresta.getNode1())) {
                    no.getArestas().add(aresta);
                }
            }
        }
        // Adiciona a origem na lista do menor caminho
        menorCaminho.add(v1);
        // Colocando a distancias iniciais
        for (int i = 0; i < grafo.getNodes().size(); i++) {
            // Vertice atual tem distancia zero, e todos os outros, 9999("infinita")
            if (grafo.getNodes().get(i).equals(v1)) {
                grafo.getNodes().get(i).setDistancia(0);
                naoVisitados.add(grafo.getNodes().get(i));
            } else {
                grafo.getNodes().get(i).setDistancia(9999);
                grafo.getNodes().get(i).setVisitado(false);
                //Insere o vertice na lista de vertices nao visitados 
                naoVisitados.add(grafo.getNodes().get(i));
            }
        }
        Collections.sort(naoVisitados);
        // O algoritmo continua ate que todos os vertices sejam visitados
        while (!naoVisitados.isEmpty()) {
            // Toma-se sempre o vertice com menor distancia, que eh o primeiro da lista
            atual = naoVisitados.get(0);
            /*
        	 * Para cada vizinho (cada aresta), calcula-se a sua possivel
        	 * distancia, somando a distancia do vertice atual com a da aresta
        	 * correspondente. Se essa distancia for menor que a distancia do
        	 * vizinho, esta eh atualizada.
             */
            for (int i = 0; i < atual.getArestas().size(); i++) {
                vizinho = atual.getArestas().get(i).getNode2();
                if (!vizinho.verificarVisita()) {
                    int distancia = atual.getDistancia() + atual.getArestas().get(i).getWeight();
                    // Regra para acrescentar x na dist�ncia caso seja necess�rio trocar de linha
//        				if (grafo.encontrarAresta(atual.getPai(), atual).getLinha() != grafo.encontrarAresta(atual, vizinho).getLinha())
//        					distancia += trocarLinha;
                    // Comparando a dist�ncia do vizinho com a poss�vel dist�ncia
                    if (vizinho.getDistancia() > distancia) {
                        vizinho.setDistancia(distancia);
                        vizinho.setPai(atual);
                        // Se o vizinho eh o vertice procurado, e foi feita uma mudanca na distancia, a lista com o menor caminho
                        // anterior eh apagada, pois existe um caminho menor vertices pais, ateh o vertice origem.
                        if (vizinho.equals(v2)) {
                            menorCaminho.clear();
                            caminho = vizinho;
                            menorCaminho.add(vizinho);
                            while (caminho.getPai() != null) {
                                menorCaminho.add(caminho.getPai());
                                caminho = caminho.getPai();
                            }
                            // Ordena a lista do menor caminho, para que ele seja exibido da origem ao destino.
                            Collections.sort(menorCaminho);
                        }
                    }
                }
            }
            // Marca o vertice atual como visitado e o retira da lista de nao visitados
            atual.visitar();
            this.naoVisitados.remove(atual);
            // Ordena a lista, para que o vertice com menor distancia fique na primeira posicao
            Collections.sort(naoVisitados);
        }
        return menorCaminho;
    }
}
