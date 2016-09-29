/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Alexandre
 */
public class Disciplina {
private String nome;
    private String ano;
    private String periodo;
    public Disciplina() {
    }

    public String getNome() {
        return nome;
    }

    public Disciplina(String ano, String periodo) {
        this.ano = ano;
        this.periodo = periodo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setNome(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
