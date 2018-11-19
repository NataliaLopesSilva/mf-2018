/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package ComunicacoesEletronicas;

/**
 * Implementação da classe preferencia de Comunicação.
 * @author Nat
 */
public class ComunicacaoPreferencia {
    
    /**
     * Atributos de preferencia de comunicação.
     */
    private String codigo = null;
    private String descricao = null;

    //Métodos de chamada: get e set
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