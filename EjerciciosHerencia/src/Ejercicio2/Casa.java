package Ejercicio2;


/**
 * Write a description of class Casa here.
 */
public class Casa extends Vivienda
{
	private double parcela;
	private boolean piscina;
	 
	public Casa(TipoVivienda tipo,int numHabitaciones, double metrosCuadrados, 
	    double precio, String ciudad, String zona, double parcela, boolean piscina){
	    super(tipo,numHabitaciones, metrosCuadrados, precio, ciudad, zona);
	    this.parcela=parcela;
	    this.piscina=piscina;
	   }
	   
	   public String toString(){
	       return super.toString()+ " parcela: "+parcela+ " piscina: "+piscina;
	   }    
	   
	   
	   public boolean equals(Casa c) {
		   
		   if(super.equals(c) && this.parcela == c.parcela && this.piscina==c.piscina )
			   return true;
		   else return false;
		   
		   
		   
	   }
}
