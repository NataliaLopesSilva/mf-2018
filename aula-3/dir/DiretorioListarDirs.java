import java.io.File;

public class DiretorioListarDirs {

        public static void main(String[] args) {
        //Captura diret�rio corrente
        String path = new File("").getAbsolutePath();
        listaDiretorio(path);
    }

    public static void listaDiretorio(String path) {
        File d = new File(path);
        File[] files = d.listFiles();

        //Verifica se caminho passado � um diret�rio
        if (d.isDirectory()) {
            System.out.println(d.toString());
        }

        if (files != null) {
            //Com recursividade verifica se seus arquivos s�o diret�rios tamb�m
            for (int i = 0; i < files.length; i++) {
                listaDiretorio(files[i].getPath());
            }
        }
    }
}