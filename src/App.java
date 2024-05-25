import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
     leerArchivo("datos.csv");

     

    }

    static void leerArchivo(String ruta) {
        try {
            File myObj = new File(ruta);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String linea = myReader.nextLine();
                System.out.println(linea);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
