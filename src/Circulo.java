public class Circulo extends Forma  {

    private double radio;

    public Circulo(double _radio) {
        this.radio = _radio;
    }

    //@Override
    //double calcularArea() {
    //    return this.radio * this.radio * Math.PI ;
    //}

    @Override
    void calcularArea() {
        System.out.println("El área del círculo es: " + this.radio * this.radio * Math.PI + "\n");
    }
    
}
