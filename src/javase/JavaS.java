package javase;
import javase.ui.Menu;

public class JavaS {

    public static void main(String[] args) {

        //segunda parte con el menu
        Menu.MostrarMenu();




        //primera parte sin el menu solo polimorfismo
        // Menu.MostrarMenu();
        //Doctor doctor1 = new Doctor(1, "Pedro", "pedro45@gmail", "Cardiologia");
        //doctor1.AgregarCita("21/11/2025", "10:00 AM");
        //doctor1.AgregarCita("22/11/2025", "11:00 AM");

        //System.out.println("\nCitas del doctor");
        //for (Doctor.Citas cita : doctor1.getCitas()) { // para recorrer las citas que se tienen en el arraylist
         //   System.out.println("Fecha: " + cita.getDate("DATE") + " Time: " + cita.getTime());
        //}

        //Paciente paciente1 = new Paciente(1, "Pedro", "Perez",
        //        "01/01/2000", "Masculino", "A+", "1234567891",
        //        "Calle 123", "rYHbH@example.com", 80.0, 1.70);
        //System.out.println(paciente1); // aca se llama al toString sin necesidad de escribirlo (polimorfismo)

        //Usuario usuario1 = new Doctor(2, "Maria", "maria@gmail", "Pediatria");
        //usuario1.mostrarDatosUsuario(); // polimorfismo
        
        //Usuario usuario2 = new Enfermera(3, "Luisa", "luisa@gmail");
        //usuario2.mostrarDatosUsuario(); // polimorfismo

        // Usuario usuario3 = new (comando para ver las opciones disponibles al crear un
        // nuevo objeto ctrol + espacio)
        //Usuario usuario3 = new Paciente(1, "Maria alejandra", "Melo", "01/05/2005",
        //        "Femenino", "O+", "1234567890", "Calle 456", "d1RcJ@example.com", 70.0, 1.60);
        //usuario3.mostrarDatosUsuario(); // polimorfismo

    }
}
