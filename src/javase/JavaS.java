package javase;

import java.util.Date;
import javase.ui.Enfermera;
import javase.ui.Paciente;
import javase.ui.Usuario;

public class JavaS {

    public static void main(String[] args) {

        // Menu.MostrarMenu();
        Doctor doctor1 = new Doctor(1, "Pedro", "pedro45@gmail", "Cardiologia");
        doctor1.AgregarCita(new Date(), "10:00 AM");
        doctor1.AgregarCita(new Date(), "11:00 AM");

        System.out.println("\nCitas del doctor");
        for (Doctor.Citas cita : doctor1.getCitas()) { // para recorrer las citas que se tienen en el arraylist
            System.out.println("Fecha: " + cita.getFecha() + " Time: " + cita.getTime());
        }

        Paciente paciente1 = new Paciente(1, "Pedro", "Perez",
                "01/01/2000", "Masculino", "A+", "1234567891",
                "Calle 123", "rYHbH@example.com", 80.0, 1.70);
        System.out.println(paciente1); // aca se llama al toString sin necesidad de escribirlo (polimorfismo)

        Usuario usuario1 = new Doctor(2, "Maria", "maria@gmail", "Pediatria");
        usuario1.mostrarDatosUsuario(); // polimorfismo

        Usuario usuario2 = new Enfermera(3, "Luisa", "luisa@gmail");
        usuario2.mostrarDatosUsuario(); // polimorfismo

        // Usuario usuario3 = new (comando para ver las opciones disponibles al crear un
        // nuevo objeto ctrol + espacio)
    }

}
