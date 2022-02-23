package EjemploHerencia;

public class Principal {
	
	public static void main(String[] args) {
	
	Circulo c = new Circulo(0,0, 0.5);
	c.posicion();
	System.out.println("El area del ciruculo es "+c.area());
	
	Rectangulo r = new Rectangulo(1, 3, 12, 8);
	r.posicion();
	System.out.println("El area del rectangulo es "+r.area());
	
	
	}
}
