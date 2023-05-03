package Models;

import java.util.ArrayList;
import java.util.List;

public class Producto {
    private Integer stock;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(Integer stock, String nombre, Integer precio) {
        this.stock = stock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "stock=" + stock +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public void aplicarDescuento(float porcentaje) {
        double v = getPrecio() - ((getPrecio() * porcentaje) / 100);
        setPrecio((int) v);
    }
}

