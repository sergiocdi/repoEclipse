package Ejercicio1;

public class Moto extends Vehiculo{
	
	private int numerodeplazas;
	
	public Moto(String matricula, String color, int numeroderuedas, int cilindrada, int potencia,int numeroPlazas) {
		super(matricula,color,numeroderuedas,cilindrada,potencia);
		this.numerodeplazas=numeroPlazas;
			
	}
	
	
	public String toString() {
		
		return  super.toString()+""+ numerodeplazas;
		
	}

}
