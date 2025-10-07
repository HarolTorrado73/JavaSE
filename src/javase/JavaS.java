package javase;

import java.util.Date;
import javase.ui.Paciente;

    

public class JavaS {

    public static void main(String[] args) {
        
        //Menu.MostrarMenu();
        Doctor doctor1 = new Doctor(1, "Pedro","pedro45@gmail", "Cardiologia");
        doctor1.AgregarCita(new Date(), "10:00 AM");
        doctor1.AgregarCita(new Date(), "11:00 AM");

        System.out.println("\nCitas del doctor");
        for (Doctor.Citas cita : doctor1.getCitas()) {
            System.out.println("Fecha: "+cita.getFecha()+" Time: "+cita.getTime());
        }

        Paciente paciente1 = new Paciente(1, "Pedro", "Perez",
         "01/01/2000", "Masculino", "A+", "1234567891",
          "Calle 123", "rYHbH@example.com", 80.0, 1.70);
        System.out.println(paciente1); //aca se llama al toString sin necesidad de escribirlo (polimorfismo)

    }
    
}
