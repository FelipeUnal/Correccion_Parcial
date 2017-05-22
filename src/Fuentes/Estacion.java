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
public class Estacion {
    private String Ubicacion;
    private String Nombre;
    private String FechaInst;
    private Sensores[] Sensores;
    private final int[] Promedio;

    public Estacion(String Ubicacion, String Nombre, String FechaInst, Sensores[] Sensores) {
        this.Ubicacion = Ubicacion;
        this.Nombre = Nombre;
        this.FechaInst = FechaInst;
        this.Sensores = Sensores;
        this.Promedio = new int[3];
    }
    
    public int getPromedioAgua(){
        Promedio[0] = (int) ((Sensores[0].CantidadAgua()+Sensores[1].CantidadAgua()+Sensores[2].CantidadAgua())/3);
        return Promedio[1];
    }
    
    public int getPromedioTemper(){
        Promedio[1] = (int) ((Sensores[0].TemperaturaActual()+Sensores[1].TemperaturaActual()+Sensores[2].TemperaturaActual())/3);
        return Promedio[2];
    }
    
    public int getPromedioElectrico(){
        Promedio[3] = (int) ((Sensores[0].NvlCargaElectrica()+Sensores[1].NvlCargaElectrica()+Sensores[2].NvlCargaElectrica())/3);
        return Promedio[3];
    }
        
        
    public void setSensores(Sensores[] Sensores) {
        if(Sensores.length>3){
            Sensores[] a = new Sensores[3];
            for(int i = 0; i<3; i++){
                a[i] = Sensores[i];
            }
            System.out.println("- Hay demasiados sensores, la informacion retornara a los 3 primeros sensores");
            this.Sensores = a;
        }else if(Sensores.length<3){
            System.out.println("- No hay suficientes sensores, la informacion sera solo de los sensores existentes");
            this.Sensores = Sensores;
        }else
        this.Sensores = Sensores;
    }
    
    public int NumerodeSensores(){
        return Sensores.length;
    }
    
    
    
    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getFechaInst() {
        return FechaInst;
    }

    public void setFechaInst(String FechaInst) {
        this.FechaInst = FechaInst;
    }
    
    
    
    
}
