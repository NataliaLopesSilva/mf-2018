/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.NataliaLopesSilva.mf2018.codigo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ContaLinhas {

    private static int contTotalLinhas = 0;
    private static String extensao = "";

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        String path = "";

        if (args != null && args.length == 1) {
            //Captura diretório corrente
            path = new File("").getAbsolutePath();
            extensao = args[0];

            contaLinhasArquivos(path);
            System.out.println("Total de linhas: " + contTotalLinhas);
        } else if (args != null && args.length > 1) {
            path = args[0];
            extensao = args[1];

            contaLinhasArquivos(path);
            System.out.println("Total de linhas: " + contTotalLinhas);
        } else {
            System.out.println("Extensão não informada...");
        }
    }

    /**
     * Método responsável por contar as linhas do arquivo.
     * @param path: caminho do arquivo
     * @throws IOException
     */
    public static void contaLinhasArquivos(String path) throws IOException {
        File d = new File(path);
        File[] files = d.listFiles();

        if (files != null) {
            //Com recursividade verifica lista seus arquivos
            for (int i = 0; i < files.length; i++) {
                File arquivoLeitura = new File(files[i].getPath());

                if (arquivoLeitura.isFile() && getExtensaoArquivo(
                        arquivoLeitura.getName()).equals(extensao)) {

                    LineNumberReader linhaLeitura = new LineNumberReader(
                            new FileReader(arquivoLeitura));
                    linhaLeitura.skip(arquivoLeitura.length());
                    int qtdLinha = linhaLeitura.getLineNumber() + 1;
                    contTotalLinhas = qtdLinha;
                    System.out.println(files[i].getPath() + " " + qtdLinha);
                }

                contaLinhasArquivos(files[i].getPath());
            }
        }
    }

    /**
     * Método que identifica a extensão do arquivo
     * @param nomeArquivo
     * @return
     */
    public static String getExtensaoArquivo(String nomeArquivo) {
        if (nomeArquivo.contains(".")) {
            return nomeArquivo.substring(nomeArquivo.lastIndexOf("."));
        } else {
            return "";
        }
    }
}
