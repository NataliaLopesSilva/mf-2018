/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Identificadores;

/**
 * Implementação da classe Ctps.
 *
 * @author Nat
 */
public class Ctps {

    /**
     * Atributos de ctps.
     */
    private String id = null;
    private Integer serie = null;
    private String estado = null;

    //Métodos de chamada: get e set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}