/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Nomes;

import java.util.Date;

/**
 * Implementação da classe Utilizacao.
 *
 * @author Nat
 */
public class Utilizacao {

    /**
     * Atributos de utilizações.
     */
    private String nome = null;
    private Integer uso = null;
    private String identificador = null;
    private Date dataInicial = null;
    private Date dataFinal = null;

    //Métodos de chamada: get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getUso() {
        return uso;
    }

    public void setUso(Integer uso) {
        this.uso = uso;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

}

/**
 * Implementação da classe NomeUso.
 *
 * @author Nat
 */
class NomeUso {

    private Integer codigo = null;
    private String alternativo = null;
    private String descricao = null;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}