/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.BairroDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sujajeb
 */
public class Bairro {

    private int id;
    private String nome;
    private float taxa;

    public Bairro(int id, String nome, float taxa) {
        this.id = id;
        this.nome = nome;
        this.taxa = taxa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setTaxa(float taxa) {
        this.taxa = taxa;
    }

    public float getTaxa() {
        return this.taxa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Bairro> obterBairro() throws ClassNotFoundException, SQLException {
        return BairroDAO.obterBairros();
    }
}
