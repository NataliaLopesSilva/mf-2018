/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Nomes;

/**
 * Implementação da classe Representacao.
 *
 * @author Nat
 */
public class Representacao {

    /**
     * Atributos de representações.
     */
    private String nome = null;
    private String utilizacao = null;
    private String alternativa = null;

    //Métodos de chamada: get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUtilizacao() {
        return utilizacao;
    }

    public void setUtilizacao(String utilizacao) {
        this.utilizacao = utilizacao;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
}