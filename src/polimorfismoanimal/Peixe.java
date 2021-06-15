package polimorfismoanimal;

public class Peixe extends Animal{
	private String corEscama;
	
	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

	@Override
	public void locomover() {
		System.out.println("Nadando!!");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo Subst�ncias!!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe n�o emite som!!");
	}
	
	public void soltarBolha() {
		System.out.println("O peixe acaba de soltar bolha.");
	}
}
