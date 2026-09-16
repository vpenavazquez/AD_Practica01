import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Rutas absolutas base según el usuario
        String baseDir = "/home/dam26/Carpeta";
        String arquivosdirPath = baseDir + "/arquivosdir";
        String subdirPath = arquivosdirPath + "/subdir";

        // Nombres de los archivos pedidos en la Parte 2
        String file1 = "Products1.txt";
        String file2 = "Products2.txt";

        // Rutas para simular fallos
        String fakePath = "/home/dam26/RutaQueNonExiste";
        String fakeFile = "inexistente.txt";

        // Aseguramos que existe la carpeta contenedora base
        metodos.creaDirectorio(baseDir);

        System.out.println("=== EXECUCIÓN PARTE 2 CON COMPROBACIÓNS ===\n");

        // ---------------------------------------------------------------------
        // 1) Crear 'arquivosdir' e comprobar que é un directorio
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 1 ---");
        System.out.println("METODO 3 ------ creaDirectorio");
        System.out.println("[ACIERTO]");
        metodos.creaDirectorio(arquivosdirPath);
        System.out.println("[FALLO]");
        metodos.creaDirectorio(arquivosdirPath); // Xa existe

        System.out.println("\nMETODO 1 ----- eDirectorio");
        System.out.println("[ACIERTO]");
        metodos.eDirectorio(arquivosdirPath);
        System.out.println("[FALLO]");
        metodos.eDirectorio(fakePath);
        System.out.println();

        // ---------------------------------------------------------------------
        // 2) Crear 'Products1.txt' e comprobar que é un ficheiro
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 2 ---");
        System.out.println("METODO 4 ------ creaFicheiro");
        System.out.println("[ACIERTO]");
        metodos.creaFicheiro(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.creaFicheiro(fakePath, file1);

        System.out.println("\nMETODO 2 ------ eFicheiro");
        System.out.println("[ACIERTO]");
        metodos.eFicheiro(arquivosdirPath + "/" + file1);
        System.out.println("[FALLO]");
        metodos.eFicheiro(arquivosdirPath); // Le pasamos un directorio en vez de archivo
        System.out.println();

        // ---------------------------------------------------------------------
        // 3) Crear 'subdir' e 'Products2.txt' dentro del
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 3 ---");
        System.out.println("Creando 'subdir' e 'Products2.txt'...");
        metodos.creaDirectorio(subdirPath);
        metodos.creaFicheiro(subdirPath, file2);
        System.out.println();

        // ---------------------------------------------------------------------
        // 4) Amosar contido de primeiro nivel de '/arquivosdir'
        // (Debería amosar Products1.txt e subdir)
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 4 ---");
        System.out.println("METODO 11 ------- mContido");
        System.out.println("[ACIERTO]");
        metodos.mContido(arquivosdirPath);
        System.out.println("[FALLO]");
        metodos.mContido(fakePath);
        System.out.println();

        // ---------------------------------------------------------------------
        // 5) Información de Products1.txt (Acceso e Lonxitude)
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 5 ---");
        System.out.println("METODO 5 ------ modoAcceso (Products1.txt)");
        System.out.println("[ACIERTO]");
        metodos.modoAcceso(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.modoAcceso(arquivosdirPath, fakeFile);

        System.out.println("\nMETODO 6 ------- calculaLonxitude (Antes de editar)");
        System.out.println("[ACIERTO]");
        metodos.calculaLonxitude(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.calculaLonxitude(arquivosdirPath, fakeFile);

        System.out.println("\n>>> EDITA AGORA O FICHEIRO 'Products1.txt' MANUALMENTE E ESCRIBE ALGO (ex: 'ola').");
        System.out.print("Preme ENTER cando remates de editalo...");
        scanner.nextLine();

        System.out.println("\nMETODO 6 ------- calculaLonxitude (Despois de editar)");
        System.out.println("[ACIERTO]");
        metodos.calculaLonxitude(arquivosdirPath, file1);
        System.out.println();

        // ---------------------------------------------------------------------
        // 6) Forzar só lectura en Products1.txt
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 6 ---");
        System.out.println("METODO 7 -------- mLectura");
        System.out.println("[ACIERTO]");
        metodos.mLectura(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.mLectura(arquivosdirPath, fakeFile);

        System.out.println("\n>>> COMPROBA QUE NON PODES EDITAR O FICHEIRO MANULMENTE.");
        System.out.print("Preme ENTER para continuar...");
        scanner.nextLine();
        System.out.println();

        // ---------------------------------------------------------------------
        // 7) Forzar a que sexa de novo de escritura
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 7 ---");
        System.out.println("METODO 8 -------- mEscritura");
        System.out.println("[ACIERTO]");
        metodos.mEscritura(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.mEscritura(arquivosdirPath, fakeFile);

        System.out.println("\n>>> COMPROBA QUE AGORA SI PODES ESCRIBIR DE NOVO.");
        System.out.print("Preme ENTER para continuar...");
        scanner.nextLine();
        System.out.println();

        // ---------------------------------------------------------------------
        // 8) Borrar Products1.txt
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 8 ---");
        System.out.println("METODO 9 ------- borraFicheiro (Products1.txt)");
        System.out.println("[ACIERTO]");
        metodos.borraFicheiro(arquivosdirPath, file1);
        System.out.println("[FALLO]");
        metodos.borraFicheiro(arquivosdirPath, file1); // Xa foi borrado
        System.out.println();

        // ---------------------------------------------------------------------
        // 9) Borrar o resto de arquivos e directorios
        // ---------------------------------------------------------------------
        System.out.println("--- PARTE 2 - PASO 9 ---");
        System.out.println("Limpando resto de ficheiros e directorios...");

        // Borramos o ficheiro de dentro de subdir
        metodos.borraFicheiro(subdirPath, file2);

        // Proba de borraDirectorio (con acerto e fallo)
        System.out.println("\nMETODO 10 -------- borraDirectorio (subdir)");
        System.out.println("[ACIERTO]");
        metodos.borraDirectorio(subdirPath);
        System.out.println("[FALLO]");
        metodos.borraDirectorio(fakePath);

        System.out.println("\nMETODO 10 -------- borraDirectorio (arquivosdir)");
        System.out.println("[ACIERTO]");
        metodos.borraDirectorio(arquivosdirPath);

        System.out.println("\n=== FIN DA PARTE 2 ===");
    }
}

