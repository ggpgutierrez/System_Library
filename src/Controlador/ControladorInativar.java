package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import BancoDeDados.BdBiblioteca;
import Utilitarios.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Gabriel
 */
public class ControladorInativar {

    

    public ControladorInativar() {

    }

    public void checar(String data_completa) throws SQLException {
        String sql = "UPDATE USUARIO SET " + "Status = ?" + " from USUARIO INNER JOIN EMPRESTIMO on EMPRESTIMO.Cod_Usuario = USUARIO.Cod_Usuario where" + "'" + data_completa + "'" + " > Data_Prevista_Entrega  AND EMPRESTIMO.Entrega_Efetiva = 0";
            try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, "Inativo");
               
                stmt.executeUpdate();
                stmt.close();
               

            } catch (SQLException e) {
                Mensagem.exibirMensagem("Impossível atualizar status dos usuários" + e);
            }
        }
    }
}
