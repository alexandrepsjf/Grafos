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
import java.util.List;
import java.util.ArrayList;
import model.Telefone;

public class TelefoneDAO {

    public static List<Telefone> obterTelefone() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<Telefone> telefones = new ArrayList<Telefone>();

        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select*from telefone");
            while (rs.next()) {
                Telefone telefone = new Telefone(rs.getInt("ID"),
                        rs.getString("TELEFONE"), null, 0);
                telefone.setIdCliente(rs.getInt("CLIENTE_ID"));
                telefones.add(telefone);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);
        }
        return telefones;
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
