package javase;

import java.util.ArrayList;
import java.util.Date;

public class Doctor {
    static int id ;
    private String nombre;
    private String email;
    private String espeliacion;

    
    
    
    //Doctor(){
       // System.out.println("construyecto el objeto doctor");
    //}  
    Doctor(int id, String nombre, String email, String espeliacion){
        this.id = id;
        this.nombre = nombre; //para poder asignarle un valor
        this.email = email;
        this.espeliacion = espeliacion;
    }

    public void MostrarDoctor(){
        System.out.println("\nId: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Email: "+email);
        System.out.println("Especialidad: "+espeliacion);
    }

    public void MostrarId(){
        System.out.println("Id: "+id);
    }


    ArrayList<Citas> citas = new ArrayList<>();
    public void AgregarCita(Date fecha, String time){
        citas.add(new Citas(fecha, time));
    }
    public ArrayList<Citas> getCitas(){
        return citas;
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
    }

}
