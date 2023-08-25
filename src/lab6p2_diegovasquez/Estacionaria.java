/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Estacionaria extends Consola{
    private int numControles;
    private int Almacenamiento;
    private String tipoConexion;

    public Estacionaria() {
        super();
    }

    public Estacionaria(int numControles, int Almacenamiento, String tipoConexion, String Identificacion, String Fabricante, int AñosUsados, double Precio, String Modelo) {
        super(Identificacion, Fabricante, AñosUsados, Precio, Modelo);
        this.numControles = numControles;
        this.Almacenamiento = Almacenamiento;
        this.tipoConexion = tipoConexion;
    }

    public int getNumControles() {
        return numControles;
    }

    public void setNumControles(int numControles) {
        this.numControles = numControles;
    }

    public int getAlmacenamiento() {
        return Almacenamiento;
    }

    public void setAlmacenamiento(int Almacenamiento) {
        this.Almacenamiento = Almacenamiento;
    }

    public String getTipoConexion() {
        return tipoConexion;
    }

    public void setTipoConexion(String tipoConexion) {
        this.tipoConexion = tipoConexion;
    }
    
}
