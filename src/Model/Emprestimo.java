/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Gabriel
 */
public class Emprestimo {
    private String CodPessoa;
    private String NomeItem;
    private String CodItem;
    private String Devolucao;
    private String DataEmprestimo;
    private boolean EntregaEfetiva;

    public Emprestimo() {
    }

    public Emprestimo(String CodPessoa, String NomeItem, String CodItem, String DataDevolucao, String DataEmprestimo, boolean EntregaEfetiva) {
        this.CodPessoa = CodPessoa;
        this.NomeItem = NomeItem;
        this.CodItem = CodItem;
        this.DataEmprestimo = DataEmprestimo;
        this.EntregaEfetiva = EntregaEfetiva;
    }

    public Emprestimo(String cod_pessoa, String cod_item, String data_emprestimo, String devolucao, boolean entrega_efetiva) {
        this.CodPessoa = cod_pessoa;
        this.CodItem = cod_item;
        this.DataEmprestimo = data_emprestimo;
        this.Devolucao = devolucao;
        this.EntregaEfetiva = entrega_efetiva;
    }

    public Emprestimo(String cod_pessoa,String nome_item, String cod_item, String data_emprestimo, String devolucao) {
        this.CodPessoa = cod_pessoa;
        this.CodItem = cod_item;
        this.DataEmprestimo = data_emprestimo;
        this.Devolucao = devolucao;
        this.NomeItem = nome_item;
    }

    public String getCodPessoa() {
        return CodPessoa;
    }

    public void setCodPessoa(String CodPessoa) {
        this.CodPessoa = CodPessoa;
    }

    public String getNomeItem() {
        return NomeItem;
    }

    public void setNomeItem(String NomeItem) {
        this.NomeItem = NomeItem;
    }

    public String getCodItem() {
        return CodItem;
    }

    public void setCodItem(String CodItem) {
        this.CodItem = CodItem;
    }

   

    public String getDevolucao() {
        return Devolucao;
    }

    public void setDevolucao(String Devolucao) {
        this.Devolucao = Devolucao;
    }

    public String getDataEmprestimo() {
        return DataEmprestimo;
    }

    public void setDataEmprestimo(String DataEmprestimo) {
        this.DataEmprestimo = DataEmprestimo;
    }

    public boolean isEntregaEfetiva() {
        return EntregaEfetiva;
    }

    public void setEntregaEfetiva(boolean EntregaEfetiva) {
        this.EntregaEfetiva = EntregaEfetiva;
    }

   
}
