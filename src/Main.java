//import java.util.Scanner;

import ejemplos2.Perro;

public class Main {
    public static void main(String[] args) {

    Perro perro1 = new Perro("juan", 10);
    
    System.out.println("Primera ronda");
    perro1.obtenerInformacion();

    System.out.println("\nSegunda ronda");
    perro1.setEdad(90); // 10 -> 11
    perro1.obtenerInformacion();


    }
}
