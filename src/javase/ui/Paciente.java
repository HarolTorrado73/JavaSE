package javase.ui;

public class Paciente {
    private int id;
    private String nombre;
    private String apellido;
    private Double peso;
    private Double estatura;
    private String fechaNacimiento;
    private String sexo;
    private String tipoSangre;
    private String telefono;
    private String direccion;
    private String email;

    public Paciente() {
    }

    public Paciente(int id, String nombre, String apellido, String fechaNacimiento, 
                    String sexo, String tipoSangre, String telefono, String direccion, 
                    String email, Double peso, Double estatura) { //sobre carga
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
   //con ctrl + N
    //setters
    public void setPeso (Double peso) {
        this.peso = peso;
    }

    public void setEstatura (Double estatura) {
        this.estatura = estatura;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setApellido (String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento (String fechaNacimiento) {
        if (fechaNacimiento == null) {
            System.out.println("La fecha de nacimiento no puede ser nula");
            return;
        }else if (fechaNacimiento.isEmpty()) {
            System.out.println("La fecha de nacimiento no puede estar vacia");
            return;
        }else if (fechaNacimiento.length() < 10) { //dd/mm/aaaa = 10 caracteres
            System.out.println("La fecha de nacimiento no es valida");
            return;
        }   
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo (String sexo) {
        this.sexo = sexo;
    }

    public void setTipoSangre (String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setTelefono (String telefono) {
        if (telefono == null) {
            System.out.println("El telefono no puede ser nulo");
            return;
        }else if (telefono.isEmpty()) { //isEmpty() es para cadenas de texto
            System.out.println("El telefono no puede estar vacio");
            return;
        }else if (telefono.length() < 11) {
            System.out.println("El telefono no es valido");
        }
        this.telefono = telefono;
    }
    public void setDireccion (String direccion) {
        this.direccion = direccion;
    }
    public void setEmail (String email) {
        if (email == null) {
            System.out.println("El email no puede ser nulo");
            return;
        }
        this.email = email;
    }
    
    //getters
    public Double getPeso() {
        return this.peso + " Kg";
    }

    public Double getEstatura() {
        return estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }
    
    public String getTipoSangre() {
        return tipoSangre + " Rh";
    }
    public String getTelefono() {
        return "+57: "+telefono;
    }
}
