/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Sujajeb
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;
import model.FormaPagamento;

public class FormaPagamentoDAO {

    public static List<FormaPagamento> obterFormaPagamento() throws ClassNotFoundException, SQLException {
        Connection conexao = null;
        Statement comando = null;
        List<FormaPagamento> formaspagamento = new ArrayList<FormaPagamento>();

        try {
            conexao = BD.getConexao();
            comando = conexao.createStatement();
            ResultSet rs = comando.executeQuery("select*from forma_pgm");
            while (rs.next()) {
                FormaPagamento formapagamento = new FormaPagamento(rs.getInt("ID"),
                        rs.getString("FORMA"));
                formaspagamento.add(formapagamento);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            fecharConexao(conexao, comando);
        }
        return formaspagamento;
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
