package Ejercicio3;

public class Cilindro extends Cuerpo{
	
	private float radioBase,altura;

	public Cilindro(float radioBase, float altura, Color col) {
		super(col);
		
		this.radioBase = radioBase;
		this.altura=altura;
		// TODO Auto-generated constructor stub
	}
	
	
	
	 
	public Cilindro(Color col, float radioBase, float altura) {
		super(col);
		this.radioBase = radioBase;
		this.altura = altura;
	}




	@Override
	public void calcularSuperficie() {
		superficie = (float) ((Math.PI)*2*radioBase*(radioBase*altura));
	}




	@Override
	public void calcularVolumne() {
		volumen = (float)((Math.PI)* radioBase*radioBase*altura);
		
	}




	public Cilindro(Color col) {
		super(col);
		// TODO Auto-generated constructor stub
	}




	




	@Override
	public String toString() {
		
		return super.toString() + "Cilindro [radioBase=" + radioBase + ", altura=" + altura + "]";
	}


}
