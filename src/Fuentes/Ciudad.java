/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fuentes;

/**
 *
 * @author Estudiante
 */
public class Ciudad {
    private String Nombre;
    private Estacion[] Estaciones;
    private int[] Promedio;

    public Ciudad(String Nombre, Estacion[] Estaciones) {
        this.Nombre = Nombre;
        this.Estaciones = Estaciones;
        this.Promedio = new int[3];
    }

    public String getNombre() {
        return Nombre;
    }
    
    public void getPromedio(){
        for(int i = 0; i<this.Estaciones.length; i++){
            Promedio[0] += Estaciones[i].getPromedioAgua();
            Promedio[2] += Estaciones[i].getPromedioElectrico();
            Promedio[1] += Estaciones[i].getPromedioTemper();
        }
    }
    
    public String NombredeEstacion(int a){
        return Estaciones[a].getNombre();
    }
    
    public int NumerosdeSensores(int a){
        return Estaciones[a].NumerodeSensores();
    }
    
    public int getPromedioAgua(){
        return Promedio[0]/this.Estaciones.length;
    }
    
    public int getPromedioTemper(){
        return Promedio[1]/this.Estaciones.length;
    }
    
    public int getPromedioElectrico(){
        return Promedio[2]/this.Estaciones.length;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Estacion[] getEstaciones() {
        return Estaciones;
    }

    public void setEstaciones(Estacion[] Estaciones) {
        this.Estaciones = Estaciones;
    }
    
    
    
}
