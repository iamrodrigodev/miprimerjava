//import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        //Scanner sc = new Scanner(System.in); // iniciar el cin >>

        //Persona p1 = new Persona("Rodrigo", 50);
        //Persona p2 = new Persona("Rodrigo", 50);
        //Persona p3 = new Persona("Rodrigo", 50);


        // p1.obtenerInformacion();

        Rectangulo rec1 = new Rectangulo(10, 5);

        // System.out.println("Área del rectangulo: " + rec1.calcularArea());
        

        rec1.calcularArea();

        Circulo cir1 = new Circulo(10.5);

        cir1.calcularArea();
    }
}
