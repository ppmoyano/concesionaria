package org.example;

public class Automovil {
    private String marca;
    private String modelo;
    private double precio;

    public Automovil(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " - $" + precio;
    }
}
