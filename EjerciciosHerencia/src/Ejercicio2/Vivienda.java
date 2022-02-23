package Ejercicio2;


/**
 * Write a description of class Vivienda here.
 */



public class Vivienda extends Object
{
	
	protected TipoVivienda tipo;
	protected int numHabitaciones;
	protected double metrosCuadrados;
	protected double precio;
	protected String ciudad;
	protected String zona;
	
	
	public Vivienda(){
	   }
	   
	public Vivienda( TipoVivienda tipo,int numHabitaciones, double metrosCuadrados, 
	double precio, String ciudad, String zona){ 
	    this.tipo =tipo;
	    this.numHabitaciones=numHabitaciones;
	    this.metrosCuadrados=metrosCuadrados;
	    this.ciudad=ciudad;
	    this.zona=zona;
	    this.precio=precio;
	   }
	   
	public String toString(){
	    return "tipo: "+tipo + " Num Habitaciones: "+numHabitaciones + " M.2 "+metrosCuadrados+
	    " precio: "+precio+ " ciudad: "+ciudad+ " Zona: "+zona;
	   }    
	    
    public double comision(){
         return precio*0.03;
        }    
    
    
  
    
    public boolean equals(Vivienda v) {
    	
    	if(this.tipo==v.tipo && this.zona.equals(v.zona) && this.numHabitaciones==v.numHabitaciones
    			&& this.ciudad.equals(v.ciudad))
    		return true;
    	else return false;
    }
}
