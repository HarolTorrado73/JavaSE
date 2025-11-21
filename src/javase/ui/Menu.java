package javase.ui;

import java.util.ArrayList;
import java.util.Scanner;
import javase.Doctor;

public class Menu {

    public static final String[] MESES = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };

    public static Doctor doctorLogged;
    public static Paciente pacienteLogged;

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
                    response = 0;
                    auntenticacionUsuario(1);
                    break;
                }
                case 2 -> {
                    System.out.println("\nPaciente");
                    auntenticacionUsuario(2);
                    response = 0;
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

    private static void auntenticacionUsuario(int tipoUsuario) {
        // codigo de autenticacion
        // 2 es para paciente
        // 1 es para doctor

        ArrayList<Doctor> doctores = new ArrayList<>();
        doctores.add(new Doctor(1, "Pedro", "pedro45@gmail.com", "Cardiologia"));
        doctores.add(new Doctor(2, "Maria", "maria@gmail.com", "Pediatria"));
        doctores.add(new Doctor(3, "Luisa", "luisa@gmail.com", "Pediatria"));

        ArrayList<Paciente> pacientes = new ArrayList<>();
        pacientes.add(new Paciente(1, "Pedro", "Perez",
                "01/01/2000", "Masculino", "A+", "1234567891",
                "Calle 123", "rYHbH@example.com", 80.0, 1.70));

        pacientes.add(new Paciente(2, "Maria alejandra", "Melo", "01/05/2005",
                "Femenino", "O+", "1234567890", "Calle 456", "d1RcJ@example.com", 70.0, 1.60));

        pacientes.add(new Paciente(3, "Luisa", "Gomez", "02/02/1995",
                "Femenino", "B+", "1234567892", "Calle 789", "luisa@example.com", 65.0, 1.65));

        boolean autenticado = false;
        do {
            System.out.println("Inserta tu email: ped@gmail pista");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine(); // pedro45@gmail
            if (tipoUsuario == 1) {
                for (Doctor doctor : doctores) {
                    if (doctor.getEmail().equals(email)) {
                        System.out.println("Bienvenido Dr. " + doctor.getNombre());
                        autenticado = true;
                        doctorLogged = doctor;
                        // Mostrar menu de doctor
                        MenuDoctor.MostrarMenuDoctor();

                        break;
                    }
                }
            } else if (tipoUsuario == 2) {
                for (Paciente paciente : pacientes) {
                    if (paciente.getEmail().equals(email)) {
                        System.out.println("Bienvenido " + paciente.getNombre());
                        autenticado = true;
                        // Mostrar menu de paciente
                        pacienteLogged = paciente;
                        MostrarPacienteMenu();
                        break;
                    }
                }
            }
        } while (!autenticado);
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
