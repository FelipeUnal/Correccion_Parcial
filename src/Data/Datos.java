/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Fuentes.*;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeMap;

/**
 *
 * @author Estudiante
 */
public class Datos {
    private final TreeMap<String,Ciudad> Ciudades;

    public Datos() {
        this.Ciudades = new TreeMap<>();
    }
    
    public void AddCiudad(Ciudad a){
        this.Ciudades.put(a.getNombre(), a);
    }
    
    public void PrimerosDatos() throws FileNotFoundException{
        File A = new File("Registro.txt");
        for(Ciudad b : Ciudades.values()){
            PrintStream c = new PrintStream (new File("Registro.txt"));
            c.println(b.getNombre());
            c.println(b.getEstaciones().length);
            for(int i = 0; i<b.getEstaciones().length; i++){
                Date a = new Date(); 
                SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
                c.println(b.NombredeEstacion(i));
                c.println(b.NumerosdeSensores(i));
                c.print(a);
                c.print(" "+b.getPromedioTemper());
                c.print(" "+b.getPromedioAgua());
                c.println(" "+b.getPromedioElectrico());
                c.println();
            }
        }
    }
    
    
    
}
