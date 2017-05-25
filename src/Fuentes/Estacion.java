package Fuentes;

public class Estacion {
    private String Ubicacion;
    private String Nombre;
    private String FechaInst;
    private final Sensores[] Sensores;
    private final double[] Promedio;

    public Estacion(String Ubicacion, String Nombre, String FechaInst, Sensores[] Sensores) {
        this.Ubicacion = Ubicacion;
        this.Nombre = Nombre;
        this.FechaInst = FechaInst;
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
        this.Promedio = new double[3];
    }
    
    public double getPromedioAgua(){
        Promedio[0] = ((Sensores[0].CantidadAgua()+Sensores[1].CantidadAgua()+Sensores[2].CantidadAgua())/this.Sensores.length);
        return Math.floor(Promedio[0]);
    }
    
    public double getPromedioTemper(){
        Promedio[1] = ((Sensores[0].TemperaturaActual()+Sensores[1].TemperaturaActual()+Sensores[2].TemperaturaActual())/this.Sensores.length);
        return Math.floor(Promedio[1]);
    }
    
    public double getPromedioElectrico(){
        Promedio[2] = ((Sensores[0].NvlCargaElectrica()+Sensores[1].NvlCargaElectrica()+Sensores[2].NvlCargaElectrica())/this.Sensores.length);
        return  Math.floor(Promedio[2]);
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
