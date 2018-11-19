/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package DadosDemograficos;

import java.util.Date;

/**
 * Implementação da classe DadosDemografico.
 *
 * @author Nat
 */
public class DadoDemografico {

    /**
     * Atributos de dados demográficos.
     */
    private String individuo = null;
    private Date nascimento = null;
    private String nascimentdoAcuracia = null;
    private String nascimentoSeguimento = null;
    private Integer nascimentoPluralidade = null;
    private Integer nascimentoOrdem = null;
    private Date obito = null;
    private String obitoAcuracia = null;
    private Integer obitoFonte = null;
    private Integer sexo = null;
    private String mae = null;
    private String pai = null;
    private Integer situacaoFamiliar = null;
    private Integer raca = null;
    private String comentario = null;
    private Integer nacionalidade = null;
    private Integer municipio = null;
    private String estado = null;
    private Integer pais = null;
    private Date dataEntradaPais = null;

    //Métodos de chamada: get e set
    public String getIndividuo() {
        return individuo;
    }

    public void setIndividuo(String individuo) {
        this.individuo = individuo;
    }

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getNascimentdoAcuracia() {
        return nascimentdoAcuracia;
    }

    public void setNascimentdoAcuracia(String nascimentdoAcuracia) {
        this.nascimentdoAcuracia = nascimentdoAcuracia;
    }

    public String getNascimentoSeguimento() {
        return nascimentoSeguimento;
    }

    public void setNascimentoSeguimento(String nascimentoSeguimento) {
        this.nascimentoSeguimento = nascimentoSeguimento;
    }

    public Integer getNascimentoPluralidade() {
        return nascimentoPluralidade;
    }

    public void setNascimentoPluralidade(Integer nascimentoPluralidade) {
        this.nascimentoPluralidade = nascimentoPluralidade;
    }

    public Integer getNascimentoOrdem() {
        return nascimentoOrdem;
    }

    public void setNascimentoOrdem(Integer nascimentoOrdem) {
        this.nascimentoOrdem = nascimentoOrdem;
    }

    public Date getObito() {
        return obito;
    }

    public void setObito(Date obito) {
        this.obito = obito;
    }

    public String getObitoAcuracia() {
        return obitoAcuracia;
    }

    public void setObitoAcuracia(String obitoAcuracia) {
        this.obitoAcuracia = obitoAcuracia;
    }

    public Integer getObitoFonte() {
        return obitoFonte;
    }

    public void setObitoFonte(Integer obitoFonte) {
        this.obitoFonte = obitoFonte;
    }

    public Integer getSexo() {
        return sexo;
    }

    public void setSexo(Integer sexo) {
        this.sexo = sexo;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public Integer getSituacaoFamiliar() {
        return situacaoFamiliar;
    }

    public void setSituacaoFamiliar(Integer situacaoFamiliar) {
        this.situacaoFamiliar = situacaoFamiliar;
    }

    public Integer getRaca() {
        return raca;
    }

    public void setRaca(Integer raca) {
        this.raca = raca;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Integer nacionalidade) {
        this.nacionalidade = nacionalidade;
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

    public Integer getPais() {
        return pais;
    }

    public void setPais(Integer pais) {
        this.pais = pais;
    }

    public Date getDataEntradaPais() {
        return dataEntradaPais;
    }

    public void setDataEntradaPais(Date dataEntradaPais) {
        this.dataEntradaPais = dataEntradaPais;
    }
}
