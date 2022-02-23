package Ejercicio3;

public class Prisma extends Cuerpo {

	private float ladoBase, altura;

	
	public Prisma(float ladoBase, float altura, Color col) {
		super(col);
		this.ladoBase=ladoBase;
		this.altura=altura;
		
	}
	
	public Prisma(float superficie, float volumen, Color col, float ladoBase, float altura) {
		super(superficie, volumen, col);
		
		this.ladoBase=ladoBase;
		this.altura=altura;
	}

	@Override
	public String toString() {
		return "Prisma [ladoBase=" + ladoBase + ", altura=" + altura + ", superficie=" + superficie + ", volumen="
				+ volumen + ", col=" + col + "]";
	}

	@Override
	public void calcularSuperficie() {
		
		superficie = 4* ladoBase* altura + 2 * ladoBase* ladoBase;
		
	}

	@Override
	public void calcularVolumne() {
		volumen = ladoBase*ladoBase* altura;
		
	}
	
	
	
	


}
