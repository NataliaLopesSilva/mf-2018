/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Identificadores;

/**
 * Implementação da classe TituloEleitoral.
 *
 * @author Nat
 */
public class TituloEleitoral {

    /**
     * Atributos de títulos eleitorais.
     */
    private String id = null;
    private Integer zona = null;
    private Integer sessao = null;

    //Métodos de chamada: get e set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public Integer getSessao() {
        return sessao;
    }

    public void setSessao(Integer sessao) {
        this.sessao = sessao;
    }
}