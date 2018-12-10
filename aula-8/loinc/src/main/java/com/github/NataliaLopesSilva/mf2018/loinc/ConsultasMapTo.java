package com.github.NataliaLopesSilva.mf2018.loinc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe que contém as consultas pertinentes a tabela MapTo
 *
 * @author Nat
 */
public class ConsultasMapTo {

    /**
     * Consulta todos os registros da tabela MapTo
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<MapTo> consultaTodosRegistros() throws SQLException {
        String consulta = "select * from MapTo";
        ArrayList<MapTo> lista = new ArrayList<MapTo>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

    /**
     * Consulta os registros da tabela MapTo pela variável loinc
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<MapTo> consultaRegistroPorLoinc(String loinc) throws SQLException {
        String consulta = "select * from MapTo where loinc = '" + loinc + "'";
        ArrayList<MapTo> lista = new ArrayList<MapTo>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

    /**
     * Consulta os registros da tabela MapTo pela variável map_to
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<MapTo> consultaRegistroPorMap_to(String map_to) throws SQLException {
        String consulta = "select * from MapTo where map_to = '" + map_to + "'";
        ArrayList<MapTo> lista = new ArrayList<MapTo>();

        ResultSet resultado = Conexao.executaConsulta(consulta);
        lista = carregaLista(resultado);

        return lista;
    }

    /**
     * Consulta os registros da tabela MapTo pela variável comment
     *
     * @return Uma lista preenchida com os registros pesquisados
     * @throws SQLException
     */
    public ArrayList<MapTo> consultaRegistroPorComment(String comment) throws SQLException {
        String consulta = "select * from MapTo where comment = '" + comment + "'";
        ArrayList<MapTo> lista = new ArrayList<MapTo>();

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
    private ArrayList<MapTo> carregaLista(ResultSet resultado) throws SQLException {
        ArrayList<MapTo> lista = new ArrayList<MapTo>();
        MapTo mapTo = new MapTo();

        while (resultado.next()) {
            mapTo.setLoinc(resultado.getString("loinc"));
            mapTo.setMap_to(resultado.getString("map_to"));
            mapTo.setComment(resultado.getString("comment"));

            lista.add(mapTo);
        }

        return lista;
    }
}
