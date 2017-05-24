/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import Data.*;
import Fuentes.*;
import java.io.FileNotFoundException;

/**
 *
 * @author Estudiante
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Sensores[] a = new Sensores[4];
        a[0] = new Sensores("Toshiba","06/06/2014","R404");
        a[1] = new Sensores("HP","06/06/2014","R465");
        a[2] = new Sensores("PHPO","06/06/2014","AA234");
        a[3] = new Sensores("Intel","06/06/2014","AA354");
        
        Sensores[] a1 = new Sensores[3];
        a1[0] = new Sensores("Toshiba","06/06/2014","R406");
        a1[1] = new Sensores("HP","06/06/2014","R454");
        a1[2] = new Sensores("PHPO","06/06/2014","AA235");
 
        Sensores[] a2 = new Sensores[3];
        a2[0] = new Sensores("Toshiba","06/06/2014","R4035");
        a2[1] = new Sensores("HP","06/06/2014","R46355");
        a2[2] = new Sensores("PHPO","06/06/2014","AA276");
        
        Estacion[] b = new Estacion[3];
        b[0] = new Estacion("Kra14A#30-40s","Sur","06/06/2014",a);
        b[1] = new Estacion("Kra10#120-40","NorOeste","07/07/2015",a1);
        b[2] = new Estacion("Calle100#50-45","NorOriente","06/06/2014",a2);  
        
        Ciudad Bogota = new Ciudad("Bogota",b);
        
        Datos F = new Datos();
        F.AddCiudad(Bogota);
        F.PrimerosDatos();
    }
    
}
