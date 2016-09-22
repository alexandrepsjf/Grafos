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
public class Email {
    private int id;
    private String email;
    private String senha;
    private String autentica;
    private String servidorSaida;
    private String servidorEntrada;

    public Email(int id, String email, String senha, String autentica, String servidorSaida, String servidorEntrada) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.autentica = autentica;
        this.servidorSaida = servidorSaida;
        this.servidorEntrada = servidorEntrada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getAutentica() {
        return autentica;
    }

    public void setAutentica(String autentica) {
        this.autentica = autentica;
    }

    public String getServidorSaida() {
        return servidorSaida;
    }

    public void setServidorSaida(String servidorSaida) {
        this.servidorSaida = servidorSaida;
    }

    public String getServidorEntrada() {
        return servidorEntrada;
    }

    public void setServidorEntrada(String servidorEntrada) {
        this.servidorEntrada = servidorEntrada;
    }
    
    
}
