package com.github.NataliaLopesSilva.mf2018.loinc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe que contém as consultas pertinentes a tabela SourceOrganization
 *
 * @author Nat
 */
public class ConsultasSourceOrganization {

    /**
     * Consulta todos os registros da tabela SourceOrganization
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<SourceOrganization> consultaTodosRegistros() throws SQLException {
        String consulta = "select * from SourceOrganization";
        ArrayList<SourceOrganization> lista = new ArrayList<SourceOrganization>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

    /**
     * Consulta os registros da tabela SourceOrganization pela variável copyright_id
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<SourceOrganization> consultaRegistroPorCopyright_id(String copyright_id) throws SQLException {
        String consulta = "select * from SourceOrganization where copyright_id = '" + copyright_id + "'";
        ArrayList<SourceOrganization> lista = new ArrayList<SourceOrganization>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

     /**
     * Consulta os registros da tabela SourceOrganization pela variável name
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<SourceOrganization> consultaRegistroPorName(String name) throws SQLException {
        String consulta = "select * from SourceOrganization where name = '" + name + "'";
        ArrayList<SourceOrganization> lista = new ArrayList<SourceOrganization>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

    /**
     * Consulta os registros da tabela SourceOrganization pela variável copyright
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<SourceOrganization> consultaRegistroPorCopyright(String copyright) throws SQLException {
        String consulta = "select * from SourceOrganization where copyright = '" + copyright + "'";
        ArrayList<SourceOrganization> lista = new ArrayList<SourceOrganization>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

    /**
     * Consulta os registros da tabela SourceOrganization pela variável terms_of_use
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<SourceOrganization> consultaRegistroPorTerms_of_use(String terms_of_use) throws SQLException {
        String consulta = "select * from SourceOrganization where terms_of_use = '" + terms_of_use + "'";
        ArrayList<SourceOrganization> lista = new ArrayList<SourceOrganization>();

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
    private ArrayList<SourceOrganization> carregaLista(ResultSet resultado) throws SQLException {
        ArrayList<SourceOrganization> lista = new ArrayList<SourceOrganization>();
        SourceOrganization sourceOrg = new SourceOrganization();

        while (resultado.next()) {
            sourceOrg.setCopyright_id(resultado.getString("copyright_id"));
            sourceOrg.setName(resultado.getString("name"));
            sourceOrg.setCopyright(resultado.getString("copyright"));
            sourceOrg.setTerms_of_use(resultado.getString("terms_of_use"));

            lista.add(sourceOrg);
        }

        return lista;
    }
}
