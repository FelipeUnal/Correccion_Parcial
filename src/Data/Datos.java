/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Fuentes.*;
import java.io.*;
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
    
    public void GuardarDatos() throws FileNotFoundException{
        for(Ciudad b : Ciudades.values()){
            PrintStream c = new PrintStream (new File("Registro.txt"));
            c.println(b.getNombre());
            c.println(b.getEstaciones().length);
            c.println(s);
        }
    }
    
    
    
}
