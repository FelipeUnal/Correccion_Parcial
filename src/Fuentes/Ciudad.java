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

    public Ciudad(String Nombre, Estacion[] Estaciones) {
        this.Nombre = Nombre;
        this.Estaciones = Estaciones;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public Estacion DatosdeEstacion(int a){
        return Estaciones[a];
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
