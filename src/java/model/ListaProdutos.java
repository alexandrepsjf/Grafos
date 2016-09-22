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
public class ListaProdutos {

    public static void add(List<ListaProdutos> listaProdutos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int quantitade;
    private String obs;

    public ListaProdutos(int aInt, int aInt0, Object object, int i, int aInt1, Object object0, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getQuantitade() {
        return quantitade;
    }

    public void setQuantitade(int quantitade) {
        this.quantitade = quantitade;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public void setIdPedido(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdProduto(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public static List<ListaProdutos> obterListaProdutos() throws ClassNotFoundException, SQLException {
        return ListaProdutos.obterListaProdutos();
    }
}
