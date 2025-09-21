package javase;

import javase.ui.Menu;
import javase.ui.Paciente;

    

public class JavaS {
    public static void main(String[] args) {
        // TODO code application logic here
        //Doctor doctor1 = new Doctor(1, "Pedro", "Cardiologia");
        //doctor1.MostrarDoctor();

        //identificador
        //Doctor DoctorAnn = new Doctor(2, "Ann", "Pediatria");
        //DoctorAnn.MostrarDoctor();

        Menu.MostrarMenu();
        Doctor doctor1 = new Doctor(1, "Pedro","pedro45@gmail", "Cardiologia");

        Paciente paciente1 = new Paciente(1, "Pedro", "Perez", "01/01/2000", "Masculino", "A+", "123456789", "Calle 123", "rYHbH@example.com", "80", 1.70);
    }
    
}
