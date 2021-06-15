package polimorfismoanimal;

public class PolimorfismoAnimal {

	public static void main(String[] args) {
		Mamifero m = new Mamifero();
		Cangurru c = new Cangurru();
		Cachorro k = new Cachorro();
		Tartaruga t = new Tartaruga();
		Goldfish g = new Goldfish();
		System.out.println("Polimorfismo de Sobreposi��o");
		System.out.println("Atributos e M�todos do Mam�fero");
		m.setPeso(78.5f);
		m.setIdade(10);
		m.setMenbros(4);
		m.setCorPelo("black");
		m.alimentar();
		m.emitirSom();
		m.locomover();
		System.out.println("---------------------------------------");
		System.out.println("Atributos e M�todos do Canguru");
		System.out.println("Usando o Polimorfismo no m�todo locomover.");
		c.usarBolsa();
		c.locomover();
		System.out.println("---------------------------------------");
		System.out.println("Atributos e M�todos do Cachorro");
		System.out.println("Usando o Polimorfismo no m�todo emitirSom");
		k.emitirSom();
		k.alimentar();
		k.enterrarOsso();
		k.abanarRabo();
		System.out.println("---------------------------------------");
		t.locomover();
		System.out.println("---------------------------------------");
		g.locomover();
		System.out.println("---------------------------------------");
		System.out.println("Polimorfismo de Sobregarga");
		System.out.println("Rea��es que criei na clase cachorro");
		k.reagir("Toma Comida");
		k.reagir("Vai apanhar");
		k.reagir(11, 45);
		k.reagir(21, 00);
		k.reagir(true);
		k.reagir(false);
		k.reagir(2, 12.5f);
		k.reagir(17, 4.5f);
	}

}
