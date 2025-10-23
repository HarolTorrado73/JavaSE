package javase.ui;

public abstract class Usuario {
    private int id;
    private String nombre;
    private String email;

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + getId() + ", nombre=" + getNombre() + ", email=" + getEmail() + '}';
    }

    public abstract void mostrarDatosUsuario();
}
