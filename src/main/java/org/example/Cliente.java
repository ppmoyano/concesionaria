package org.example;

public class Cliente {

    private static int idCounter = 1;
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private int anioNacimiento;

    public Cliente(String nombre, String apellido, String email, int anioNacimiento) {
        this.id = idCounter++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.anioNacimiento = anioNacimiento;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Cliente ID: " + id + " - " + nombre + " " + apellido + " (" + email + ")";
    }
}
