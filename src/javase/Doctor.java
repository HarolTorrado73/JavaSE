package javase;

import java.util.ArrayList;
import java.util.Date;
import javase.ui.Usuario;

public class Doctor extends Usuario {
    private String espeliacion;

    // Doctor(){
    // System.out.println("construyecto el objeto doctor");
    // }
    public Doctor(int id, String nombre, String email, String espeliacion) {
        super(id, nombre, email); // llama al constructor de la clase padre
        this.espeliacion = espeliacion;
    }

    public void MostrarDoctor() {
        System.out.println("\nId: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Especialidad: " + espeliacion);
    }

    public void MostrarId() {
        System.out.println("Id: " + getId());
    }

    ArrayList<Citas> citas = new ArrayList<>();

    public void AgregarCita(Date fecha, String time) {
        citas.add(new Citas(fecha, time));
    }

    public ArrayList<Citas> getCitas() {
        return citas;
    }

    @Override
    public String toString() { // super.toString() llama al que esta en usuario y se sobreescribe el toString
        return super.toString() + "\nEspecialidad: " + espeliacion + "\nCitas: " + citas;
    }

    @Override
    public void mostrarDatosUsuario() {
        System.out.println("Datos del doctor\n");
        System.out.println("Hospital : Cruz rojo");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Especialidad: " + espeliacion);
    }

    public static class Citas {
        private Date fecha;
        private int idAsignacion;
        private String time;

        public Citas(Date fecha, String time) {
            this.fecha = fecha;
            this.time = time;
        }

        public void setIdAsignacion(int idAsignacion) {
            this.idAsignacion = idAsignacion;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

        public int getIdAsignacion() {
            return idAsignacion;
        }

        public String getTime() {
            return time;
        }

        public Date getFecha() {
            return fecha;
        }

        @Override
        // sobreescribiendo el metodo toString de usuario
        public String toString() {
            return "Citas{" + "fecha=" + getFecha() + ", \nidAsignacion=" + getIdAsignacion() +
                    ", \ntime=" + getTime() + '}';
                    //ESTE tostring se llama pero sin el super 
        }
    }

}
