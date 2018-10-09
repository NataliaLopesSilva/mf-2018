/*
 * Copyright (c) 2016.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */
package com.github.NataliaLopesSilva.mf2018.diretorioListarDirs;

import java.io.File;

public class DiretorioListarDirs {

    /**
     * Método principal.
     * @param args
     */
    public static void main(String[] args) {
        //Captura diretório corrente
        String path = new File("").getAbsolutePath();
        listaDiretorio(path);
    }

    /**
     * Método responsável por listar os arquivos.
     * @param path : caminho do arquivo
     */
    public static void listaDiretorio(String path) {
        File d = new File(path);
        File[] files = d.listFiles();

        //Verifica se caminho passado é um diretório
        if (d.isDirectory()) {
            System.out.println(d.toString());
        }

        if (files != null) {
            //Com recursividade verifica se seus arquivos são diretórios também
            for (int i = 0; i < files.length; i++) {
                listaDiretorio(files[i].getPath());
            }
        }
    }
}
