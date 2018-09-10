/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BancoDeDados.BdBiblioteca;
import Model.Emprestimo;
import Model.Item;
import Model.Pessoa;
import Utilitarios.Mensagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel
 */
public class ControladorEmprestimo {

    private static final String COLUNA_NOME = "Nome";
    private static final String COLUNA_COD = "Cod_Usuario";
    private static final String COLUNA_DOCUMENTO = "DOCUMENTO";
    private static final String COLUNA_STATUS = "STATUS";
    private Connection connection;

    public void obterEmprestimo(JTable jtb, String Valor) throws SQLException {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        String sql = "select USUARIO.Nome, ITEM.Nome_Item, CONVERT(varchar(11),EMPRESTIMO.Data_Emprestimo,103) as 'Data_Emprestimo', convert(VARCHAR(11),EMPRESTIMO.Data_Prevista_Entrega,103) as 'Data_Prevista_Entrega', EMPRESTIMO.Entrega_Efetiva FROM EMPRESTIMO INNER JOIN USUARIO ON EMPRESTIMO.Cod_Usuario = USUARIO.Cod_Usuario LEFT JOIN ITEM ON ITEM.Cod_Item = EMPRESTIMO.Cod_Item where USUARIO.Documento like " +"'%"+Valor+"%'";
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet emprestimosObtido = stmt.executeQuery(sql)) {
                    while (emprestimosObtido.next()) {
                        emprestimos.add(new Emprestimo(emprestimosObtido.getString("Nome"), emprestimosObtido.getString("Nome_Item"), emprestimosObtido.getString("Data_Emprestimo"), emprestimosObtido.getString("Data_Prevista_Entrega"), emprestimosObtido.getString("Entrega_Efetiva")));
                    }

                }
            }
        }
          DefaultTableModel dtm = (DefaultTableModel) jtb.getModel();
        dtm.setNumRows(0);
        for (int i = 0; i < emprestimos.size(); i++) {
            dtm.addRow(new Object[]{
                emprestimos.get(i).getCodPessoa(),
                emprestimos.get(i).getNomeItem(),
                emprestimos.get(i).getCodItem(),
                emprestimos.get(i).getDataEmprestimo(),
                emprestimos.get(i).isEntregaEfetiva()
                
               
            });

        }
    }
    public void obterTodos(JTable jtb) throws SQLException {
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet emprestimosObtido = stmt.executeQuery("select USUARIO.Nome, ITEM.Nome_Item, CONVERT(varchar(11),EMPRESTIMO.Data_Emprestimo,103) as 'Data_Emprestimo', convert(VARCHAR(11),EMPRESTIMO.Data_Prevista_Entrega,103) as 'Data_Prevista_Entrega', EMPRESTIMO.Entrega_Efetiva FROM EMPRESTIMO INNER JOIN USUARIO ON EMPRESTIMO.Cod_Usuario = USUARIO.Cod_Usuario LEFT JOIN ITEM ON ITEM.Cod_Item = EMPRESTIMO.Cod_Item")) {
                    while (emprestimosObtido.next()) {
                        emprestimos.add(new Emprestimo(emprestimosObtido.getString("Nome"), emprestimosObtido.getString("Nome_Item"), emprestimosObtido.getString("Data_Emprestimo"), emprestimosObtido.getString("Data_Prevista_Entrega"), emprestimosObtido.getString("Entrega_Efetiva")));
                    }

                }
            }
        }
          DefaultTableModel dtm = (DefaultTableModel) jtb.getModel();
        dtm.setNumRows(0);
        for (int i = 0; i < emprestimos.size(); i++) {
            dtm.addRow(new Object[]{
                emprestimos.get(i).getCodPessoa(),
                emprestimos.get(i).getNomeItem(),
                emprestimos.get(i).getCodItem(),
                emprestimos.get(i).getDataEmprestimo(),
                emprestimos.get(i).isEntregaEfetiva()
                
               
            });

        }
    }

    public void Adiciona(Emprestimo emprestimo) throws SQLException {
        String sql = "insert into EMPRESTIMO" + "(Cod_Usuario, Cod_Item, Data_Emprestimo, Data_Prevista_Entrega, Entrega_Efetiva)"
                + "values(?,?,?,?,?)";
        try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, emprestimo.getCodPessoa());
                stmt.setString(2, emprestimo.getCodItem());
                stmt.setString(3, emprestimo.getDataEmprestimo());
                stmt.setString(4, emprestimo.getDevolucao());
                stmt.setBoolean(5, emprestimo.isEntregaEfetiva());
                stmt.execute();
                Mensagem.exibirMensagem("Empréstimo realizado com sucesso");
            } catch (SQLException e) {
                Mensagem.exibirMensagem("Não foi possível realizar o empréstimo" + e);
            }
        }
    }

    public void atualizarStatus(String Cod_Externo, String Documento) throws SQLException {
        String sql = "update EMPRESTIMO set " + "Entrega_Efetiva = ?" + " FROM EMPRESTIMO INNER JOIN ITEM on ITEM.Cod_Item = EMPRESTIMO.Cod_Item INNER JOIN USUARIO ON EMPRESTIMO.Cod_Usuario = USUARIO.Cod_Usuario WHERE Cod_Externo = " + "'" + Cod_Externo + "'" + " AND USUARIO.Documento = " + "'" + Documento + "'" + " AND Entrega_Efetiva = 0 ";
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setBoolean(1, true);
                stmt.executeUpdate();
                stmt.close();
                Mensagem.exibirMensagem("Entrega realizada");
            } catch (SQLException e) {
                Mensagem.exibirMensagem("Impossível atualizar empréstimo" + e);
            }
        }
    }

    public boolean verificarEmprestimo(JTable jtb, String cod, String Documento, boolean efetiva) throws SQLException {
        boolean found = true;
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        String sql = "select ITEM.Nome_Item,ITEM.Cod_Item, ITEM.Cod_Externo,EMPRESTIMO.Entrega_Efetiva,CONVERT(varchar(11),EMPRESTIMO.Data_Emprestimo,103) as 'Data_Emprestimo', CONVERT(VARCHAR(11),EMPRESTIMO.Data_Prevista_Entrega,103) as 'Data_Prevista_Entrega' from EMPRESTIMO JOIN ITEM on ITEM.Cod_Item = EMPRESTIMO.Cod_Item INNER JOIN USUARIO ON EMPRESTIMO.Cod_Usuario = USUARIO.Cod_Usuario WHERE Cod_Externo =  " + "'" + cod + "'" + "AND USUARIO.Documento = " + "'" + Documento + "'" + " AND Entrega_Efetiva =" + "'" + "0" + "'";
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet emprestimosObtidos = stmt.executeQuery(sql)) {

                    while (emprestimosObtidos.next()) {
                        emprestimos.add(new Emprestimo(emprestimosObtidos.getString("nome_item"), emprestimosObtidos.getString("cod_item"), emprestimosObtidos.getString("cod_externo"), emprestimosObtidos.getString("Data_Emprestimo"), emprestimosObtidos.getString("Data_Prevista_Entrega")));
                        found = false;
                    }
                }
            }
            DefaultTableModel dtm = (DefaultTableModel) jtb.getModel();
            dtm.setNumRows(0);
            for (int i = 0; i < emprestimos.size(); i++) {
                dtm.addRow(new Object[]{
                    emprestimos.get(i).getCodItem(),
                    emprestimos.get(i).getNomeItem(),
                    emprestimos.get(i).getCodPessoa(),
                    emprestimos.get(i).getDataEmprestimo(),
                    emprestimos.get(i).getDevolucao()

                });

            }

        }
        return found;
    }

    public boolean verificarItem(String cod, boolean efetiva) throws SQLException {
        String cod_item;

        String sql = "select EMPRESTIMO.Cod_Emprestimo,ITEM.Cod_Item, ITEM.Cod_Externo,EMPRESTIMO.Entrega_Efetiva from EMPRESTIMO JOIN ITEM on ITEM.Cod_Item = EMPRESTIMO.Cod_Item WHERE Cod_Externo =  " + "'" + cod + "'";
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet rs = stmt.executeQuery(sql)) {

                    while (rs.next()) {
                        rs.getString("Cod_Emprestimo");
                        rs.getString("Cod_Externo");
                        cod_item = rs.getString("Cod_Item");
                        efetiva = rs.getBoolean("Entrega_Efetiva");

                    }
                }
            }

        }

        return efetiva;
    }

    public void obterPesquisa(JTable jtb, String Nome) throws SQLException {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet pessoasObtido = stmt.executeQuery("Select Cod_Usuario,Nome,Documento,Status FROM USUARIO WHERE Documento = " + "'" + Nome + "'")) {
                    while (pessoasObtido.next()) {
                        pessoas.add(new Pessoa(pessoasObtido.getString(COLUNA_COD), pessoasObtido.getString(COLUNA_NOME), pessoasObtido.getString(COLUNA_DOCUMENTO), pessoasObtido.getString(COLUNA_STATUS)));
                    }

                }
            }

        }
        DefaultTableModel dtm = (DefaultTableModel) jtb.getModel();
        dtm.setNumRows(0);
        for (int i = 0; i < pessoas.size(); i++) {
            dtm.addRow(new Object[]{
                pessoas.get(i).getCodigo(),
                pessoas.get(i).getNome(),
                pessoas.get(i).getDocumento(),
                pessoas.get(i).getSatus()

            });

        }

    }

    public void obterPesquisaItem(JTable jtb, String Nome) throws SQLException {

        ArrayList<Item> itens = new ArrayList<>();
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet itensObtido = stmt.executeQuery("Select Cod_Item,Cod_Externo, Nome_Item,Tipo,Genero FROM ITEM WHERE Cod_Externo= " + "'" + Nome + "'")) {
                    while (itensObtido.next()) {
                        itens.add(new Item(itensObtido.getString("Cod_Item"), itensObtido.getString("Cod_Externo"), itensObtido.getString("Nome_Item"), itensObtido.getString("Tipo"), itensObtido.getString("Genero")));
                    }

                }
            }
        }
        DefaultTableModel dtm = (DefaultTableModel) jtb.getModel();
        dtm.setNumRows(0);
        for (int i = 0; i < itens.size(); i++) {
            dtm.addRow(new Object[]{
                itens.get(i).getCodigo(),
                itens.get(i).getCod_externo(),
                itens.get(i).getNome_item(),
                itens.get(i).getTipo(),
                itens.get(i).getGenero()

            });

        }

    }

    public void obterPesquisa(JTable jTable1, String text, String aux) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
