package javase.ui;

public class Paciente extends Usuario {
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
        super(0, "", "");
    }

    public Paciente(int id, String nombre, String apellido, String fechaNacimiento,
            String sexo, String tipoSangre, String telefono, String direccion,
            String email, Double peso, Double estatura) { // sobrecarga overload
        // super() es para llamar al constructor de la clase padre Usuario
        super(id, nombre, email);
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

    @Override
    public void mostrarDatosUsuario() {
        System.out.println("\nDatos del paciente");
        System.out.println("Dirreccion: Ocaña");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Email: " + getEmail());
    }

    // con ctrl + N
    // setters
    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setEstatura(Double estatura) {
        this.estatura = estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        if (fechaNacimiento == null) {
            System.out.println("La fecha de nacimiento no puede ser nula");
            return;
        } else if (fechaNacimiento.isEmpty()) {
            System.out.println("La fecha de nacimiento no puede estar vacia");
            return;
        } else if (fechaNacimiento.length() < 10) { // dd/mm/aaaa = 10 caracteres
            System.out.println("La fecha de nacimiento no es valida");
            return;
        }
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public void setTelefono(String telefono) {
        if (telefono == null) {
            System.out.println("El telefono no puede ser nulo");
            return;
        } else if (telefono.isEmpty()) { // isEmpty() es para cadenas de texto
            System.out.println("El telefono no puede estar vacio");
            return;
        } else if (telefono.length() < 11) {
            System.out.println("El telefono no es valido");
        }
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        if (email == null) {
            System.out.println("El email no puede ser nulo");
            return;
        }
        this.email = email;
    }

    // getters
    public Double getPeso() {
        return this.peso;
    }

    public Double getEstatura() {
        return estatura;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
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
        return "+57: " + telefono;
    }

    public String getDirreccion() {
        return direccion;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + getId() + ", nombre=" + getNombre() + ", apellido=" + getApellido() + ", peso="
                + getPeso() +
                "\n, estatura=" + getEstatura() + ", fechaNacimiento=" + getFechaNacimiento() + ", sexo=" + getSexo()
                + ", tipoSangre=" + getTipoSangre() +
                "\n, telefono=" + getTelefono() + ", direccion=" + getDirreccion() + ", email=" + getEmail() + '}';
    }
}
