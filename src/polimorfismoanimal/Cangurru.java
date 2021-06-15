package polimorfismoanimal;

public class Cangurru extends Mamifero {
	public void usarBolsa() {
		System.out.println("Usando Bolsa");
	}

	@Override
	public void locomover() {
		System.out.println("Saltando!!");
	}
	

}
