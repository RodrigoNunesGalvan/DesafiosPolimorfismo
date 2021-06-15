package polimorfismoanimal;

public abstract class Animal {
	//Atributos
	protected float peso;
	protected int idade;
	protected int menbros;
	
	//M�todos Publicos
	public abstract void locomover(); 
	public abstract void alimentar(); 
	public abstract void emitirSom(); 
	
	//M�todos Especiais
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getMenbros() {
		return menbros;
	}
	public void setMenbros(int menbros) {
		this.menbros = menbros;
	}
	

}
