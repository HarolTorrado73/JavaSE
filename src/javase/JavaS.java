package javase;

import javase.ui.Menu.*{

    
};

public class JavaS {
    public static void main(String[] args) {
        // TODO code application logic here
        Doctor doctor1 = new Doctor(1, "Pedro", "Cardiologia");
        doctor1.MostrarDoctor();

        //identificador
        Doctor DoctorAnn = new Doctor(2, "Ann", "Pediatria");
        DoctorAnn.MostrarDoctor();

        Menu.MostrarMenu();
    }
    
}
