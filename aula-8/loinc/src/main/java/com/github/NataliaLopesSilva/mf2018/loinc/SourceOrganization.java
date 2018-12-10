package com.github.NataliaLopesSilva.mf2018.loinc;

public class SourceOrganization {

    ///Variáveis
    private String copyright_id;
    private String name;
    private String copyright;
    private String terms_of_use;

    /*MÉTODOS GETTERS e  SETTERS*/
    public String getCopyright_id() {
        return copyright_id;
    }

    public void setCopyright_id(String copyright_id) {
        this.copyright_id = copyright_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public void setTerms_of_use(String terms_of_use) {
        this.terms_of_use = terms_of_use;
    }
}
