package javase.ui;

import java.util.ArrayList;
import java.util.Scanner;
import javase.Doctor;

public class MenuDoctor {

    public static ArrayList<Doctor> agentaDoctores = new ArrayList<>();

    public static void MostrarMenuDoctor() {
        int response = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nMenu Doctor  BIENVENIDO " + Menu.doctorLogged.getNombre()); // Usar el doctor
                                                                                              // autenticado para
                                                                                              // mostrar su nombre
            System.out.println("1. Agregar disponibilidad de citas y horarios respectivamente");
            System.out.println("2. Ver citas");
            System.out.println("0. Salir");

            response = Integer.parseInt(sc.nextLine());

            switch (response) { // empzamos a evaluar las opciones
                case 1 -> {
                    System.out.println("Agregar disponibilidad");
                    mostrarCitasAgregarDoctor();
                    // Lógica para agregar disponibilidad
                }
                case 2 -> {
                    System.out.println("Ver citas");
                    // Lógica para ver citas
                }
            }

        } while (response != 0);
    }

    private static void mostrarCitasAgregarDoctor() {
        int response = 0;
        do {
            System.out.println("\nCitas agregadas");
            // Lógica para mostrar citas agregadas
            System.out.println("Selecione el mes");
            for (int i = 0; i < Menu.MESES.length; i++) {
                System.out.println((i + 1) + ". " + Menu.MESES[i]);
            }
            System.out.println("0. Volver al menu anterior");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response > 0 && response <= Menu.MESES.length) {
                // Lógica para mostrar citas del mes seleccionado
                int mesSeleccionado = response;
                System.out.println("Mes seleccionado: " + Menu.MESES[mesSeleccionado - 1]); // -1 porque los arrays
                                                                                            // empiezan en 0

                System.out.println("Inserta la fecha disponible: [dd/mm/yyyy]");
                String date = sc.nextLine();
                System.out.println("Fecha que fue seleccionada: " + date + "(es correcta?)");
                int responseDate = Integer.valueOf(sc.nextLine()); // clase wrapper para convertir string a int
                if (responseDate == 2)
                    continue; // si es 2 vuelve al menu anterior

                int responseTime = 0;
                String time = "";
                do {

                    System.out.println("Inserta la hora disponible para " + date + " [HH:mm]"); // HH hora en formato 24
                                                                                                // //mm minutos
                    time = sc.nextLine();
                    System.out.println("Hora que fue seleccionada: " + time + "(es correcta?)");
                    System.out.println("1. Si");
                    System.out.println("2. No");
                    responseTime = Integer.valueOf(sc.nextLine());

                } while (responseTime == 2); // si es 2 vuelve a pedir la hora

                Menu.doctorLogged.AgregarCita(date, time); // no hay necesidad el parcheo de String a Date
                                                           // porque se almacena como String

            } else if (response == 0) {
                System.out.println("Volviendo al menu anterior");
            } else {
                System.out.println("Opcion no valida, intente de nuevo");
            }

        } while (response != 0);
    }

    private static void checarCitasDoctorAniadir(Doctor doctor) {
        // Lógica para checar citas y añadir al doctor
        if (!doctor.getCitas().isEmpty() && !agentaDoctores.contains(doctor)) {
            agentaDoctores.add(doctor);

        }
    }
}
