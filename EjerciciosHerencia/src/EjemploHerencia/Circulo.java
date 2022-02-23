package EjemploHerencia;

public class Circulo extends Figura{

	private double radio;
	
	
	public Circulo(int x, int y, double radio) {
		super(x,y);
		this.radio=radio;
		
	}
	
	@Override
	public double area() {
		
		return Math.PI *  Math.pow(radio, 2);
	}

}
