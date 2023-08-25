/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Portatil extends Consola{
    private String tamaño;
    private int duracionBateria;
    
    //Flase == no tiene, true == si tiene
    private boolean estuche;

    public Portatil() {
        super();
    }

    public Portatil(String tamaño, int duracionBateria, boolean estuche, String Identificacion, String Fabricante, int AñosUsados, double Precio, String Modelo) {
        super(Identificacion, Fabricante, AñosUsados, Precio, Modelo);
        this.tamaño = tamaño;
        this.duracionBateria = duracionBateria;
        this.estuche = estuche;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(int duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }
    
}
