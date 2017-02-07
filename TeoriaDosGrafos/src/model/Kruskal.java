package model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.Tela;

public class Kruskal {

    public Graph imprimeKruskal(Graph inicial) {

        Graph resultado = new Graph();
        Edge arestaAux = new Edge();
        int j=0;
        
        for (int i = 0; i < inicial.getEdge().size(); i++) {
            //busca aresta com menor peso ainda nao verificado no grafo inicial
            arestaAux = inicial.menorPeso();
            inicial.getEdge().remove(arestaAux);
            //se tal aresta nao formar um ciclo ao ser adicionada, ela eh adicionada a arvore de Kruskal
            if (!resultado.temCiclo(arestaAux)) {
                resultado.addAresta(arestaAux);
            }
        }

        return resultado;
        //break;
    }

    public void gerarImagem(Graph graph) {
        String adjacenciaTotal = "digraph G {";
        for (Edge a : graph.getEdge()) {
            adjacenciaTotal += a.getSource() + " -> " + a.getTarget() + "[label=" + a.getWeight() + "];\n";

        }
//        adjacenciaTotal += graph.listaAdjacencia(graph);
        adjacenciaTotal += "}";

        Process p;
        File arquivo = new File("src\\os\\dot\\file.dot");
        try (FileWriter fw = new FileWriter(arquivo)) {
            fw.write(adjacenciaTotal);
            fw.flush();
            String commandLine = "release\\bin\\dot -Tpng " + arquivo.getCanonicalPath() + " -o src\\os\\img\\file.png";
            p = Runtime.getRuntime().exec(commandLine);
            while (p.isAlive()) {
            }

            File arqImg = new File("src\\os\\img\\file.png");
            ImageIcon image = new ImageIcon(arqImg.getCanonicalPath());
            image.getImage().flush();

            //JOptionPane.showMessageDialog(null, null, "Imagem do grafo", 0, image);
        } catch (IOException ex) {
            System.out.println("Erro do Executar Comando: " + ex.getMessage());
        }
        //return ImageIcon image = new ImageIcon(arqImg.getCanonicalPath());
    }
}
