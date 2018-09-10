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
import java.util.Scanner;

public class Aplicacao {

    private String universidade;
    private String estado;
    private int qtdaUniversidades;

    public static void main(String[] args) throws MalformedURLException, IOException {
        try {

            System.out.print("Digite a url desejada: ");

            Scanner ler = new Scanner(System.in);
            String urlInserida;
            urlInserida = ler.nextLine();

            if (urlInserida.equals("")) {
                urlInserida = "http://repositorio.dados.gov.br/educacao/CADASTRO%20DAS%20IES_2011.csv";
            } 

            URL url = new URL(urlInserida);
            String destino = "D:\\CADASTRO%20DAS%20IES_2011.csv";

            InputStream is = url.openStream();

            FileOutputStream fos = new FileOutputStream(destino);

            int bytes = 0;

            while ((bytes = is.read()) != -1) {
                fos.write(bytes);
            }

            is.close();
            fos.close();

            Aplicacao.lerArquivoCsv();
        } catch (MalformedURLException e) {
            System.err.println("Url inválida!");
        }
    }

    //Método responsável por ler o arquivo csv baixado
    public static void lerArquivoCsv() {

        String arquivoCSV = "D:\\CADASTRO%20DAS%20IES_2011.csv";
        BufferedReader br = null;

        try {

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(arquivoCSV)));
            ArrayList<String> listaCsv = new ArrayList<>();
            String line;

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

                if (contLinhas > 11 && contLinhas < 2377) {
                    linha = linhaCsv.split(";");

                    Aplicacao obj = new Aplicacao();

                    obj.universidade = linha[2];
                    obj.estado = linha[8];

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

            //Filtra os estados brasileiros sem duplicidade
            for (Aplicacao objFinal : listaEstados) {
                for (Aplicacao objAux : listaEstadosUniv) {
                    if (objFinal.estado.equals(objAux.estado)) {
                        objFinal.qtdaUniversidades++;
                    }
                }
            }

            ArrayList<Aplicacao> listaEstadosFinal = new ArrayList<>();
            int qtdaUniversidades = 0;
            String estado = "";
            int cont = 0;
            validaEstado = false;

            //Ordena a lista de estados por qtdaUniversidade em ordem decrescente
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
                System.out.println(objFinal.estado + " - " + objFinal.qtdaUniversidades);

                cont++;
                qtdaUniversidades = 0;
            }

            //Ordena por ordem decrescente
        } catch (FileNotFoundException e) {
            System.err.println("Arquivo não encontrado");
        } catch (IOException e) {
            System.err.println("Dados inválidos...");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
            }
        }
    }
}