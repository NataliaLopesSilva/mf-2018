/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Nomes;

/**
 * Implementação da classe Preferido.
 *
 * @author Nat
 */
public class Preferido {

    /**
     * Atributos de preferidos.
     */
    private Integer codigo = null;
    private String descricao = null;

    //Métodos de chamada: get e set
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