package javase.ui;

import java.util.Scanner;

public class Menu {

    public static void  MostrarMenu(){  //static para que se pueda llamar sin instanciar
        System.out.println("Bienvenido al menu");
        System.out.println("Seleccione una opcion\n");
        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("3. Salir");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
            switch (response) {
                case 1:
                    System.out.println("\nDoctor");
                    break;
                case 2:
                    System.out.println("\nPaciente");
                    break;
                case 3:
                    System.out.println("\nSalir");
                    break;
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
            
        } while (true);
    }
    
    static void MostrarPacienteMenu(){  
        
    }

}
