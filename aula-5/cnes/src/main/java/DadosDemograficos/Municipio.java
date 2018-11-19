/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package DadosDemograficos;

/**
 * Implementação da classe Municipio.
 * 
 * @author Nat
 */
public class Municipio {
    
    /**
     * Atributos de municipios.
     */
    private String codigo = null;
    private String descricao = null;
    private String municipio = null;

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

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
}