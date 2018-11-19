/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package ComunicacoesEletronicas;

/**
 * Implementação da classe Comunicação.
 * @author Nat
 */
public class Comunicacao {
    
    /**
     * Atributos de comunicação.
     */
    private String individuo = null;
    private Integer meio = null;
    private String preferencia = null;
    private String detalhe = null;
    private Integer uso = null;

    //Métodos de chamada: get e set
    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public Integer getMeio() {
        return meio;
    }

    public void setMeio(Integer meio) {
        this.meio = meio;
    }

    public String getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(String preferencia) {
        this.preferencia = preferencia;
    }

    public String getDetalhe() {
        return detalhe;
    }

    public void setDetalhe(String detalhe) {
        this.detalhe = detalhe;
    }

    public Integer getUso() {
        return uso;
    }

    public void setUso(Integer uso) {
        this.uso = uso;
    }
}