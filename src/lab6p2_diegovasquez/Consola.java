/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegovasquez;

import java.util.ArrayList;

/**
 *
 * @author Diego Vasquez
 */
public class Consola {
    protected String Identificacion;
    protected String Fabricante;
    protected int AñosUsados;
    protected double Precio;
    protected ArrayList<Juego> juegos = new ArrayList();
    protected String Modelo;

    public Consola() {
    }

    public Consola(String Identificacion, String Fabricante, int AñosUsados, double Precio, String Modelo) {
        this.Identificacion = Identificacion;
        this.Fabricante = Fabricante;
        this.AñosUsados = AñosUsados;
        this.Precio = Precio;
        this.Modelo = Modelo;
    }

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public int getAñosUsados() {
        return AñosUsados;
    }

    public void setAñosUsados(int AñosUsados) {
        this.AñosUsados = AñosUsados;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public ArrayList<Juego> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Juego> juegos) {
        this.juegos = juegos;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
}
