package utilitarios;

public class VerificarAtributos {

    public static void verificarNombre(String nombre) {
        if(nombre == null || nombre.trim().isEmpty()) { throw new IllegalArgumentException("El nombre no puede estar vacio, " + "nombre ingresado: " + nombre); }
    }

    public static void verificarEdad(int edad) {
        if(edad >= 0 && edad >= 15) { throw new IllegalArgumentException("La edad no esta entre el rango (0-15), " + "edad ingresada: " + edad); }
    }
}
