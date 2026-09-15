import java.io.File;
import java.io.IOException;



public class metodos {

    // 1) metodo eDirectorio(cadea)

    public static void eDirectorio(String cadea) {
        File f = new File(cadea);
        if (f.isDirectory()) {
            System.out.println("e un directorio");
        } else {
            System.out.println("non e un directorio");
        }
    }


    // 2) eFicheiro(cadea)

    public static void eFicheiro(String cadea) {
        File f = new File(cadea);
        if (f.isFile()) {
            System.out.println("e un ficheiro");
        } else {
            System.out.println("non e ficheiro");
        }


    }

    // 3) crearDirectorio(String)

    public static void creaDirectorio(String cadea) {
        File dir = new File(cadea);

        if (dir.exists()) {
            System.out.println("O directorio xa existe");
        } else if (dir.mkdirs()) {
            System.out.println("Directorio creado");
        } else {
            System.out.println("O directorio no se pudo crear");
        }
    }

    // 4) metodo creaFicheiro (dirName, fileName);

    public static void creaFicheiro(String dirName, String fileName) {
        File dir = new File(dirName);

        if (!dir.isDirectory()) {
            System.out.println("A ruta non existe ou non é un directorio");
            return;
        }

        File fail = new File(dir, fileName);
        try {
            if (fail.createNewFile()) {
                System.out.println("Ficheiro creado correctamente.");
            } else {
                System.out.println("O ficheiro xa existe.");
            }
        } catch (IOException e) {
            System.out.println("Erro ao crear o ficheiro: " + e.getMessage());
        }
    }


    // 5) método de Acceso a ficheros (dirName, fileName)

    public static void modoAcceso( String dirName, String fileName){
        File f = new File(dirName, fileName);

        if (f.canWrite()){
            System.out.println("Se pode leer");
        }else {
            System.out.println("Non se pode leer");
        }

        if (f.canRead()){
            System.out.println("Se pode escribir");
        }else {
            System.out.println("Non se pode escribir");
        }
    }

    // 6) metodo calculaLonxitude(dirName, fileName);

    public static void calculaLonxitude(String dirName, String fileName){

        File f = new File(dirName, fileName);

        if (f.exists() && f.isFile()){
            System.out.println("Lonxitude " + f.length() + " bytes");
        }else {
            System.out.println("O ficheiro non existe");
        }
    }

    // 7) metodo solo lectura(dirName, fileName);

    public static void mLectura(String dirName, String fileName){
        File f = new File(dirName, fileName);

        if (f.exists()){
            if (f.setReadOnly()){
                System.out.println("O Ficheiro e solo de escritura");
            }else {
                System.out.println("O ficheiro non se pudo poñer solo esritura");
            }

        }else {
            System.out.println("O ficheiro non existe");
        }
    }

    // 8) metodo facer escribible(dirName, fileName);

    public static void mEscritura(String dirName, String fileName){
        File f = new File(dirName, fileName);

        if (f.exists()){
            if (f.setWritable(true)){
                System.out.println("Se pode escribir no ficheiro");
            }else {
                System.out.println("O ficheiro non se pode escribir");
            }

        }else {
            System.out.println("O ficheiro non existe");
        }

    }

    // 9) metodo borrar un ficheiro (dirName, fileName)

    public static void borraFicheiro(String dirName, String fileName){
        File f = new File(dirName, fileName);

        if (f.exists() && f.isFile()){
            if (f.delete()){
                System.out.println("ficheiro eliminado");
            }else {
                System.out.println("Non se pudo eliminar o ficheiro");
            }
        }else {
            System.out.println("Non existe o ficheiro");
        }
    }

    // 10) metodo borrar un directorio (dirName )

    public static void borraDirectorio(String dirName){
        File dir = new File(dirName);

        if (dir.exists() && dir.isDirectory()){
            if (dir.delete()){
                System.out.println("directorio eliminado");
            }else {
                System.out.println("Non se pudo eliminar o directorio");
            }
        }else {
            System.out.println("Non existe o directorio");
        }
    }

    // 11) Metodo para enseñar los archivos y directorios de una ruta (dirName)

    public static void mContido(String dirName){
        File dir = new File(dirName);

        if (dir.exists() && dir.isDirectory()){
            String[] elementos = dir.list();
            if (elementos != null) {
                for (String elemento : elementos) {
                    System.out.println(elemento);
                }
            }
        }else{System.out.println("A ruta non existe ou non é un directorio");}
    }



}


