package Ejercicio3;

public class Esfera extends Cuerpo{

	private float radio;
	
	
	public Esfera(float radio, Color col) {
		super(col);
		this.radio = radio;
	}

	public Esfera(float superficie, float volumen, Color col, float radio) {
		super(superficie, volumen, col);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " radio = "+ radio;
	}

	@Override
	public void calcularSuperficie() {
		// TODO Auto-generated method stub
		
		
		superficie = (float) ((Math.PI)*4*Math.pow(radio, 2));
		
		
	}

	@Override
	public void calcularVolumne() {
		volumen = (float) ((4*Math.PI)*Math.pow(radio, 3))/3;
		
	}
	
	
	

}
