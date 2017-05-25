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
public class Sensores {
    private String Marca;
    private String FechaIsnt;
    private String Refer;
    private int NivelElec;
    private double Agua;
    private double Temper;
    
    public Sensores(String Marca, String FechaIsnt, String Refer) {
        this.Marca = Marca;
        this.FechaIsnt = FechaIsnt;
        this.Refer = Refer;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getFechaIsnt() {
        return FechaIsnt;
    }

    public void setFechaIsnt(String FechaIsnt) {
        this.FechaIsnt = FechaIsnt;
    }

    public String getRefer() {
        return Refer;
    }

    public void setRefer(String Refer) {
        this.Refer = Refer;
    }

    public void setNivelElec(String Nvl) {
        int a;
        switch (Nvl) {
            case "Tormenta":
                a = 1;
                this.NivelElec = a;
                break;
            case "Rayos":
                a = 2;
                this.NivelElec = a;
                break;
            case "Truenos":
                a = 3;
                this.NivelElec = a;
                break;
            case "Normal":
                a = 4;
                this.NivelElec = a;
                break;
            default:
                System.out.println("- La opcion no esta disponible, por favor ponga Tormenta, Truenos, Rayos o Normal");
                break;
        }
    }

    public void setAgua(double Agua) {
        this.Agua =  Agua;
    }

    public void setTemper(double Temper) {
        this.Temper = Temper;
    }
    
    
    public double CantidadAgua(){
        return this.Agua;
    }
    
    public double TemperaturaActual(){
        return this.Temper;
    }
    
    public double NvlCargaElectrica(){
        return this.NivelElec;
    }
}
