/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Enderecos;

import java.util.Date;

/**
 * Implementação da classe Endereco.
 *
 * @author Nat
 */
public class Endereco {

    /**
     * Atributos de endereços.
     */
    private String id = null;
    private String individuo = null;
    private String bairro = null;
    private String distrito = null;
    private Integer municipio = null;
    private String estado = null;
    private String cep = null;
    private String caixaPostal = null;
    private Integer pais = null;
    private Integer tipo = null;
    private Date dataInicial = null;
    private String dataInicialAcuracia = null;
    private Date dataFinal = null;
    private String dataFinalAcuracia = null;

    //Métodos de chamada: get e set
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCaixaPostal() {
        return caixaPostal;
    }

    public void setCaixaPostal(String caixaPostal) {
        this.caixaPostal = caixaPostal;
    }

    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Date getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Date dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataInicialAcuracia() {
        return dataInicialAcuracia;
    }

    public void setDataInicialAcuracia(String dataInicialAcuracia) {
        this.dataInicialAcuracia = dataInicialAcuracia;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDataFinalAcuracia() {
        return dataFinalAcuracia;
    }

    public void setDataFinalAcuracia(String dataFinalAcuracia) {
        this.dataFinalAcuracia = dataFinalAcuracia;
    }
}