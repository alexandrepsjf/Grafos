/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Kruskal {

    public  void imprimeKruskal(Graph inicial) {

        Graph resultado = new Graph();
        Edge arestaAux = new Edge();
        
        for (int i = 0; i < inicial.getEdge().size(); i++) {
            //busca aresta com menor peso ainda nao verificado no grafo inicial
            arestaAux = inicial.menorPeso();
            //se tal aresta nao formar um ciclo ao ser adicionada, ela eh adicionada a arvore de Kruskal
            if (!resultado.temCiclo(arestaAux)) {
                resultado.addAresta(arestaAux);
            }
        }

        //resultado.imprimeArvore();
        //break;
    }
}
    
