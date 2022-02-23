package EjemploHerencia;

public abstract class Figura {
	
	protected int x;
	protected int y;
	
	//constructor
	public Figura(int x, int y) {
		
		this.x=x;
		this.y=y;
	}
	public abstract double area();
	
	public void posicion() {
		System.out.println("La posicion x es "+x );
		System.out.println("La posicion y es "+y);
		
	}

}
