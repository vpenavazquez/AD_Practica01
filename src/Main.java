import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String baseDir = "/home/dam26/Carpeta";
        String arquivosdirPath = baseDir + "/arquivosdir";
        String testFile = "proba1.txt";

        String fakePath = "/home/dam26/RutaQueNonExiste";
        String fakeFile = "inexistente.txt";

        //Nombres de los ficheros Y subcarpeta para la parte 2
        String subdirPath = arquivosdirPath + "/subcarpeta";
        String file1 = "Products1.txt";
        String file2 = "Products2.txt";


        System.out.println("=== COMPROBACIÓN METODOS PARTE 1  ===\n");

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

        System.out.println("METODO 8 -------- mEscritura");
        System.out.println("[ACIERTO]");
        metodos.mEscritura(arquivosdirPath,testFile);

        System.out.println("[FALLO]");
        metodos.mEscritura(arquivosdirPath, fakeFile);
        System.out.println();

        // 11) metodo mContido

        System.out.println("METODO 11 ------- mContido");
        System.out.println("[ACIERTO]");
        metodos.mContido(arquivosdirPath);

        System.out.println("[FALLO]");
        metodos.mContido(fakePath);
        System.out.println();

        // 9) metodo borraFicheiro

        System.out.println("METODO 9 ------- borraFicheiro");
        System.out.println("[ACIERTO]");
        metodos.borraFicheiro(arquivosdirPath,testFile);

        System.out.println("[FALLO]");
        metodos.borraFicheiro(arquivosdirPath,testFile);
        System.out.println();

        // 10) metodo borra Directorio

        System.out.println("METODO 10 -------- borraDirectorio");
        String subDir = arquivosdirPath + "/subcarpeta";
        metodos.creaDirectorio(subDir);

        System.out.println("[ACIERTO]");
        metodos.borraDirectorio(subDir);

        System.out.println("[FALLO]");
        metodos.borraDirectorio(fakePath);

        System.out.println("=== EXECUCIÓN PARTE 2 CON COMPROBACIÓNS ===\n");


        // 1) Crear 'arquivosdir' e comprobar que é un directorio

        System.out.println("--- PARTE 2 - PASO 1 ---");
        System.out.println("METODO 3 ------ creaDirectorio");
        System.out.println("[ACIERTO]");
        metodos.creaDirectorio(arquivosdirPath);
        System.out.println("[FALLO]");
        metodos.creaDirectorio(arquivosdirPath); // Xa existe

        System.out.println("METODO 1 ----- eDirectorio");
        System.out.println("[ACIERTO]");
        metodos.eDirectorio(arquivosdirPath);
        System.out.println("[FALLO]");
        metodos.eDirectorio(fakePath);
        System.out.println();


        // 2) Crear 'Products1.txt' e comprobar que é un ficheiro

        System.out.println("--- PARTE 2 - PASO 2 ---");
        System.out.println("METODO 4 ------ creaFicheiro");
        System.out.println("[ACIERTO]");
        metodos.creaFicheiro(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.creaFicheiro(fakePath, file1);

        System.out.println("METODO 2 ------ eFicheiro");
        System.out.println("[ACIERTO]");
        metodos.eFicheiro(arquivosdirPath + "/" + file1);
        System.out.println("[FALLO]");
        metodos.eFicheiro(arquivosdirPath);
        System.out.println();


        // 3) Crear 'subdir' e 'Products2.txt' dentro del

        System.out.println("--- PARTE 2 - PASO 3 ---");
        System.out.println("Creando 'subdir' e 'Products2.txt'...");
        metodos.creaDirectorio(subdirPath);
        metodos.creaFicheiro(subdirPath, file2);
        System.out.println();


        // 4) Amosar contido de primeiro nivel de '/arquivosdir'

        System.out.println("--- PARTE 2 - PASO 4 ---");
        System.out.println("METODO 11 ------- mContido");
        System.out.println("[ACIERTO]");
        metodos.mContido(arquivosdirPath);
        System.out.println("[FALLO]");
        metodos.mContido(fakePath);
        System.out.println();

        // 5) Información de Products1.txt Acceso e Lonxitude

        System.out.println("--- PARTE 2 - PASO 5 ---");
        System.out.println("METODO 5 ------ modoAcceso (Products1.txt)");
        System.out.println("[ACIERTO]");
        metodos.modoAcceso(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.modoAcceso(arquivosdirPath, fakeFile);

        System.out.println("METODO 6 ------- calculaLonxitude ");
        System.out.println("[ACIERTO]");
        metodos.calculaLonxitude(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.calculaLonxitude(arquivosdirPath, fakeFile);

        System.out.println(" Edita el fichero productos1.txt y escribe lo que quieras");
        scanner.nextLine();

        System.out.println("METODO 6 ------- calculaLonxitude (Despois de editar)");
        System.out.println("[ACIERTO]");
        metodos.calculaLonxitude(arquivosdirPath, file1);
        System.out.println();


        // 6) Forzar só lectura en Products1.txt

        System.out.println("--- PARTE 2 - PASO 6 ---");
        System.out.println("METODO 7 -------- mLectura");
        System.out.println("[ACIERTO]");
        metodos.mLectura(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.mLectura(arquivosdirPath, fakeFile);

        System.out.println("Comrpeuba que no puedes editar el fichero manualmente");
        System.out.print("Press ENTER para continuar...");
        scanner.nextLine();
        System.out.println();

        // 7) Forzar a que sexa de novo de escritura

        System.out.println("--- PARTE 2 - PASO 7 ---");
        System.out.println("METODO 8 -------- mEscritura");
        System.out.println("[ACIERTO]");
        metodos.mEscritura(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.mEscritura(arquivosdirPath, fakeFile);

        System.out.println("Comprueba que ahora si puedes escribir de nuevo");
        System.out.print("Press ENTER para continuar...");
        scanner.nextLine();
        System.out.println();


        // 8) Borrar Products1.txt

        System.out.println("--- PARTE 2 - PASO 8 ---");
        System.out.println("METODO 9 ------- borraFicheiro (Products1.txt)");
        System.out.println("[ACIERTO]");
        metodos.borraFicheiro(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.borraFicheiro(arquivosdirPath, file1); // Xa foi borrado
        System.out.println();


        // 9) Borrar o resto de arquivos e directorios

        System.out.println("--- PARTE 2 - PASO 9 ---");

        // Borramos el fichero para que no de error
        metodos.borraFicheiro(subdirPath, file2);

        // Proba de borraDirectorio
        System.out.println("METODO 10 -------- borraDirectorio (subdir)");
        System.out.println("[ACIERTO]");
        metodos.borraDirectorio(subdirPath);
        System.out.println("[FALLO]");
        metodos.borraDirectorio(fakePath);

        System.out.println("METODO 10 -------- borraDirectorio (arquivosdir)");
        System.out.println("[ACIERTO]");
        metodos.borraDirectorio(arquivosdirPath);

    }
}




