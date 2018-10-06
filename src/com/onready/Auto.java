package com.onready;

import java.math.BigDecimal;

public class Auto extends Vehiculo {
    private int puertas;
    public Auto(String marca, String modelo, BigDecimal precio, int puertas) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return this.puertas;
    }

    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: "
                + this.getPuertas() + " // Precio: $" + String.format("%1$,.2f",this.getPrecio().doubleValue());
    }
}
