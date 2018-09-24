import java.io.File;

public class DiretorioListarArquivos {

    public static void main(String[] args) {
        //Captura diretório corrente
        String path = new File("").getAbsolutePath();
	   System.out.println(path);
        listaArquivos(path);
    }

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