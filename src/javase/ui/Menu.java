package javase.ui;

import java.util.Scanner;

public class Menu {

    public static final String[] MESES = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

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
                    MostrarPacienteMenu();
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
        int response = 0;
        do {
            System.out.println("1. Agregar cita");
            System.out.println("2. Buscar cita agregada");
            System.out.println("3. Mostrar citas");
            System.out.println("4. Salir");
            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();
            switch (response) {
                case 1:
                    System.out.println("\nAgregar");
                    //meses
                    for (int i = 0; i < MESES.length; i++) {
                        System.out.println(1 +". "+MESES[i]);
                    }
                    break;
                case 2:
                    System.out.println("\nBuscar");
                    break;
                case 3:
                    System.out.println("\nMostrar");
                    break;
                case 4:
                    System.out.println("\nSalir");
                    break;
                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
            
        } while (true);
    }

}
