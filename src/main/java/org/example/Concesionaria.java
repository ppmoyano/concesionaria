package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Concesionaria {
    public List<Automovil> getAutosDisponibles() {
        return autosDisponibles;
    }

    private List<Automovil> autosDisponibles = List.of(
            new Automovil("Toyota", "Corolla", 20000),
            new Automovil("Honda", "Civic", 22000),
            new Automovil("Ford", "Focus", 21000)
    );

    private Map<String, Cliente> clientes = new HashMap<>();

    public Cliente registrarCliente(String nombre, String apellido, String email, int anioNacimiento) {
        Cliente cliente = new Cliente(nombre, apellido, email, anioNacimiento);
        clientes.put(email, cliente);
        return cliente;
    }

    public Cliente buscarCliente(String email) {
        return clientes.get(email);
    }

    public void mostrarAutosDisponibles() {
        System.out.println("Autos disponibles:");
        for (int i = 0; i < autosDisponibles.size(); i++) {
            System.out.println((i + 1) + ". " + autosDisponibles.get(i));
        }
    }

    public void venderAuto() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            this.mostrarAutosDisponibles();
            System.out.print("Seleccione el número del auto que desea vender: ");
            opcion = scanner.nextInt();

            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción no válida.");
            }
        }while(opcion < 1 || opcion > 3);

        Automovil autoVendido = this.getAutosDisponibles().get(opcion - 1);
        System.out.println("Auto vendido: " + autoVendido);
    }
}
