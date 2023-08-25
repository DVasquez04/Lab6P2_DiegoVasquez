/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegovasquez;

import java.util.Date;

/**
 *
 * @author Diego Vasquez
 */
public class Juego {
    private String Nombre;
    private String Descripcion;
    private Date Lanzamiento;
    private double Precio;
    //true == nuevo, flase == usado
    private boolean Estado;
    //true == si es rentable, false == no es rentable
    private boolean Rentable;
    //true == si hay dlc, false == no hay dlc
    private boolean agregado;
    private int cantDisponible;

    public Juego() {
    }

    public Juego(String Nombre, String Descripcion, Date Lanzamiento, double Precio, boolean Estado, boolean Rentable, boolean agregado, int cantDisponible) {
        this.Nombre = Nombre;
        this.Descripcion = Descripcion;
        this.Lanzamiento = Lanzamiento;
        this.Precio = Precio;
        this.Estado = Estado;
        this.Rentable = Rentable;
        this.agregado = agregado;
        this.cantDisponible = cantDisponible;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public Date getLanzamiento() {
        return Lanzamiento;
    }

    public void setLanzamiento(Date Lanzamiento) {
        this.Lanzamiento = Lanzamiento;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }

    public boolean isRentable() {
        return Rentable;
    }

    public void setRentable(boolean Rentable) {
        this.Rentable = Rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantDisponible() {
        return cantDisponible;
    }

    public void setCantDisponible(int cantDisponible) {
        this.cantDisponible = cantDisponible;
    }

    @Override
    public String toString() {
        return Nombre;
    }
}
