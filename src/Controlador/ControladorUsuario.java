/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Model.Pessoa;
import BancoDeDados.BdBiblioteca;
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
public class ControladorUsuario extends RepositorioBase {

    private static final String COLUNA_NOME = "Nome";
    private static final String COLUNA_RG = "Rg";
    private static final String COLUNA_NIVEL = "Nivel";
    private static final String COLUNA_EMAIL = "Email";
    private static final String COLUNA_ENDERECO = "Endereco";
    private static final String COLUNA_SEXO = "Sexo";
    private static final String COLUNA_DATANASC = "DataNasc";
    private static final String COLUNA_CARGO = "Cargo";
    private static final String COLUNA_DOCUMENTO = "Documento";
    private static final String COLUNA_STATUS = "Status";
    private static final String COLUNA_TELEFONE = "Telefone";

    public void obterTodos(JTable jtb) throws SQLException {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet pessoasObtido = stmt.executeQuery("Select Cod_Usuario,Nome,Rg,Nivel,Email,"
                        + "Endereco,Sexo,DataNasc,Cargo,Documento,Status,Telefone FROM USUARIO")) {
                    while (pessoasObtido.next()) {
                        pessoas.add(new Pessoa(pessoasObtido.getString("Cod_Usuario"), pessoasObtido.getString(COLUNA_NOME), pessoasObtido.getString(COLUNA_RG), pessoasObtido.getString(COLUNA_NIVEL), pessoasObtido.getString(COLUNA_EMAIL), pessoasObtido.getString(COLUNA_ENDERECO), pessoasObtido.getString(COLUNA_SEXO), pessoasObtido.getString(COLUNA_DATANASC), pessoasObtido.getString(COLUNA_CARGO), pessoasObtido.getString(COLUNA_DOCUMENTO), pessoasObtido.getString(COLUNA_STATUS), pessoasObtido.getString(COLUNA_TELEFONE)));
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
                pessoas.get(i).getNivel(),
                pessoas.get(i).getRg(),
                pessoas.get(i).getEmail(),
                pessoas.get(i).getEndereco(),
                pessoas.get(i).getSexo(),
                pessoas.get(i).getDataNasc(),
                pessoas.get(i).getCargo(),
                pessoas.get(i).getDocumento(),
                pessoas.get(i).getSatus(),
                pessoas.get(i).getTelefone()
            });

        }

    }

    public void obterPesquisa(JTable jtb, String NOME, String pesquisa) throws SQLException {

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        try (Connection conn = new BdBiblioteca().getConnection()) {
            try (Statement stmt = conn.createStatement()) {
                try (ResultSet pessoasObtido = stmt.executeQuery("Select Cod_Usuario,Nome,Rg,Nivel,Email,"
                        + "Endereco,Sexo,DataNasc,Cargo,Documento,Status,Telefone FROM USUARIO WHERE " + pesquisa + " like " + "'%" + NOME + "%'")) {
                    while (pessoasObtido.next()) {
                        pessoas.add(new Pessoa(pessoasObtido.getString("Cod_Usuario"), pessoasObtido.getString(COLUNA_NOME), pessoasObtido.getString(COLUNA_RG), pessoasObtido.getString(COLUNA_NIVEL), pessoasObtido.getString(COLUNA_EMAIL), pessoasObtido.getString(COLUNA_ENDERECO), pessoasObtido.getString(COLUNA_SEXO), pessoasObtido.getString(COLUNA_DATANASC), pessoasObtido.getString(COLUNA_CARGO), pessoasObtido.getString(COLUNA_DOCUMENTO), pessoasObtido.getString(COLUNA_STATUS), pessoasObtido.getString(COLUNA_TELEFONE)));
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
                pessoas.get(i).getNivel(),
                pessoas.get(i).getRg(),
                pessoas.get(i).getEmail(),
                pessoas.get(i).getEndereco(),
                pessoas.get(i).getSexo(),
                pessoas.get(i).getDataNasc(),
                pessoas.get(i).getCargo(),
                pessoas.get(i).getDocumento(),
                pessoas.get(i).getSatus(),
                pessoas.get(i).getTelefone()
            });

        }

    }

    public void Remove(String cod) throws SQLException {
        String SqlAux2 ="delete from LOGIN where Cod_Usuario_Login_Fk = " +"'" + cod +"'";
        String SqlAux ="delete from EMPRESTIMO where Cod_Usuario = " +"'" + cod +"'";
        String sql = "delete from USUARIO where Cod_Usuario = " + "'" + cod + "'";
        try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt3 = conn.prepareStatement(SqlAux2);
                PreparedStatement stmt2 = conn.prepareStatement(SqlAux);
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt3.execute();
                stmt2.execute();
                stmt.execute();
                
                Mensagem.exibirMensagem("Exclusão bem sucessida!");
            } catch (SQLException e) {
                Mensagem.exibirMensagem("Não foi possível excluir a pessoa" + e);
            }
        }
    }

    public void Atualiza(Pessoa pessoa) throws SQLException {
        String sql = "update USUARIO set " + "Nome = ?, Rg = ?,Nivel = ?,Email = ?,Endereco = ?,Sexo = ?,DataNasc = ?,Cargo = ?,Documento = ?,Status = ?,Telefone = ?"
                + " WHERE Rg = " + "'" + pessoa.getRg() + "'";
        try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, pessoa.getNome());
                stmt.setString(2, pessoa.getRg());
                stmt.setString(3, pessoa.getNivel());
                stmt.setString(4, pessoa.getEmail());
                stmt.setString(5, pessoa.getEndereco());
                stmt.setString(6, pessoa.getSexo());
                stmt.setString(7, pessoa.getDataNasc());
                stmt.setString(8, pessoa.getCargo());
                stmt.setString(9, pessoa.getDocumento());
                stmt.setString(10, pessoa.getSatus());
                stmt.setString(11, pessoa.getTelefone());
                stmt.executeUpdate();
                stmt.close();
                Mensagem.exibirMensagem("Cadastro atualizado com sucesso");

            } catch (SQLException e) {
                Mensagem.exibirMensagem("Impossível atualizar usuário" + e);
            }
        }
    }

    public void Adiciona(Pessoa pessoa) throws SQLException {
        String sql = "insert into USUARIO" + "(Nome,Rg,Nivel,Email,Endereco,Sexo,DataNasc,Cargo,Documento,Status,Telefone)"
                + "values (?,?,?,?,?,?,?,?,?,?,?)";

        try (Connection conn = new BdBiblioteca().getConnection()) {

            try {
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, pessoa.getNome());
                stmt.setString(2, pessoa.getRg());
                stmt.setString(3, pessoa.getNivel());
                stmt.setString(4, pessoa.getEmail());
                stmt.setString(5, pessoa.getEndereco());
                stmt.setString(6, pessoa.getSexo());
                stmt.setString(7, pessoa.getDataNasc());
                stmt.setString(8, pessoa.getCargo());
                stmt.setString(9, pessoa.getDocumento());
                stmt.setString(10, pessoa.getSatus());
                stmt.setString(11, pessoa.getTelefone());
                stmt.execute();

                Mensagem.exibirMensagem("Cadastro realizado com sucesso!");

            } catch (SQLException e) {
                Mensagem.exibirMensagem("Não foi possível cadastrar usuário" + e);
            }
        }

    }

}
