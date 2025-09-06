//5. Sabe-se que, em uma Pilha, não é possível conhecer os elementos, no entanto, é possível
//adaptar o modelo de fila para auxiliar os desenvolvedores. Modificar o código da PilhaInt para
//incluir um novo método chamado max, que apresenta o maior valor da pilha. Considere que a
//pilha tem operações destrutivas e esse método não pode mudar o conteúdo, tampouco a
//estrutura da pilha.

package Pilha_Matheus;

public class Pilha_MAX {
	
	No topo;

	public Pilha_MAX() {
		topo = null;
		
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void Push(String n) {
		No elemento = new No();
		elemento.dado = n;
		if (isEmpty()) {
			topo = elemento;
		}
		else {
			elemento.proximo = topo;
			topo = elemento;
		}
		
	}
	
	public String Pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;

	}
	
	public String Top() throws Exception{
		if (isEmpty()) {
			throw new Exception("Não há elementos na pilha");
		}
		String dado = topo.dado;
		return dado;
	}
	
	
	public int Size(){
		int cont = 0;
		if (!isEmpty()) {
			No auxiliar = topo;
			cont = 1;
			while (auxiliar.proximo != null) {
				auxiliar = auxiliar.proximo;
				cont++;
			}
		}
		return cont;
		
	}
	
	public void Max() {
		int maiorValor = Integer.MIN_VALUE;
		No auxiliar = topo;
		if (isEmpty()) {
			System.out.println("A pilha está vazia, logo não possui elemento de maior valor");
		}
		if (!isEmpty()) {
			while (auxiliar != null) {
				int atual = Integer.parseInt(auxiliar.dado);
				if (atual > maiorValor) {
					maiorValor = atual;
				}
				auxiliar = auxiliar.proximo;
			}
			System.out.println("Maior valor: " +maiorValor);
		}

	}

}

