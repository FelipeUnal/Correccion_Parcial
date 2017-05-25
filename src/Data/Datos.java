/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Fuentes.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;
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
                c.println(b.DatosdeEstacion(i).getNombre());
                c.println(b.DatosdeEstacion(i).NumerodeSensores());
                c.print(new SimpleDateFormat("dd/mm/yyyy").format(a));
                c.print(" "+b.DatosdeEstacion(i).getPromedioTemper());
                c.print(" "+b.DatosdeEstacion(i).getPromedioElectrico());
                c.println(" "+b.DatosdeEstacion(i).getPromedioAgua());
            }
        }
    }
    
    public void Actualizacion() throws IOException{
        File A = new File("Registro.txt");
        FileReader Reader = new FileReader(A);
        BufferedReader reader2 = new BufferedReader(Reader);
        String Datos;
        while((Datos=reader2.readLine())!=null){
            StringTokenizer Token = new StringTokenizer(Datos,",");
            String[] Tokens = new String[Token.countTokens()];
            for(int i = 0; i<Tokens.length; i++){
                Tokens[i]=Token.nextToken();
            }
            
        }
        
        
    }
    
    
    
}
