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

    public Disciplina(String nome, String ano, String periodo) {
        this.nome = nome;
        this.ano = ano;
        this.periodo = periodo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

   

}
