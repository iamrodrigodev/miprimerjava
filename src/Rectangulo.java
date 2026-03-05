public class Rectangulo extends Forma {
    double base;
    double altura;

    public Rectangulo(double _base, double _altura) {
        this.base = _base;
        this.altura = _altura;
    }

    //@Override
    // double calcularArea() {
    //    return this.base * this.altura;
    //}

    @Override
    void calcularArea() {
        System.out.println("El área del rectangulo es: " + this.base * this.altura + "\n");
    }
    
}
