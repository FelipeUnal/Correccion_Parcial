/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import Data.*;
import Fuentes.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner A = new Scanner(System.in);
        
        //Aqui se pondran los datos de los sensores, los sensores se cuentan por torres por los que los guarde en un arreglo de Sensores
        Sensores[] a = new Sensores[4];
        a[0] = new Sensores("Toshiba","06/06/2014","R404");
        a[0].setAgua(21);
        a[0].setNivelElec("Truenos");
        a[0].setTemper(10);
        a[1] = new Sensores("HP","06/06/2014","R465");
        a[1].setAgua(22);
        a[1].setNivelElec("Tormenta");
        a[1].setTemper(8);
        a[2] = new Sensores("PHPO","06/06/2014","AA234");
        a[2].setAgua(15);
        a[2].setNivelElec("Normal");
        a[2].setTemper(20);
        a[3] = new Sensores("Intel","06/06/2014","AA354");
        a[3].setAgua(13);
        a[3].setNivelElec("Normal");
        a[3].setTemper(22);
        
       
        
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
        
        //Hubira podido hacer una coleccion de estaciones por cada ciudad, pero los ciudades tambien tienen un numero limitado de estaciones realmente,
        //Se cuentan y son limitados 
        Ciudad Bogota = new Ciudad("Bogota",b);
        
        Datos F = new Datos();
        F.AddCiudad(Bogota);
        //F.PrimerosDatos();//Cuando ya tenemos nuestro archivo que guarda nuestros datos, recurrimos a otra funcion lamada actualizacion
        F.Actualizacion();
    }
    
}
