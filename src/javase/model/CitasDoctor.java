package javase.model;

import javase.ui.Paciente;

public class CitasDoctor implements Checar {

    private ind id;
    private Paciente paciente;
    private Doctor doctor;
    private Date fecha;
    private String time;

    //getters y setters
    public int getId() {    
        return id;
    }   
    public void setId(int id) {
        this.id = id;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Doctor getDoctor() {
        return doctor;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    



}
