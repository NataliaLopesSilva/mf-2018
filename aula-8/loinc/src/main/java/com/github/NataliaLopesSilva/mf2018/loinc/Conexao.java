package com.github.NataliaLopesSilva.mf2018.loinc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe que trata da conexão com o banco de dados postgre
 * @author Nat
 */
public class Conexao {

    /**
     * Classe que estabele a conexão 
     * @return a connection
     */
    public static Connection getConnection() {
        Connection conexao = null;

        try {
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Loinc", "postgres", "12345");

            System.out.println("Conexão realizada com sucesso...");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro de drive: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Erro de conexão: " + e.getMessage());
        }

        return conexao;
    }

    /**
     * Executa as consultas sql passadas por parâmetros
     * @param consulta sql
     * @return o resultado da consulta
     * @throws SQLException
     */
    public static ResultSet executaConsulta(String consulta) throws SQLException {
        Connection conn = Conexao.getConnection();
        Statement estado = conn.createStatement();
        ResultSet resultado = estado.executeQuery(consulta);

        return resultado;
    }
}
