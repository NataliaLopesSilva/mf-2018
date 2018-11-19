/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Vinculos;

import java.util.Date;

/**
 * Implementação da classe Vinculo.
 *
 * @author Nat
 */
public class Vinculo {

    /**
     * Atributos de vínculos.
     */
    private String identificador = null;
    private String individuo = null;
    private Integer relacionamento = null;
    private Date dataInicio = null;
    private Date dataFinal = null;

    //Métodos de chamada: get e set
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public Integer getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(Integer relacionamento) {
        this.relacionamento = relacionamento;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }
}