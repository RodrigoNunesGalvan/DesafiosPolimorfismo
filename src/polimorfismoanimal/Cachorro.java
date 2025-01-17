package polimorfismoanimal;

public class Cachorro extends Mamifero {
	public void reagir(String frase) {
		if (frase.equals("Toma Comida") || frase.equals("Ol�")) {
			System.out.println("Abanar e Latir");
		} else {
			System.out.println("Rosnar");
		}

	}

	public void reagir(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");
		} else if (hora >= 18) {
			System.out.println("Ignorar");
		} else {
			System.out.println("Abanar e Latir");
		}
	}

	public void reagir(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar");
		} else {
			System.out.println("Rosnar e Latir");
			this.emitirSom();
		}
	}

	public void reagir(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");
				this.emitirSom();
			}
		} else {
			if (peso < 10) {
				System.out.println("Rosnar");
			} else {
				System.out.println("Ignorar");
			}
		}
	}

	public void enterrarOsso() {
		System.out.println("Acabou de enterrar o osso.");
	}

	public void abanarRabo() {
		System.out.println("Quando ele est� feliz abana o rabo!");
	}

	@Override
	public void emitirSom() {
		System.out.println("Au! Au! Au!");
	}

}
