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
import model.Cliente;

/**
 *
 * @author Sujajeb
 */
public class ClienteDAO {
    public static List<Cliente> obterClientes() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select*from cliente");
            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getInt("id"),
                        rs.getString("NOME"),rs.getString("RUA"),rs.getString("NUMERO"),rs.getString("CEP"),
                        rs.getString("DATA_CADASTRO"),rs.getString("EMAIL"),rs.getString("REFERENCIA_ENDERECO"), null, 0);
                cliente.setIdBairro(rs.getInt("BAIRRO_ID"));
                clientes.add(cliente);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);
        }
        return clientes;
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
