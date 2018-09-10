import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.LineNumberReader;

public class ContaLinhas {
    
    public static void main(String[] args) throws FileNotFoundException {
        //Captura diretório corrente
        String path = new File("").getAbsolutePath();
        listaArquivos(path);
    }

    public static void listaArquivos(String path) throws FileNotFoundException {
        File d = new File(path);
        File[] files = d.listFiles();

        if (files != null) {
            //Com recursividade verifica lit seus arquivos são diretórios também
            for (int i = 0; i < files.length; i++) {
                File diret = new File(files[i].getPath());

                if (!diret.isDirectory()) {
                    LineNumberReader lnr = new LineNumberReader(new FileReader(files[i].getPath()));
                    int contLinhas = lnr.getLineNumber();
            System.out.println(contLinhas);
                }

                listaArquivos(files[i].getPath());
            }
        }
    }
}