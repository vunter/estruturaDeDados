package arrays;

public class Pilha {

	public Object[] pilha;
	public int posicaoPilha;

	public Pilha(int x) {
		this.posicaoPilha = -1;
		this.pilha = new Object[x];
	}

	public boolean pilhaVazia() {
		if (this.posicaoPilha == -1) {
			return true;
		}
		return false;
	}

	public int tamanho() {
		if (this.pilhaVazia()) {
			return 0;
		}
		return this.posicaoPilha + 1;
	}

	public boolean empilhar(Object valor) {
		if (this.posicaoPilha < this.pilha.length - 1) {
			this.pilha[++posicaoPilha] = valor;
			return true;
		} else {
			return false;
		}
	}

	public Object desempilhar() {
		if (pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha--];
	}

	public Object exibeUltimoValor() {
		if (this.pilhaVazia()) {
			return null;
		}
		return this.pilha[this.posicaoPilha];
	}

}
