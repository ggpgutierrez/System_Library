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
public class Pessoa {
       private String Codigo;
       private String Nome;
       private String Endereco;
       private String Rg;
       private String Documento;
       private String Telefone;
       private String Emaill;
       private String DataNasc;
       private String Status;
       private String Nivel;
       private String Sexo;
       private String Cargo;

    public Pessoa() {
        
    }

    public Pessoa(String codigo, String nome, String endereco, String rg, String documento, String telefone, String email, String dataNasc, String satus, String nivel, String sexo, String cargo) {
        this.Codigo = codigo;
        this.Nome = nome;
        this.Endereco = endereco;
        this.Rg = rg;
        this.Documento = documento;
        this.Telefone = telefone;
        this.Emaill = email;
        this.DataNasc = dataNasc;
        this.Status = satus;
        this.Nivel = nivel;
        this.Sexo = sexo;
        this.Cargo = cargo;
    }

    public Pessoa(String codigo,String nome, String documento, String status) {
        this.Codigo = codigo;
        this.Nome = nome;
        this.Documento = documento;
        this.Status = status;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        this.Endereco = endereco;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String rg) {
        this.Rg = rg;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String documento) {
        this.Documento = documento;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        this.Telefone = telefone;
    }

    public String getEmail() {
        return Emaill;
    }

    public void setEmail(String email) {
        this.Emaill = email;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.DataNasc = dataNasc;
    }

    public String getSatus() {
        return Status;
    }

    public void setSatus(String satus) {
        this.Status = satus;
    }

    public String getNivel() {
        return Nivel;
    }

    public void setNivel(String nivel) {
        this.Nivel = nivel;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        this.Cargo = cargo;
    }
    

     
 
 
}
