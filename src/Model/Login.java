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
public class Login {
    private String Usuario;
    private String Senha;
    private String Rg;
    private String Cod_Fk_Pessoa;

    public Login() {
    }

    public Login(String usuario, String senha, String RG, String cod_pk_pessoa) {
        this.Usuario = usuario;
        this.Senha = senha;
        this.Rg = RG;
        this.Cod_Fk_Pessoa = cod_pk_pessoa;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String usuario) {
        this.Usuario = usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        this.Senha = senha;
    }

    public String getRG() {
        return Rg;
    }

    public void setRG(String RG) {
        this.Rg = RG;
    }

    public String getCod_pk_pessoa() {
        return Cod_Fk_Pessoa;
    }

    public void setCod_pk_pessoa(String cod_pk_pessoa) {
        this.Cod_Fk_Pessoa = cod_pk_pessoa;
    }

    
    
}
