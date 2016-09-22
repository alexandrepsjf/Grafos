/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Sujajeb
 */
public class Telefone {

    private int id;
    private String telefone;
    private Cliente cliente ;
    private int idCliente;

    public Telefone(int id, String telefone, Cliente cliente, int idCliente) {
        this.id = id;
        this.telefone = telefone;
        this.cliente = cliente;
        this.idCliente = idCliente;
    }

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public static List<Telefone> obterTelefone() throws ClassNotFoundException, SQLException {
        return Telefone.obterTelefone();
    }

}
