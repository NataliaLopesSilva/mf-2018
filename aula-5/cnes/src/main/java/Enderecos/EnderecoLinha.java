/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Enderecos;

/**
 * Implementação da classe EnderecoLinha.
 *
 * @author Nat
 */
public class EnderecoLinha {

    /**
     * Atributos de linhas endereços.
     */
    private String endereco = null;
    private String linha = null;
    private Integer origem = null;

     //Métodos de chamada: get e set
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public Integer getOrigem() {
        return origem;
    }

    public void setOrigem(Integer origem) {
        this.origem = origem;
    }
}