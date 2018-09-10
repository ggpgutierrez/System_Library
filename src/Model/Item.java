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
public class Item {

    private String Codigo;
    private String CodExterno;
    private String NomeItem;
    private String Editora;
    private String Idioma;
    private String Genero;
    private String Tipo;

    public Item() {
    }

    public Item(String codigo, String cod_externo, String nome_item, String editora, String idioma, String genero, String tipo) {
        this.Codigo = codigo;
        this.CodExterno = cod_externo;
        this.NomeItem = nome_item;
        this.Editora = editora;
        this.Idioma = idioma;
        this.Genero = genero;
        this.Tipo = tipo;
    }

    public Item(String codigo,String codigo_externo,String nome_item, String tipo, String genero) {
        this.Codigo = codigo;
        this.CodExterno = codigo_externo;
        this.NomeItem = nome_item;
        this.Genero = genero;
        this.Tipo = tipo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        this.Codigo = codigo;
    }

    public String getCod_externo() {
        return CodExterno;
    }

    public void setCod_externo(String cod_externo) {
        this.CodExterno = cod_externo;
    }

    public String getNome_item() {
        return NomeItem;
    }

    public void setNome_item(String nome_item) {
        this.NomeItem = nome_item;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        this.Editora = editora;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String idioma) {
        this.Idioma = idioma;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        this.Genero = genero;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        this.Tipo = tipo;
    }

}
