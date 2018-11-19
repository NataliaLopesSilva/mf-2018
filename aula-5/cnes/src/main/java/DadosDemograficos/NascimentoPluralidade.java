/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package DadosDemograficos;

/**
 * Implementação da classe NascimentoPluralidade.
 * 
 * @author Nat
 */
public class NascimentoPluralidade {
    
    /**
     * Atributos de pluralidade de nascimentos.
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
