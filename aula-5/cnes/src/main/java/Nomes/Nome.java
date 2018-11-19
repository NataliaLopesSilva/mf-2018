/* Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package Nomes;

/**
 * Implementação da classe Nomes.
 *
 * @author Nat
 */
public class Nome {

    /**
     * Atributos de nomes.
     */
    private String id = null;
    private String individuo = null;
    private String titulos = null;
    private String nomes = null;
    private String sobrenomes = null;
    private String sufixos = null;
    private Integer preferido = null;
    private Integer usoCondicional = null;

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

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public String getNomes() {
        return nomes;
    }

    public void setNomes(String nomes) {
        this.nomes = nomes;
    }

    public String getSobrenomes() {
        return sobrenomes;
    }

    public void setSobrenomes(String sobrenomes) {
        this.sobrenomes = sobrenomes;
    }

    public String getSufixos() {
        return sufixos;
    }

    public void setSufixos(String sufixos) {
        this.sufixos = sufixos;
    }

    public Integer getPreferido() {
        return preferido;
    }

    public void setPreferido(Integer preferido) {
        this.preferido = preferido;
    }

    public Integer getUsoCondicional() {
        return usoCondicional;
    }

    public void setUsoCondicional(Integer usoCondicional) {
        this.usoCondicional = usoCondicional;
    }
}