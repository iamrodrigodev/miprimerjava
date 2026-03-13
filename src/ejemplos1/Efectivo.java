package ejemplos1;
public class Efectivo implements Pago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con efectivo el monto de: " + monto + "\n");
    }


    @Override
    public void devolver(double monto) {
        System.out.println("Devolviendo con efectivo el monto de: " + monto + "\n");
    }
}
