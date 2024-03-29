import java.util.Arrays;

public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	//Aula 02
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}
	/*
	public void adiciona(String elemento) {
		for(int i = 0; i <this.elementos.length; i++) {
			if(this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}*/
	public boolean adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elementos;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	//Aula 03
	public int getTamanho() {
		return this.tamanho;
	}
	
	public int getTamanho2() {
		int contador = 0;
		
		for(int i = 0; int < this.elementos.length; i++) {
			if(this.elementos[i] != null) {
				contador++;
			}else {
				break;
			}
		}
		return contador;
	}
	
	@Override
	public String toString() {
		return "Vetor [elementos=" + Arrays.toString(elementos) + ", tamanho=" + tamanho + "]";
	}
	
}
