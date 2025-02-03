package org.example;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Concesionaria concesionaria = new Concesionaria();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nMenú principal:");
            System.out.println("1. Ingresar nuevo cliente");
            System.out.println("2. Abrir cliente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    abrirCliente();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void registrarCliente() {
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Ingrese email: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Cliente cliente = concesionaria.registrarCliente(nombre, apellido, email, anioNacimiento);
        System.out.println("Cliente registrado con ID: " + cliente.getId());
    }

    private static void abrirCliente() {
        System.out.print("Ingrese el email del cliente: ");
        String email = scanner.nextLine();
        Cliente cliente = concesionaria.buscarCliente(email);

        if (cliente == null) {
            System.out.println("Cliente no encontrado.");
            return;
        }

        System.out.println("Bienvenido, " + cliente);
        while (true) {
            System.out.println("\nMenú de cliente:");
            System.out.println("1. Vender un auto");
            System.out.println("2. Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (opcion == 1) {
                venderAuto();
            } else if (opcion == 2) {
                break;
            } else {
                System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }

    private static void venderAuto() {
        concesionaria.venderAuto();
    }
}