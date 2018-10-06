package com.onready;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Consesionaria {
    private List<Vehiculo> vehiculos;

    public Consesionaria() {
        this.vehiculos = new ArrayList<>();
    }

    public void mostrarProductos(){
        this.vehiculos.forEach(System.out::println);
    }

    public void addProductos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }


    public void vehiculoMayorPrecio() {
        Collections.sort(vehiculos);
        System.out.println("Producto mas caro: " + this.vehiculos.get(0).getMarca()
                + " " + this.vehiculos.get(0).getModelo());
    }

    public void vehiculoMenorPrecio() {
        System.out.println("Producto mas barato: " + this.vehiculos.get(vehiculos.size()-1).getMarca()
                + " " + this.vehiculos.get(vehiculos.size()-1).getModelo());
    }

    public void contiene(String valor){
        vehiculos.forEach(v ->{
            if(v.getModelo().contains(valor)){
                System.out.println("Vehículo que contiene en el modelo la letra ‘" + valor + "’: " + v.getMarca()
                        + " " + v.getModelo() + " " + String.format("%1$,.2f",v.getPrecio().doubleValue()));
            }
        });
    }

    public void ordenarVehiculos(){
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        vehiculos.forEach(v -> System.out.println(v.getMarca() + " " + v.getModelo()));
    }



}
