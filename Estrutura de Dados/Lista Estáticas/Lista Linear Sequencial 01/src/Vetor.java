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
	public void adiciona(String elemento) {
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			
		}else {
			this.aumentaCapacidade();
			this.elementos[this.tamanho] = elemento;
		}
		this.tamanho++;
	}
	
	//Aula 03/04
	public int getTamanho() {
		return this.tamanho;
	}
	
	public int getTamanho2() {
		int contador = 0;
		
		for(int i = 0; i < this.elementos.length; i++) {
			if(this.elementos[i] != null) {
				contador++;
			}else {
				break;
			}
		}
		return contador;
	}
	
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for(int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		if(this.tamanho > 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		s.append("]");
		return s.toString();
	}
	
	//Aula 04
	public String busca(int posicao) {
		/*if (! (posicao >= 0) && (posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posi��o Inv�lida!");
		}else {
			return this.elementos[posicao];
		}*/
		
		try {
			return this.elementos[posicao];
		} catch(Exception e) {
			return "Posica��o inv�lida do vetor!";
		}
	}
	
	public boolean verifica(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				return true;
			}
		}
		return false;
	}
	
	public int verificaPosicao(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}
	//Aula 05
	public boolean adicionaPosicao(int posicao, String elemento) {
		
		if(!((posicao >= 0) && (posicao <= this.tamanho))) {
			throw new IllegalArgumentException("Posi��o Inv�lida!");
		}
		
		//Aula 07
		if(this.tamanho == this.elementos.length) {
			this.aumentaCapacidade();
		}
		
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i + 1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		return true;
	}
	
	//Aula 06
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			
			for(int i = 0; i < this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//Aula 07
	public void removerelemento(String elemento) {
		int posicao = this.verificaPosicao(elemento);
		
		if(posicao > -1) {
			for(int i = posicao; i < tamanho - 1; i++) {
				this.elementos[i] = this.elementos[i + 1];
			}
			this.tamanho--;
		}
	}
	
	public void clear() {
		for(int i = 0; i < this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
	}
	
	public int lastIndexOf(Object objeto) {
		
		for(int i = this.tamanho - 1; i >= 0; i--) {
			if(this.elementos[i].equals(objeto)) {
				return i;
			}
		}
		return -1;
	}
	
	public int teste(Object objeto) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(objeto)) {
				return i;
			}
		}
		return -1;
	}
}
