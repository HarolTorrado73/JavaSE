package javase.ui;

public class Paciente {
    int id;
    String nombre;
    String apellido;
    String peso;
    Double estatura;
    String fechaNacimiento;
    String sexo;
    String tipoSangre;
    String telefono;
    String direccion;
    String email;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String apellido, String fechaNacimiento, 
                    String sexo, String tipoSangre, String telefono, String direccion, 
                    String email, String peso, Double estatura) { //sobre carga
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.tipoSangre = tipoSangre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.email = email;
        this.peso = peso;
        this.estatura = estatura;
    }

    
}
