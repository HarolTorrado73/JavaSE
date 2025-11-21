package javase;

import java.text.SimpleDateFormat;
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

    public void AgregarCita(String date, String time) {
        citas.add(new Citas(date, time));
    }

    public ArrayList<Citas> getCitas() {
        return citas;
    }

    @Override
    public String toString() { // super.toString() llama al que esta en usuario y se sobreescribe el toString
        return super.toString() + "\nEspecialidad: " + espeliacion + "\nCitas: " + citas;
    }

    @Override // polimorfismo sobreescribiendo el metodo mostrarDatosUsuario de la clase
              // Usuario
    public void mostrarDatosUsuario() {
        System.out.println("Datos del doctor\n");
        System.out.println("Hospital : Cruz roja");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
        System.out.println("Especialidad: " + espeliacion);
    }

    public static class Citas {
        private Date date;
        private int idAsignacion;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy"); // formato de fecha (patron)

        public Citas(String date, String time) {
            try {
                this.date = format.parse(date); // parse convierte string a date
            } catch (Exception e) { // validacion de nuestro error
                e.printStackTrace();
            }

            this.time = time;
        }

        public void setIdAsignacion(int idAsignacion) {
            this.idAsignacion = idAsignacion;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public int getIdAsignacion() {
            return idAsignacion;
        }

        public String getTime() {
            return time;
        }

        public Date getDate() {
            return date;
        }

        public String getDate(String DATE) { // DATRE identificador de bandera
            return format.format(date);
        }

        @Override
        // sobreescribiendo el metodo toString de usuario
        public String toString() {
            return "Citas{" + "fecha=" + getDate("DATE") + ", \nidAsignacion=" + getIdAsignacion() +
                    ", \ntime=" + getTime() + '}';
            // ESTE tostring se llama pero sin el super
        }
    }

}
