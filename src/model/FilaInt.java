package model;

public class FilaInt {
	private No inicio;
	private No fim;

	public FilaInt() {
		inicio = null;
		fim = null;
	}

	public boolean isEmpty() {
		if (inicio == null && fim == null) {
			return true;
		}
		return false;

	}

	public void insert(int valor) {
		No elemento = new No();
		elemento.dado = valor;

		if (isEmpty()) { // Se está vazio, inicio e fim apontam para o mesmo valor
			inicio = elemento;
			fim = elemento;
		} else { // Caso contrário, elemento entra pelo fim
			fim.proximo = elemento;
			fim = elemento;
		}
	}

	public int remove() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		int valor = inicio.dado;
		if (inicio == fim && inicio != null) {
			inicio = null;
			fim = inicio;
		} else {
			inicio = inicio.proximo;
		}
		return valor;
	}

	public void list() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos na fila");
		}
		No aux = inicio;
		while (aux != null) {
			System.out.print(aux.dado + " => ");
			aux = aux.proximo;
		}
		System.out.println("null");

	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			No aux = inicio;
			while (aux != null) {
				cont++;
				aux = aux.proximo;
			}
		}
		return cont;
	}

}
