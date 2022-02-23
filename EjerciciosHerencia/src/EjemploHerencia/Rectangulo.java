package EjemploHerencia;

public class Rectangulo extends Figura{
	
	private double ancho;
	private double alto;
	
	public Rectangulo(int x, int y, double ancho, double alto) {
		
		super(x,y);
		this.ancho=ancho;
		this.alto=alto;
		
	}
	
	public double area() {
		
		return ancho*alto;
	}

}
