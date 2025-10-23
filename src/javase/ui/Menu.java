package javase.ui;

import java.util.Scanner;

public class Menu {

    public static final String[] MESES = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    public static void MostrarMenu() { // static para que se pueda llamar sin instanciar
        System.out.println("Bienvenido al menu");
        System.out.println("Seleccione una opcion\n");
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Paciente");
            System.out.println("3. Salir");
            response = sc.nextInt();
            switch (response) {
                case 1 -> {
                    System.out.println("\nDoctor");
                }
                case 2 -> {
                    System.out.println("\nPaciente");
                    MostrarPacienteMenu();
                }
                case 3 -> {
                    System.out.println("\nSalir");
                    sc.close();
                    System.exit(0);
                }
                default -> System.out.println("\nOpcion no valida");
            }
        } while (response != 3);
        sc.close();
    }

    static void MostrarPacienteMenu() {
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Agregar cita");
            System.out.println("2. Buscar cita agregada");
            System.out.println("3. Mostrar citas");
            System.out.println("4. Salir");
            response = sc.nextInt();
            switch (response) {
                case 1 -> {
                    System.out.println("\nAgregar");
                    // meses
                    for (String mes : MESES) {
                        System.out.println("--" + ". " + mes);
                    }
                }
                case 2 -> System.out.println("\nBuscar");
                case 3 -> System.out.println("\nMostrar");
                case 4 -> {
                    System.out.println("\nVolver al menu principal");
                    sc.close();
                    return;
                }
                default -> System.out.println("\nOpcion no valida");
            }
        } while (response != 4);
        sc.close();
    }
}
