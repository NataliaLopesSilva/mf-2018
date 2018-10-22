/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.NataliaLopesSilva.mf2018.cnes;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Classe responsável por ler um arquivo .csv e a partir dele gerar uma lista de
 * Estabelecimentos de saúde e criando um arquivo json com eles.
 */
public class Aplicacao {

    /**
     * Variável utilizada para guardar o nome das universidades.
     */
    private String codEstabelecimento;

    /**
     * Variável utilizada para guardar o nome dos estados.
     */
    private String razaoSocial;

    /**
     * Variável utilizada para guardar a latitude.
     */
    private String latitude;

    /**
     * Variável utilizada para guardar a longitude.
     */
    private String longitude;

    /**
     * Variável que possui o valor do número da coluna (posição no array) onde
     * está localizado o código do estabelecimento do documento csv.
     */
    private static final int POSICAO_COD = 1;

    /**
     * Variável que possui o valor do número da coluna (posição no array) onde
     * está localizado a razão social do documento csv.
     */
    private static final int POSICAO_RAZAO_SOCIAL = 5;

    /**
     * Variável que possui o valor do número da coluna (posição no array) onde
     * está localizado a latitude do documento csv.
     */
    private static final int POSICAO_LATITUDE = 39;

    /**
     * Variável que possui o valor do número da coluna (posição no array) onde
     * está localizado a longitude do documento csv.
     */
    private static final int POSICAO_LONGITUDE = 40;

    /**
     * Variável que possui a url de onde o arquivo será baixado.baixado
     */
    public static final String URL = "ftp://ftp.datasus.gov.br/cnes/BASE_DE_DADOS_CNES_201808.ZIP";

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
            String urlInserida = "", nomeArquivoJson = "";

            /*Verifica os argumentos a partir dele define a url de onde o
              documentos será baixado e o nome do arquivo json*/
            if (args != null && args.length > 0) {
                urlInserida = args[0];

                if (args.length > 1) {
                    nomeArquivoJson = args[1];
                }
            } else {
                urlInserida = URL;
                nomeArquivoJson = "Arquivo";
            }

            if (!urlInserida.equals("")) {
                System.out.println("O arquivo está sendo baixado. Aguarde...");

                String[] caminho = urlInserida.split("/");
                String nomeArquivo = caminho[(caminho.length - 1)];
                String destino = "D:\\" + nomeArquivo;

                //Verifica se o arquivo já existe para que ele não seja baixado de novo
                if (!new File(destino).exists()) {
                    //Baixa o arquivo e o coloca no destino designado
                    URL url = new URL(urlInserida);
                    InputStream is = url.openStream();
                    FileOutputStream fos = new FileOutputStream(destino);
                    int bytes;

                    while ((bytes = is.read()) != -1) {
                        fos.write(bytes);
                    }

                    is.close();
                    fos.close();
                }

                //Descomprime arquivo zip e extrai arquivo necessário
                String caminhoArquivoCsv = descompactaArquivoZip(new File(destino));

                //Realiza a leitura do arquivo baixado
                ArrayList listaFinal = Aplicacao.lerArquivoCsv(caminhoArquivoCsv);

                //a partir da lista formada cria um arquivo json
                criaArquivoJson(listaFinal, nomeArquivoJson);

                System.out.println("Arquivo JSON criado com sucesso");
            }
        } catch (MalformedURLException e) {
            System.err.println("Url inválida! " + e.getMessage());
        }
    }

    /**
     * Método que descompacta o arquivo zip passado.
     *
     * @param file
     * @return o caminho para onde foi o arquivo descompactado
     */
    public static String descompactaArquivoZip(File file) {

        byte[] buffer = new byte[1024];

        try {
            // Cria o input do arquivo ZIP
            ZipInputStream zinstream = new ZipInputStream(new FileInputStream(file));

            // Pega a proxima entrada do arquivo
            ZipEntry zentry = zinstream.getNextEntry();
            String caminhoArquivoCsv = "";

            // Enquanto existir entradas no ZIP
            while (zentry != null) {
                // Pega o nome da entrada
                String entryName = zentry.getName();

                if (entryName.contains("tbEstabelecimento")) {
                    caminhoArquivoCsv = file.getAbsolutePath().replace(file.getName(), entryName);

                    // Cria o output do arquivo , Sera extraido onde esta rodando a classe
                    FileOutputStream outstream = new FileOutputStream(new File(file.getAbsolutePath().replace(file.getName(), entryName)));
                    int n;
                    // Escreve no arquivo
                    while ((n = zinstream.read(buffer)) > -1) {
                        outstream.write(buffer, 0, n);
                    }
                    // Fecha arquivo
                    outstream.close();

                    break;
                }

                // Fecha entrada e tenta pegar a proxima
                zinstream.closeEntry();
                zentry = zinstream.getNextEntry();
            }

            // Fecha o zip como um todo
            zinstream.close();

            return caminhoArquivoCsv;
        } catch (IOException ex) {
            ex.printStackTrace();
            return ex.getMessage();
        }
    }

    /**
     * Método responsável por ler o arquivo csv baixado e gerar a lista de
     * estbelecimentos de saúde.
     *
     * @param arquivoCSV caminho do arquivo baixado csv
     * @return a lista de estabeleciomentos formada
     */
    public static ArrayList<Aplicacao> lerArquivoCsv(final String arquivoCSV) {

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

            ArrayList<Aplicacao> listaEstabelecimentoSaude = new ArrayList<>();

            String[] linha;
            int contLinhas = 0;

            //Coleta linha por linha do arquivo csv e adiciona somente os atributos necessários
            for (String linhaCsv : listaCsv) {
                contLinhas++;

                if (contLinhas > 1) {
                    linha = linhaCsv.split(";");

                    Aplicacao obj = new Aplicacao();

                    obj.codEstabelecimento = linha[0];
                    obj.razaoSocial = linha[5];
                    obj.latitude = linha[39];
                    obj.longitude = linha[40];

                    listaEstabelecimentoSaude.add(obj);
                }
            }

            return listaEstabelecimentoSaude;
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

        return null;
    }

    /**
     * Método reponsável por criar um arquivo json com a lista de
     * estabelecimentos formada.
     *
     * @param listaEstabelecimentoSaude
     * @throws IOException
     */
    public static void criaArquivoJson(ArrayList<Aplicacao> listaEstabelecimentoSaude, String nomeArquivoJson) throws IOException {
        try {
            //Transforma a lista de objetos em um arquivo json
            String json = new Gson().toJson(listaEstabelecimentoSaude);

            FileWriter file = new FileWriter(new File(nomeArquivoJson + ".json"));
            file.write(json);
            file.flush();
            file.close();

            //Armazena o nome do caminho em um arquivo json para ser lido no html
            json = new Gson().toJson(nomeArquivoJson + ".json");

            file = new FileWriter(new File("NomeArquivo.json"));
            file.write(json);
            file.flush();
            file.close();
        } catch (Exception e) {
            System.err.println("Dados inválidos...");
        }
    }
}
