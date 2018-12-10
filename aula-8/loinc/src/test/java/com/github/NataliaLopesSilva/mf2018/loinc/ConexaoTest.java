package com.github.NataliaLopesSilva.mf2018.loinc;

import java.sql.Connection;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

/**
 * Testes para Classe Conexão
 * @author Nat
 */
public class ConexaoTest {

    /**
     * Teste de conexão com o banco de dados
     */
    @Test
    public void testGetConnection() {
        Connection expResult = null;
        Connection result = Conexao.getConnection();
        assertEquals(expResult, result);
    } 
}
