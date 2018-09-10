/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BancoDeDados;

import Utilitarios.Mensagem;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gabriel
 */
public class BdBiblioteca {
    private static final String jdbcDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String jdbcUrl = "jdbc:sqlserver://localhost:1433;user = sa;"
            + "password=1234567;databaseName=db_Biblioteca;";
 
    public static Connection getConnection()
    {
        try{
            Class.forName(jdbcDriver);
        }
        catch(ClassNotFoundException e)
        {
            Mensagem.exibirMensagem("erro" +e );
        }
        try {
            return DriverManager.getConnection(jdbcUrl);
        } catch (Exception e) {
            Mensagem.exibirMensagem("Erro" + e );
        }
        return null;
    }
    
    
}
