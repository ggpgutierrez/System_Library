/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Utilitarios.Mensagem;




/**
 *
 * @author Gabriel
 */
public class GuardaSessao {
    
  private String internalNome;
  private String nome;
  private String Cargo;

    public GuardaSessao() {
    }

    public GuardaSessao(String internalNome, String Cargo) {
        this.internalNome = internalNome;
        this.Cargo = Cargo;
    }

    public String getInternalNome() {
        return internalNome;
    }

    public void setInternalNome(String internalNome) {
       
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    

    
    public void retornar(String Cargo, String nome_usuario, String Nome,String cod_login)  {
     
     NomeUsu(Nome); 
    }
    public String NomeUsu(String nome)
    {
       

        Mensagem.exibirMensagem(nome);
        return nome;
        
    }
 

    public String getNome() {
        Mensagem.exibirMensagem(nome);
        return nome;
       
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

 
}
