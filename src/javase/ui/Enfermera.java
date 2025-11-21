package javase.ui;

public class Enfermera extends Usuario {

    public Enfermera(int id, String nombre, String email) {
        super(id, nombre, email);
    }

    @Override
    public void mostrarDatosUsuario() {
        System.out.println("\nDatos de la enfermera");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
    }
}