package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Componente> componentes = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Registrar Componente");
            System.out.println("2. Registrar Estudiante");
            System.out.println("3. Registrar Nota a Estudiante");
            System.out.println("4. Mostrar Componentes");
            System.out.println("5. Mostrar Estudiantes y Notas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("ID del componente: ");
                    int idComp = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre del componente: ");
                    String nombreComp = scanner.nextLine();
                    System.out.print("Nombre del profesor: ");
                    String profesor = scanner.nextLine();

                    Componente nuevoComp = new Componente();
                    nuevoComp.registrarInfoComponente(idComp, nombreComp, profesor);
                    componentes.add(nuevoComp);
                    System.out.println("Componente registrado.");
                    break;

                case 2:
                    System.out.print("ID del estudiante: ");
                    String idEst = scanner.nextLine();
                    System.out.print("Nombre del estudiante: ");
                    String nombreEst = scanner.nextLine();

                    Estudiante nuevoEst = new Estudiante();
                    nuevoEst.resgistrarEstudiante(idEst, nombreEst);
                    estudiantes.add(nuevoEst);
                    System.out.println("Estudiante registrado.");
                    break;

                case 3:
                    System.out.print("ID del estudiante para agregar nota: ");
                    String idBuscar = scanner.nextLine();
                    Estudiante encontrado = null;
                    for (Estudiante est : estudiantes) {
                        if (est.getID().equals(idBuscar)) {
                            encontrado = est;
                            break;
                        }
                    }

                    if (encontrado != null) {
                        System.out.print("Valor de la nota: ");
                        double valorNota = scanner.nextDouble();
                        System.out.print("Porcentaje: ");
                        double porcentaje = scanner.nextDouble();
                        scanner.nextLine();

                        Nota nuevaNota = new Nota();
                        nuevaNota.setVrNota(valorNota);
                        nuevaNota.setPorcentaje(porcentaje);
                        nuevaNota.calcularNotaPorcentaje();
                        encontrado.agregarNota(nuevaNota);
                        System.out.println("Nota agregada.");
                    } else {
                        System.out.println("Estudiante no encontrado.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Componentes registrados ---");
                    for (Componente comp : componentes) {
                        System.out.println(comp.imprimirInfoComponente());
                        System.out.println("---------------------");
                    }
                    break;

                case 5:
                    System.out.println("\n--- Estudiantes registrados ---");
                    for (Estudiante est : estudiantes) {
                        System.out.println(est.imprimirInfo());
                        System.out.println("Notas:");
                        for (Nota n : est.getNotas()) {
                            System.out.println(" - " + n.imprimirNota());
                        }
                        System.out.println("Nota Final: " + est.calcularNotaFinal());
                        System.out.println("---------------------");
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        scanner.close();

    }
}