/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.ListaProdutos;

/**
 *
 * @author Mateu
 */
public class ListaProdutosDAO {
    public static List<ListaProdutos> obterListaProdutos() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<ListaProdutos> listaProdutos = new ArrayList<ListaProdutos>();

        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select*from ListaProdutos");
            while (rs.next()) {
                ListaProdutos listaProduto = new ListaProdutos(rs.getInt("ID"),rs.getInt("QUANTIDADE"), null, 0,rs.getInt("OBS"), null, 0);
                listaProduto.setIdPedido(rs.getInt("PEDIDO_ID"));
                listaProduto.setIdProduto(rs.getInt("PRODUTO_ID"));
                listaProdutos.add(listaProduto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);
        }
        return listaProdutos;
    }

    public static void fecharConexao(Connection conexao, Statement comando) {
        try {
            if (comando != null) {
                comando.close();
            }
            if (conexao != null) {
                conexao.close();
            }
        } catch (SQLException e) {

        }
    }
}

