/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.NataliaLopesSilva.codigo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ContaLinhas {

    private static int contTotalLinhas = 0;
    private static String extensao = "";

    public static int getContTotalLinhas() {
        return contTotalLinhas;
    }

    public static void setContTotalLinhas(int contTotalLinhas) {
        ContaLinhas.contTotalLinhas += contTotalLinhas;
    }

    public static String getExtensao() {
        return extensao;
    }

    public static void setExtensao(String extensao) {
        ContaLinhas.extensao = extensao;
    }

    public static void main(String[] args) throws IOException {
        String path = "";

        if (args != null && args.length == 1) {
            //Captura diretório corrente
            path = new File("").getAbsolutePath();
            setExtensao(args[0]);

            contaLinhasArquivos(path);
            System.out.println("Total de linhas: " + getContTotalLinhas());
        } else if (args != null && args.length > 1) {
            path = args[0];
            setExtensao(args[1]);

            contaLinhasArquivos(path);
            System.out.println("Total de linhas: " + getContTotalLinhas());
        } else {
            System.out.println("Extensão não informada...");
        }
    }

    public static void contaLinhasArquivos(String path) throws IOException {
        File d = new File(path);
        File[] files = d.listFiles();

        if (files != null) {
            //Com recursividade verifica lista seus arquivos
            for (int i = 0; i < files.length; i++) {
                File arquivoLeitura = new File(files[i].getPath());

                if (arquivoLeitura.isFile() && getExtensaoArquivo(
                        arquivoLeitura.getName()).equals(getExtensao())) {

                    LineNumberReader linhaLeitura = new LineNumberReader(
                            new FileReader(arquivoLeitura));
                    linhaLeitura.skip(arquivoLeitura.length());
                    int qtdLinha = linhaLeitura.getLineNumber() + 1;
                    setContTotalLinhas(qtdLinha);
                    System.out.println(files[i].getPath() + " " + qtdLinha);
                }

                contaLinhasArquivos(files[i].getPath());
            }
        }
    }

    static String getExtensaoArquivo(String nomeArquivo) {
        if (nomeArquivo.contains(".")) {
            return nomeArquivo.substring(nomeArquivo.lastIndexOf("."));
        } else {
            return "";
        }
    }
}
