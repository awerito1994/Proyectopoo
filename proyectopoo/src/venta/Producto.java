/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package venta;

/**
 *
 * @author awerito1994
 */
public class Producto {

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param valor the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param canti the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param prodn the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected double precio;
    protected int stock;
    protected String nombre;
}
