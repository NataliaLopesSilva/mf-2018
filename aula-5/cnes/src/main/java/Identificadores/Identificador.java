/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Identificadores;

import java.util.Date;

/**
 * Implementação da classe Identificador.
 *
 * @author Nat
 */
public class Identificador {

    /**
     * Atributos de identificadores.
     */
    private String id = null;
    private String individuo = null;
    private String designacao = null;
    private Integer area = null;
    private String emissor = null;
    private Date data = null;
    private String tipo = null;

    //Métodos de chamada: get e set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getEmissor() {
        return emissor;
    }

    public void setEmissor(String emissor) {
        this.emissor = emissor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

/**
 * Classe para IdentificadorTipo
 * 
 * @author Nat
 */
class IdentificadorTipo {
    
    private String codigo = null;
    private String descricao = null;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}