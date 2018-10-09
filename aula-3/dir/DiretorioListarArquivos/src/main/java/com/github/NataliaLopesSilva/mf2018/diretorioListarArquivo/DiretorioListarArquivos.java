/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.NataliaLopesSilva.mf2018.diretorioListarArquivo;

import java.io.File;

public class DiretorioListarArquivos {

    /**
     * Classe principal
     * @param args
     */
    public static void main(String[] args) {
        //Captura diretório corrente
        String path = new File("").getAbsolutePath();
	   System.out.println(path);
        listaArquivos(path);
    }

    /**
     * Método que lista os arquivos
     * @param path : caminho do arquivo
     */
    public static void listaArquivos(String path) {
        File d = new File(path);
        File[] files = d.listFiles();

        if (files != null) {
            //Com recursividade verifica lista seus arquivos
            for (int i = 0; i < files.length; i++) {
                System.out.println(files[i].getPath());
                listaArquivos(files[i].getPath());
            }
        }
    }
}