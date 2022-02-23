package Ejercicio3;

public class Principal {

	
	public static void main(String[] args) {
		
		Cilindro c1 = new Cilindro(2,3,Color.Rojo);
		
		c1.calcularSuperficie();
		c1.calcularVolumne();
		System.out.println((c1));
		
		
		
		Esfera e1 = new Esfera(5,Color.Amarillo);
		
		e1.calcularSuperficie();
		e1.calcularVolumne();
		
		System.out.println((e1.toString()));
		
		
		
		
		Prisma p1 = new Prisma(5,2,Color.Azul);
		
		p1.calcularSuperficie();
		p1.calcularVolumne();
		
		System.out.println((p1));
		
		

	}

}
