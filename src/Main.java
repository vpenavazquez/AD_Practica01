import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseDir = "/home/dam26/Carpeta";
        String arquivosdirPath = baseDir + "/arquivosdir";
        String testFile = "proba1.txt";
        String fakePath = "/home/dam26/RutaQueNonExiste";
        String fakeFile = "inexistente.txt";

        System.out.println("=== COMPROBACIÓN METODOS  ===\n");

        // 3) creaDirectorio

        System.out.println("METODO 3 ------ creaDirectorio");
        System.out.println("[ACIERTO]");
        metodos.creaDirectorio(arquivosdirPath);

        System.out.println("[FALLO]");
        metodos.creaDirectorio(arquivosdirPath);
        System.out.println();

        //1) comprobar metodo eDirecotirio

        System.out.println("METODO 1 ----- Comprobar directorio");
        System.out.println("[ACIERTO]");
        metodos.eDirectorio(arquivosdirPath);

        System.out.println("[FALLO]");
        metodos.eDirectorio(fakePath);
        System.out.println();

        //4) crearFicheiro

        System.out.println("METODO 4 ------ creaFichero");
        System.out.println("[ACIERTO]");
        metodos.creaFicheiro(arquivosdirPath, testFile);

        System.out.println("[FALLO]");
        metodos.creaFicheiro(fakePath, testFile);
        System.out.println();

        // 2) metodo eFicheiro
        System.out.println("METODO 2 ------ Comprobar Ficheiro");

        System.out.println("[ACIERTO]");
        metodos.eFicheiro(arquivosdirPath + "/" + testFile);

        System.out.println("[FALLO]");
        metodos.eFicheiro(arquivosdirPath);
        System.out.println();

        // 5) metodo modoAcceso

        System.out.println("METODO 5 ------ modoAcceso");
        System.out.println("[ACIERTO]");
        metodos.modoAcceso(arquivosdirPath,testFile);

        System.out.println("[FALLO]");
        metodos.modoAcceso(arquivosdirPath,fakeFile);
        System.out.println();

        // 6) metodo calculaLonxitude

        System.out.println("METODO 6 ------- calculaLonxitude");
        System.out.println("[ACIERTO]");
        metodos.calculaLonxitude(arquivosdirPath,testFile);

        System.out.println("[FALLO]");
        metodos.calculaLonxitude(arquivosdirPath,fakeFile);
        System.out.println();

        // 7) metodo mLectura

        System.out.println("METODO 7 -------- mLectura");
        System.out.println("[ACIERTO]");
        metodos.mLectura(arquivosdirPath,testFile);

        System.out.println("[FALLO]");
        metodos.mLectura(arquivosdirPath,fakeFile);
        System.out.println();

        // 8) metodo mEscritura

    }
}