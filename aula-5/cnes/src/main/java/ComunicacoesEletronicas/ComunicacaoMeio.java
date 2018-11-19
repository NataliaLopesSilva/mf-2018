/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package ComunicacoesEletronicas;

/**
 * Implementação da classe do meio de Comunicação.
 * @author Nat
 */
public class ComunicacaoMeio {
    
    /**
     * Atributos do meio de comunicação.
     */
    private Integer codigo = null;
    private String descricao = null;
    private String alternativo = null;

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

    public String getAlternativo() {
        return alternativo;
    }

    public void setAlternativo(String alternativo) {
        this.alternativo = alternativo;
    }   
}