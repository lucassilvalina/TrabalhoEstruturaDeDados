package dominio;

public class funcoes {
	public int buscaAleatoriaPoseEspecifica(int index, int vetor[]) {
		int token = -1;
		for (int i = 0; i < vetor.length; i++) {
			if (i == index) {
				System.out.println("Index encontrado! Valor armezenado nele é: " + vetor[i]);
				token = i;
			}
		}
		if (token < 0) {
			System.out.println("INDEX NÃO ENCONTRADO!");
		}
		return token;
	}

//------------------------------------- MENU 03 -------------------------------------------------------------	
	public int buscaDeterminadoElemento(int elemento, int vetor2[]) {
		int token = -1;
		for (int i = 0; i < vetor2.length; i++) {
			if (vetor2[i] == elemento) {
				System.out.println("VALOR ENCONTRADO! No index:" + i);
				token = i;
			}
		}
		if (token < 0) {
			System.out.println("VALOR NÃO ENCONTRADO!");
		}

		return elemento;
	}

//---------------------------------- MEUNU 04-----------------------------------------------------------------	
	public int remocaoElementoPoseEspecifica(int posiElemento, int listaPosiElemento[]) {
		int token = -1;

		for (int i = 0; i < listaPosiElemento.length; i++) {
			if (i == posiElemento) {
				listaPosiElemento[i] = listaPosiElemento[listaPosiElemento.length - 1];
				System.out.println("Elemento Removido com sucesso!");
				token = 1;
			}
		}

		if (token > -1) {
			for (int a = 0; a < listaPosiElemento.length; a++) {
				System.out.println(listaPosiElemento[a]);
			}
		}

		if (token < 0) {
			System.out.println("INDEX NÃO ENCONTRADO!");
		}

		return token;
	}

//-------------------------MEUNU 05-------------------------------------------------------------------------------------
	public int removerDeterminadoElemento(int determinadoElemento, int listaInteiros[]) {
		int token = -1;
		for (int verificador = 0; verificador < listaInteiros.length; verificador++) {
			if (listaInteiros[verificador] == determinadoElemento) {
				token = verificador;
			}
		}
		if (token < 0) {
			System.out.println("VALOR NÃO ENCONTRADO!");
		}

		for (int i = 0; i < listaInteiros.length; i++) {
			if (listaInteiros[i] == determinadoElemento) {
				listaInteiros[i] = listaInteiros[listaInteiros.length - 1];
				System.out.println("Valor Removido com sucesso!");
			}
		}
		if (token > -1) {
			for (int a = 0; a < listaInteiros.length; a++) {
				System.out.println(listaInteiros[a]);
			}
		}
		return determinadoElemento;

	}

//-------------------------MEUNU 08-------------------------------------------------------------------------------------
	public int buscar(int valor, int listaBinaria[]) {
		int meio;
		int inicio = 0;
		int fim = listaBinaria.length;

		while (inicio <= fim) {
			meio = (inicio + fim) / 2;

			if (listaBinaria[meio] == valor) {
				System.out.println("Valor encontrado");
			} else if (listaBinaria[meio] < valor)
				inicio = meio + 1;
			else if (listaBinaria[meio] > valor)
				fim = meio + 1;
			return fim;
		}
//-------------------------------------------------------------------------------------------------------------

		return fim;
	}
	
	
	public int pilha(int indexP, int vetorP[]) {
		
		
		
		return indexP;
		
		
	}
}