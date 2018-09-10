package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import BancoDeDados.BdBiblioteca;
import Model.Login;
import Utilitarios.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel
 */
public class ControladorLogin {

    private Connection connection;

    public String Pesquisar(Login login) throws SQLException {
        String exp = "";
        String sql = "Select Cod_Usuario FROM USUARIO WHERE Rg = " + "'" + login.getRG() + "'";
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery(sql)) {

//esse retornaConexao está tratando da conexão com o bd.		
                    rs.next();

                    exp = rs.getString("Cod_Usuario"); //se for Varchar ou char usa rs.getString

                    conn.close();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Ops, ocorreu um erro!" + e);
                } catch (Exception e) {
                }
                return exp;
            }
        }
    }

    public String PesquisarUsu(String cod) throws SQLException {
        String exp = "";
        String sql = "Select Cod_Usuario FROM USUARIO WHERE DOCUMENTO = " + "'" + cod + "'";
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery(sql)) {

//esse retornaConexao está tratando da conexão com o bd.		
                    rs.next();

                    exp = rs.getString("Cod_Usuario"); //se for Varchar ou char usa rs.getString

                    conn.close();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Ops, ocorreu um erro!" + e);
                } catch (Exception e) {
                }
                return exp;
            }
        }
    }

    public void Adiciona(Login login) throws SQLException {
        String sql = "insert into LOGIN" + "(Cod_Usuario_Login_Fk,Nome_Usuario,Senha)"
                + "values (?,?,?)";
        try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, login.getCod_pk_pessoa());
                stmt.setString(2, login.getUsuario());
                stmt.setString(3, login.getSenha());
                stmt.execute();
                stmt.close();
                
                Mensagem.exibirMensagem("Cadastro realizado com sucesso!");

            } catch (SQLException e) {

                JOptionPane.showMessageDialog(null, "Ops, ocorreu um erro!" + e);
            }
        }

    }
}
