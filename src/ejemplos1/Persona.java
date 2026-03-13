package ejemplos1;
public class Persona {
    final String nombre;
    private final int edad;

    // CONSTRUCTOR DE LA PERSONA
    public Persona(String _nombre, int _edad) {
        this.nombre = _nombre;
        this.edad = _edad;
    }

    // METODOS DE LA PERSONA
    public void obtenerInformacion(){
        System.out.println("Nombre: " + nombre); // cout <<
        System.out.println("Edad: " + edad); // cout <<
    }
}
