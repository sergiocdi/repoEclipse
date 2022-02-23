package Ejercicio1;

public class Principal {

	public static void main(String[] args) {
		
		
		Coche c1 = new Coche("1234 yui", "rojo", 4, 1200,110,4);
		
		Coche c2 = new Coche("2345 yui", "azul", 4, 2000,210,4);

		
		Moto m1 = new Moto("3455 yui", "verde", 4, 2000,210,2);
		
		Moto m2 = new Moto("2345 yui", "azul", 4, 2000,210,2);
		
		
		System.out.println(c1.toString());
		System.out.println(c2);
		System.out.println(m1);
		System.out.println(m2);
	}

}
