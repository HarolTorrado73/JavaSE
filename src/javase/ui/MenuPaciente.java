package javase.ui;

import java.lang.reflect.Array;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Scanner;

import javax.print.Doc;

import javase.Doctor;

public class MenuPaciente {

    public static void MostrarMenuPaciente() {

        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("--Paciente--Bienvenido-- + " + Menu.pacienteLogged.getNombre());
            System.out.println("1. Agendar cita");
            System.out.println("2. Mis citas");
            System.out.println("0. Salir");

            java.util.Scanner sc = new java.util.Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) { // empzamos a evaluar las opciones
                case 1 -> {
                    System.out.println("Agendar cita");
                    // Lógica para agendar cita
                    mostrarCitasAgendarPaciente();
                }
                case 2 -> {
                    System.out.println("Mis citas");
                    // Lógica para ver mis citas
                    mostrarMisCitasPaciente();
                }
                case 0 -> {
                    System.out.println("Salir");
                    sc.close();
                    return;
                }
                default -> { // siempre se ejecutara si no se cumple ninguna de las opciones anteriores
                    System.out.println("Opcion no valida");
                }
            }

        } while (response != 0);
    }

    private static void mostrarCitasAgendarPaciente() {
        // Lógica para mostrar citas disponibles para agendar
        int response = 0;
        do {
            System.out.println("\nCitas disponibles para agendar");
            System.out.println(": Sellecione la fecha:");

            Map<Integer, Map<Integer, Doctor>> doctores = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < MenuDoctor.agentaDoctores.size(); i++) {
                ArrayList<Doctor.Citas> citas = MenuDoctor.agentaDoctores.get(i).getCitas();

                Map<Integer, Doctor> citasDoctor = new TreeMap<>();

                for (int j = 0; j < citas.size(); j++) {
                    k++;
                    System.out.println(k + ". " + citas.get(j).getDate("DATE") + " " + citas.get(j).getTime()
                            + " Dr. " + MenuDoctor.agentaDoctores.get(i).getNombre());
                    citasDoctor.put(Integer.valueOf(j), MenuDoctor.agentaDoctores.get(i));
                    doctores.put(Integer.valueOf(k), citasDoctor);
                }
                doctores.put(i, citasDoctor);
            }

            Scanner sc = new Scanner(System.in);
            int responseCita = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorCitaSeleccionada = doctores.get(responseCita);
            Integer indexCita = 0;
            Doctor doctorSeleccionado = new Doctor("", "", "");
            for (Map.Entry<Integer, Doctor> entry : doctorCitaSeleccionada.entrySet()) {
                indexDate = entry.getKey();
                doctorSeleccionado = entry.getValue();
            }

            System.out.println(doctorSeleccionado.getCitas().get(indexCita).getDate("DATE") + " "
                    + doctorSeleccionado.getCitas().get(indexCita).getTime() + " Dr. "
                    + doctorSeleccionado.getNombre());

            System.out.println("\n1. Confirmar cita: 1. -SI / 2. Cambiar fecha: 3.-NO");
            response = Integer.valueOf(sc.nextLine());
            if (response == 1) {
                java.awt.MenuPaciente.pacienteLogged.agendarCita(doctorSeleccionado,
                        doctorSeleccionado.getCitas().get(indexCita).getDate(null),
                        doctorSeleccionado.getCitas().get(indexCita).getTime());

                MostrarMenuPaciente();
            }
        } while (response != 0);
    }

    private static void mostrarMisCitasPaciente() {
        // Lógica para mostrar mis citas
        int response = 0;
        do {
            System.out.println("\nMis citas agendadas");
            ArrayList<javase.model.CitasDoctor> citasAgendadas = Menu.pacienteLogged.getCitasDoctor();
            if (citasAgendadas.size() == 0) {
                System.out.println("No tienes citas agendadas");
                break;
                ;
            }
            for (int i = 0; i < Menu.pacienteLogged.getCitasDoctor().size(); i++) {
                System.out.println((i + 1) + ". " + Menu.pacienteLogged.getNombre() + " "
                        + Menu.pacienteLogged.getCitasDoctor().get(i).getDate() + " "
                        + Menu.pacienteLogged.getCitasDoctor().get(i).getTime() + " Dr. "
                        + Menu.pacienteLogged.getCitasDoctor().get(i).getDoctor().getNombre());
            }
            System.out.println("0. Volver al menu anterior");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
        } while (response != 0);
    }

}
