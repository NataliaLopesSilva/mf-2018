package com.github.NataliaLopesSilva.mf2018.loinc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe que contém as consultas pertinentes a tabela Loinc
 *
 * @author Nat
 */
public class ConsultasLoinc {

    /**
     * Consulta todos os registros da tabela Loinc
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<Loinc> consultaTodosRegistros() throws SQLException {
        String consulta = "select * from Loinc";
        ArrayList<Loinc> lista = new ArrayList<Loinc>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

    /**
     * Consulta os registros da tabela Loinc pela variável loinc_num
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<Loinc> consultaRegistroPorLoinc_num(String loinc_num) throws SQLException {
        String consulta = "select * from Loinc where loinc_num = '" + loinc_num + "'";
        ArrayList<Loinc> lista = new ArrayList<Loinc>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

     /**
     * Consulta os registros da tabela Loinc pela variável component
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<Loinc> consultaRegistroPorComponent(String component) throws SQLException {
        String consulta = "select * from Loinc where component = '" + component + "'";
        ArrayList<Loinc> lista = new ArrayList<Loinc>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

     /**
     * Consulta os registros da tabela Loinc pela variável property
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<Loinc> consultaRegistroPorProperty(String property) throws SQLException {
        String consulta = "select * from Loinc where property = '" + property + "'";
        ArrayList<Loinc> lista = new ArrayList<Loinc>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

     /**
     * Consulta os registros da tabela Loinc pela variável common_si_test_rank
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<Loinc> consultaRegistroPorCommon_si_test_rank(int common_si_test_rank) throws SQLException {
        String consulta = "select * from Loinc where common_si_test_rank = '" + common_si_test_rank + "'";
        ArrayList<Loinc> lista = new ArrayList<Loinc>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

     /**
     * Carrega todos os registros pesquisados em uma lista de objetos
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    private ArrayList<Loinc> carregaLista(ResultSet resultado) throws SQLException {
        ArrayList<Loinc> lista = new ArrayList<Loinc>();
        Loinc loinc = new Loinc();

        while (resultado.next()) {
            loinc.setLoinc_num(resultado.getString("loinc_num"));
            loinc.setComponent(resultado.getString("component"));
            loinc.setProperty(resultado.getString("property"));
            loinc.setTime_aspct(resultado.getString("time_aspct"));
            loinc.setSystem(resultado.getString("system"));
            loinc.setScale_typ(resultado.getString("scale_typ"));
            loinc.setMethod_typ(resultado.getString("method_typ"));
            loinc.setVar_class(resultado.getString("var_class"));
            loinc.setVersionLastChanged(resultado.getString("VersionLastChanged"));
            loinc.setChng_type(resultado.getString("chng_type"));
            loinc.setDefinitionDescription(resultado.getString("DefinitionDescription"));
            loinc.setStatus(resultado.getString("status"));
            loinc.setConsumer_name(resultado.getString("consumer_name"));
            loinc.setClasstype(resultado.getString("classtype"));
            loinc.setFormula(resultado.getString("formula"));
            loinc.setExmpl_answers(resultado.getString("exmpl_answers"));
            loinc.setSurvey_quest_text(resultado.getString("survey_quest_text"));
            loinc.setSurvey_quest_src(resultado.getString("survey_quest_src"));
            loinc.setUnitsrequired(resultado.getString("unitsrequired"));
            loinc.setSubmitted_units(resultado.getString("submitted_units"));
            loinc.setRelatednames2(resultado.getString("relatednames2"));
            loinc.setShortname(resultado.getString("shortname"));
            loinc.setOrder_obs(resultado.getString("order_obs"));
            loinc.setCdisc_common_tests(resultado.getString("cdisc_common_tests"));
            loinc.setHl7_field_subfield_id(resultado.getString("hl7_field_subfield_id"));
            loinc.setExternal_copyright_notice(resultado.getString("external_copyright_notice"));
            loinc.setExample_units(resultado.getString("example_units"));
            loinc.setLong_common_name(resultado.getString("long_common_name"));
            loinc.setUnitsAndRange(resultado.getString("UnitsAndRange"));
            loinc.setDocument_section(resultado.getString("document_section"));
            loinc.setExample_ucum_units(resultado.getString("example_ucum_units"));
            loinc.setExample_si_ucum_units(resultado.getString("example_si_ucum_units"));
            loinc.setStatus_reason(resultado.getString("status_reason"));
            loinc.setStatus_text(resultado.getString("status_text"));
            loinc.setChange_reason_public(resultado.getString("change_reason_public"));
            loinc.setCommon_si_test_rank(resultado.getInt("common_si_test_rank"));
            loinc.setCommon_test_rank(resultado.getInt("common_test_rank"));
            loinc.setCommon_order_rank(resultado.getInt("common_order_rank"));
            loinc.setHl7_attachment_structure(resultado.getString("hl7_attachment_structure"));
            loinc.setExternalCopyrightLink(resultado.getString("ExternalCopyrightLink"));
            loinc.setPanelType(resultado.getString("PanelType"));
            loinc.setAskAtOrderEntry(resultado.getString("AskAtOrderEntry"));
            loinc.setAssociatedObservations(resultado.getString("AssociatedObservations"));
            loinc.setVersionFirstReleased(resultado.getString("VersionFirstReleased"));
            loinc.setValidHL7AttachmentRequest(resultado.getString("ValidHL7AttachmentRequest"));

            lista.add(loinc);
        }

        return lista;
    }
}
