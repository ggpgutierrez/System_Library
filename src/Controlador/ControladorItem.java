/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BancoDeDados.BdBiblioteca;
import Model.Item;
import Utilitarios.Mensagem;
import Utilitarios.RepositorioBase;
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
public class ControladorItem extends RepositorioBase {

    public ControladorItem() {
    }

    public void obterTodos(JTable jtb) throws SQLException {

        ArrayList<Item> itens = new ArrayList<>();
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet itensObtido = stmt.executeQuery("Select Cod_Item, Cod_Externo, Nome_Item, Editora,Idioma,Genero,Tipo FROM ITEM")) {
                    while (itensObtido.next()) {
                        itens.add(new Item(itensObtido.getString("Cod_Item"), itensObtido.getString("Cod_Externo"), itensObtido.getString("Nome_Item"), itensObtido.getString("Editora"),itensObtido.getString("Idioma"), itensObtido.getString("Genero"), itensObtido.getString("Tipo")));
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
                itens.get(i).getEditora(),
                itens.get(i).getIdioma(),
                itens.get(i).getGenero(),
                itens.get(i).getTipo()
            });

        }

    }

    public void CadastrarItem(Item item) throws SQLException {
        String sql = "insert into ITEM" + "(Cod_Externo,Nome_Item,Editora,Idioma,Genero,Tipo)"
                + "VALUES(?,?,?,?,?,?)";

        try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, item.getCod_externo());
                stmt.setString(2, item.getNome_item());
                stmt.setString(3, item.getEditora());
                stmt.setString(4, item.getIdioma());
                stmt.setString(5, item.getGenero());
                stmt.setString(6, item.getTipo());
                stmt.execute();
                stmt.close();
                Mensagem.exibirMensagem("Cadastro realizado com sucesso!");
            } catch (SQLException e) {
                Mensagem.exibirMensagem("Erro" + e);
            }
        }

    }
     public void obterPesquisa(JTable jtb, String NOME, String pesquisa) throws SQLException {

        ArrayList<Item> itens = new ArrayList<>();
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet itensObtido = stmt.executeQuery("Select Cod_Item, Cod_Externo, Nome_Item, Editora,Idioma,Genero,Tipo FROM ITEM WHERE " + pesquisa + " like " + "'%" + NOME + "%'")) {
                    while (itensObtido.next()) {
                        itens.add(new Item(itensObtido.getString("Cod_Item"), itensObtido.getString("Cod_Externo"), itensObtido.getString("Nome_Item"), itensObtido.getString("Editora"),itensObtido.getString("Idioma"), itensObtido.getString("Genero"), itensObtido.getString("Tipo")));
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
                itens.get(i).getEditora(),
                itens.get(i).getIdioma(),
                itens.get(i).getGenero(),
                itens.get(i).getTipo()
            });

        }

    }

    public void Remove(int cod,JTable jtb) throws SQLException {
        String SqlAux = "delete from EMPRESTIMO WHERE Cod_Item = " + "'" + cod + "'";
        String sql = "delete from ITEM WHERE Cod_Item = " + "'" + cod + "'";
        try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                PreparedStatement stmt2 = conn.prepareStatement(SqlAux);
                stmt2.execute();
                stmt.execute();
                obterTodos(jtb);
            } catch (SQLException e) {
                Mensagem.exibirMensagem("Não foi possível excluir a pessoa" + e);
            }
        }
    }

    public void Atualiza(Item item,JTable jtb) throws SQLException {
        String sql = "update ITEM set " + "Cod_Externo = ?,Nome_Item = ?, Editora = ?,Idioma = ?,Genero = ?,Tipo = ?"
                + " WHERE Cod_Item = " + "'" + item.getCodigo() + "'";
        try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, item.getCod_externo());
                stmt.setString(2, item.getNome_item());
                stmt.setString(3, item.getEditora());
                stmt.setString(4, item.getIdioma());
                stmt.setString(5, item.getGenero());
                stmt.setString(6, item.getTipo());
                stmt.executeUpdate();
                stmt.close();
                Mensagem.exibirMensagem("Cadastro atualizado com sucesso");
                obterTodos(jtb);
            } catch (SQLException e) {
                Mensagem.exibirMensagem("Impossível atualizar item" + e);
            }
        }
    }


}
