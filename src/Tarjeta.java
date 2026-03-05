public class Tarjeta implements Pago {

    @Override
    public void pagar(double monto) {
        System.out.println("Pagando con tarjeta el monto de: " + monto + "\n");
    }

    @Override
    public void devolver(double monto) {
        System.out.println("Devolver con tarjeta el monto de: " + monto + "\n");
    }
}