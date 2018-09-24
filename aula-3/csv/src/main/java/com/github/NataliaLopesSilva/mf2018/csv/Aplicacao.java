/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.NataliaLopesSilva.mf2018.csv;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Classe responsável por ler um arquivo .csv e a partir dele gerar uma lista de
 * Estados com as respectivas quantidades de universidades dentro de cada um.
 */
public class Aplicacao {

    /**
     * Variável utilizada para guardar o nome das universidades.
     */
    private String universidade;
    /**
     * Variável utilizada para guardar o nome dos estados.
     */
    private String estado;
    /**
     * Variável utilizada para guardar a quantidade de universidades por estado.
     */
    private int qtdaUniversidades;
    /**
     * Variável que possui o valor da primeira linha que a partir dela deve se
     * iniciar a contagem para a lista.
     */
    private static final int LINHA_INICIAL = 11;
    /**
     * Variável que possui o valor da última linha que a partir dela deve se
     * finalizar a contagem para a lista.
     */
    private static final int LINHA_FINAL = 2377;

    /**
     * Variável que possui o valor do número da coluna (posição no array) onde
     * está localizado o nome das Universidades do documento csv.
     */
    private static final int POSICAO_UNIVERSIDADE = 2;

    /**
     * Variável que possui o valor do número da coluna (posição no array) onde
     * está localizado o nome dos Estados do documento csv.
     */
    private static final int POSICAO_ESTADO = 8;

    /**
     * Método main da classe Aplicacao.
     *
     * @param args argumentos da classe Aplicacao, método main.
     * @throws MalformedURLException exceção de url inválidade.
     * @throws IOException exceção para os objetos File e similares.
     */
    public static void main(final String[] args) throws MalformedURLException,
            IOException {
        try {
            String urlInserida;

            /*Verifica os argumentos  a partir dele define a url de onde o
              documentos será baixado*/
            if (args != null && args.length > 0) {
                urlInserida = args[0];
            } else {
                urlInserida = "http://repositorio.dados.gov.br/educacao/CADASTR"
                        + "O%20DAS%20IES_2011.csv";
            }

            //Baixa o arquivo e o coloca no destino designado
            URL url = new URL(urlInserida);
            String destino = "D:\\CADASTRO%20DAS%20IES_2011.csv";

            InputStream is = url.openStream();
            FileOutputStream fos = new FileOutputStream(destino);
            int bytes;

            while ((bytes = is.read()) != -1) {
                fos.write(bytes);
            }

            is.close();
            fos.close();

            //Realiza a leitura do arquivo baixado
            Aplicacao.lerArquivoCsv(destino);
        } catch (MalformedURLException e) {
            System.err.println("Url inválida! " + e.getMessage());
        }
    }

    /**
     * Método responsável por ler o arquivo csv baixado e gerar a lista de
     * estados com as quantidades de universidades existentes em cada um.
     *
     * @param arquivoCSV caminho do arquivo baixado csv
     */
    public static void lerArquivoCsv(final String arquivoCSV) {

        BufferedReader br = null;

        try {
            //Através do caminho pega o arquivo
            BufferedReader bufferedReader = new BufferedReader(
                    new InputStreamReader(new FileInputStream(arquivoCSV)));
            ArrayList<String> listaCsv = new ArrayList<>();
            String line;

            //Realiza leitura, linha a linha
            while ((line = bufferedReader.readLine()) != null) {
                listaCsv.add(line);
            }

            bufferedReader.close();

            ArrayList<Aplicacao> listaEstadosUniv = new ArrayList<>();
            ArrayList<Aplicacao> listaEstados = new ArrayList<>();

            String[] linha;
            int contLinhas = 0;
            boolean validaEstado = false;

            //Coleta linha por linha do arquivo csv
            for (String linhaCsv : listaCsv) {
                contLinhas++;

                if (contLinhas > LINHA_INICIAL && contLinhas < LINHA_FINAL) {
                    linha = linhaCsv.split(";");

                    Aplicacao obj = new Aplicacao();

                    obj.universidade = linha[POSICAO_UNIVERSIDADE];
                    obj.estado = linha[POSICAO_ESTADO];

                    listaEstadosUniv.add(obj);

                    for (Aplicacao objEstado : listaEstados) {
                        if (objEstado.estado.equals(obj.estado)) {
                            validaEstado = true;
                        }
                    }

                    if (!validaEstado) {
                        obj.universidade = "";
                        listaEstados.add(obj);
                    }

                    validaEstado = false;
                }
            }

            /*Filtra os estados brasileiros sem duplicidade e conta a quantidade
            de universiades em cada estado*/
            for (Aplicacao objFinal : listaEstados) {
                for (Aplicacao objAux : listaEstadosUniv) {
                    if (objFinal.estado.equals(objAux.estado)
                            && objFinal.universidade != null) {
                        objFinal.qtdaUniversidades++;
                    }
                }
            }

            //Ordena e exibe a lista de estados
            ordenaExibeListaEstadosDecrescente(listaEstados);
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.err.println("Dados inválidos...");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.err.println(e.getMessage());
                }
            }
        }
    }

    /**
     * Método responsável por ordenar a lista de estados em ordem decrescente de
     * qtda de universidades por estado.
     *
     * @param listaEstados que possui a lista dos estado com as respectivas qtda
     * de universidades.
     */
    public static void ordenaExibeListaEstadosDecrescente(
            final ArrayList<Aplicacao> listaEstados) {

        ArrayList<Aplicacao> listaEstadosFinal = new ArrayList<>();
        int qtdaUniversidades = 0;
        String estado = "";
        int cont = 0;
        boolean validaEstado = false;

        //Ordena a lista de estados por qtdaUniversidade em ordem
        //decrescente
        while (cont < listaEstados.size()) {
            for (Aplicacao obj : listaEstados) {
                if (qtdaUniversidades < obj.qtdaUniversidades) {
                    for (Aplicacao objII : listaEstadosFinal) {
                        if (obj.estado.equals(objII.estado)) {
                            validaEstado = true;
                        }
                    }

                    if (!validaEstado) {
                        qtdaUniversidades = obj.qtdaUniversidades;
                        estado = obj.estado;
                    }

                    validaEstado = false;
                }
            }

            Aplicacao objFinal = new Aplicacao();
            objFinal.estado = estado;
            objFinal.qtdaUniversidades = qtdaUniversidades;
            listaEstadosFinal.add(objFinal);

            //Exibe o estado por estado em ordem descrescente
            System.out.println(objFinal.estado + " - "
                    + objFinal.qtdaUniversidades);

            cont++;
            qtdaUniversidades = 0;
        }
    }
}
