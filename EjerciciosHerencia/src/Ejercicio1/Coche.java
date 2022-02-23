package Ejercicio1;

public class Coche extends Vehiculo{
	
	private int numerodepuertas;

	public Coche(String matricula, String color, int numeroderuedas, int cilindrada, int potencia,int numerodepuertas) {
		super(matricula,color,numeroderuedas,cilindrada,potencia);
		this.numerodepuertas = numerodepuertas;
	}
	
	public Coche() {
		
		super();
	}
	
	
	public String toString() {
		
		return  super.toString()+""+ numerodepuertas;
		
	}
	
	
	

	
	
	

}
