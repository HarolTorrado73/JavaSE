package javase.ui;

public class Enfermera extends Usuario {
    private String especialidad;

    public Enfermera(String name, String email) {
        super(name, email);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

}
