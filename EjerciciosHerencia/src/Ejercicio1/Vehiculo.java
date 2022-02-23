package Ejercicio1;

public class Vehiculo {

	
	protected String matricula;
	protected String color;
	protected int numeroderuedas;
	protected int cilindrada;
	protected int potencia;
	
	
	public Vehiculo() {
		
		matricula= "0000 x";
		
	}
	
	public Vehiculo(String matricula, String color) {
		this.matricula = matricula;
		this.color = color;
	}
	
	public Vehiculo(String matricula, String color, int numeroderuedas, int cilindrada, int potencia) {
		this.matricula = matricula;
		this.color = color;
		this.numeroderuedas = numeroderuedas;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
	}




	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String toString() {
		
		  return matricula +" "+ color+" "+ numeroderuedas+" "+ cilindrada+" "+ potencia;
		
	}
	
}
