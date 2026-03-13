package ejemplos2;

import utilitarios.VerificarAtributos;

public class Perro {
    // Atributos
    private String nombre;
    private int edad;
    
    // Constructor
    public Perro(String nombre, int edad) {
        // validar: el nombre no esta vacio y que la edad sea valida (entre un rango de 0 a 15)
        VerificarAtributos.verificarNombre(nombre);
        
        VerificarAtributos.verificarEdad(edad);

        this.nombre = nombre;
        this.edad = edad;
    }

    // Getter
    public void obtenerInformacion() {
        System.out.println("Datos personales del perro");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // Setters
    public void setNombre(String nuevoNombre) {
        VerificarAtributos.verificarNombre(nuevoNombre);
        nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad) {
        VerificarAtributos.verificarEdad(nuevaEdad);
        edad = nuevaEdad;
    }
}
