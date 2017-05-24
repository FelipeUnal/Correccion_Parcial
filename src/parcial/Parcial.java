/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import Data.*;
import Fuentes.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner A = new Scanner(System.in);
        double z1 = A.nextDouble();
        String z2 = A.nextLine();
        double z3 = A.nextDouble();
        Sensores[] a = new Sensores[4];
        a[0] = new Sensores("Toshiba","06/06/2014","R404");
        a[0].setAgua(z1);
        a[0].setNivelElec(z2);
        a[0].setTemper(z3);
        a[1] = new Sensores("HP","06/06/2014","R465");
        a[0].setAgua(z4);
        a[0].setNivelElec(z5);
        a[0].setTemper(z6);
        a[2] = new Sensores("PHPO","06/06/2014","AA234");
        a[0].setAgua(z7);
        a[0].setNivelElec(z8);
        a[0].setTemper(z9);
        a[3] = new Sensores("Intel","06/06/2014","AA354");
        a[0].setAgua(z10);
        a[0].setNivelElec(z11);
        a[0].setTemper(z12);
        
       
        
        Sensores[] a1 = new Sensores[3];
        a1[0] = new Sensores("Toshiba","06/06/2014","R406");
        a1[1] = new Sensores("HP","06/06/2014","R454");
        a1[2] = new Sensores("PHPO","06/06/2014","AA235");
 
        Sensores[] a2 = new Sensores[3];
        a2[0] = new Sensores("Toshiba","06/06/2014","R4035");
        a2[1] = new Sensores("HP","06/06/2014","R46355");
        a2[2] = new Sensores("PHPO","06/06/2014","AA276");
        
        Estacion[] b = new Estacion[3];
        b[0] = new Estacion("Kra14A#30-40s","Sur","06/06/2014");
        b[1] = new Estacion("Kra10#120-40","NorOeste","07/07/2015");
        b[2] = new Estacion("Calle100#50-45","NorOriente","06/06/2014");  
        
        Ciudad Bogota = new Ciudad("Bogota",b);
        
        Datos F = new Datos();
        F.AddCiudad(Bogota);
        F.PrimerosDatos();
    }
    
}
