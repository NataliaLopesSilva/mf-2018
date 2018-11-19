/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Identificadores;

/**
 * Implementação da classe Certidao.
 *
 * @author Nat
 */
public class Certidao {

    /**
     * Atributos de certidão.
     */
    private String identificador = null;
    private Integer tipo = null;
    private String cartorio = null;
    private Integer livro = null;
    private Integer folha = null;
    private Integer termo = null;

    //Métodos de chamada: get e set
    private String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getCartorio() {
        return cartorio;
    }

    public void setCartorio(String cartorio) {
        this.cartorio = cartorio;
    }

    public Integer getLivro() {
        return livro;
    }

    public void setLivro(Integer livro) {
        this.livro = livro;
    }

    public Integer getFolha() {
        return folha;
    }

    public void setFolha(Integer folha) {
        this.folha = folha;
    }

    public Integer getTermo() {
        return termo;
    }

    public void setTermo(Integer termo) {
        this.termo = termo;
    }

}

class CertidaoTipo {

    private Integer codigo = null;
    private String descricao = null;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}