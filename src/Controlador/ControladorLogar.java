package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import BancoDeDados.BdBiblioteca;
import Model.Logar;
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
public class ControladorLogar {

    private Connection connection;


    public ControladorLogar() throws SQLException {
        this.connection = new BdBiblioteca().getConnection();
    }

    public String filtrar(Logar log) throws SQLException {
        String cargo = "";
        String usuario = "";
        String nome = "";
        String cod = "";
        String sql = "select USUARIO.Cargo, LOGIN.Nome_Usuario,USUARIO.Nome, LOGIN.Cod_Login from USUARIO JOIN LOGIN on USUARIO.Cod_Usuario  = LOGIN.Cod_Usuario_Login_Fk WHERE LOGIN.Nome_Usuario = " + "'" + log.getUsuario() + "'";
        try (Connection conn = BdBiblioteca.getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery(sql)) {

                    while (rs.next()) {
                        cargo = rs.getString("Cargo");
                        usuario = rs.getString("Nome_Usuario");
                        nome = rs.getString("Nome");
                        cod = rs.getString("Cod_Login");
                    }
                } catch (SQLException e) {

                }
                
                return cargo;

            }
        }
    }

    public Boolean autenticar(Logar login) throws SQLException {
        Boolean exp = false;
        String sql = "Select * FROM LOGIN WHERE Nome_Usuario = " + "'" + login.getUsuario() + "'";

        try {
            PreparedStatement prep = connection.prepareStatement(sql);
            ResultSet rs = prep.executeQuery();
            rs.next();

            String nome_usu = rs.getString("Nome_Usuario");
            String senha = rs.getString("Senha");

            if (login.getUsuario().equals(nome_usu) && login.getSenha().equals(senha)) {
                JOptionPane.showMessageDialog(null, "Seja bem vindo: " + nome_usu, "Logado", JOptionPane.INFORMATION_MESSAGE);
                exp = true;

            } else {
                exp = false;
                JOptionPane.showMessageDialog(null, "Erro no usuário ou Senha", "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Erro no usuário ou senha", "Erro", JOptionPane.WARNING_MESSAGE);
        }
        return exp;

    }

}
