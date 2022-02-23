package Ejercicio3;

public abstract class Cuerpo {
	protected float superficie,volumen;
	protected Color col;
	
	public Cuerpo(Color col) {
		this.col = col;
	}
	
	public Cuerpo(float superficie, float volumen, Color col) {

		this.superficie = superficie;
		this.volumen = volumen;
		this.col = col;
	}
	
	
	@Override
	public String toString() {
		return "Cuerpo [superficie=" + superficie + ", volumen=" + volumen + ", col=" + col + "]";
	}

	public abstract void calcularSuperficie();
	public abstract void calcularVolumne();



	
	

}
