package controle;
import java.util.Scanner;
import dominio.funcoes;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da Lista: ");
		int tamanho = scan.nextInt();
		int listaInteiros[] = new int[tamanho];
		funcoes func = new funcoes();
		int fechar=1;
		System.out.println("Escolha uma das Opção abaixo:");
		do {
			
			System.out.println("1 - Inserção de um elemento na lista");
			System.out.println("2 - Busca aleatória por um elemento de uma posição específica da lista");
			System.out.println("3 - Busca por um determinado elemento na lista");
			System.out.println("4 - Remoção de um elemento que ocupa uma posição específica na lista");
			System.out.println("5 - Remoção de um determinado elemento da lista");
			System.out.println("6 - Ordenar a lista (Bubble Sort)");
			System.out.println("7 - Inserir um novo elemento na lista já ordenada");
			System.out.println("8 - Realizar a busca binária por um elemento da lista");
			System.out.println("9 - Remover um elemento da lista ordenada");
			System.out.println("10 - Add a pilha");
			int menuPrincipal = scan.nextInt();
			
			switch (menuPrincipal) {
			
				case 1: 
					System.out.println("1 - Inserção de um elemento na lista");
					System.out.println("");
					int aux = 0;
				int finalizar;
				do {
							System.out.println("Informe o valor a ser adicionado na lista: ");
							listaInteiros[aux] = scan.nextInt();
							
							aux++;
							System.out.println("Deseja inserir mais um numero? (1) Sim (0)Não");
							finalizar = scan.nextInt();
					}while(finalizar != 0);
					break;
				case 2: 
					System.out.println("2 - Busca aleatória por um elemento de uma posição específica da lista");
					System.out.println();
					System.out.println("Informe o index desejado: ");
					int index = scan.nextInt();
					func.buscaAleatoriaPoseEspecifica(index, listaInteiros);
					break;
				case 3: 
					System.out.println("3 -  Busca por um determinado elemento na lista");
					System.out.println();
					System.out.println("Informe o valor que deseja preocurar: ");
					int elemento = scan.nextInt();
					func.buscaDeterminadoElemento(elemento, listaInteiros);
					break;
				case 4: 
					System.out.println("4 - Remoção de um elemento que ocupa uma posição específica na lista");
					System.out.println();
					System.out.println("Informe a posição que deseja apagar: ");
					int posicao = scan.nextInt();
					func.remocaoElementoPoseEspecifica(posicao, listaInteiros);
					break;
				case 5: 
					System.out.println("5 - Remoção de um determinado elemento da lista");
					System.out.println();
					System.out.println("Informe o valor a ser elimidado: ");
					int valor = scan.nextInt();
					func.removerDeterminadoElemento(valor, listaInteiros);
					break;
				case 6: 
					System.out.println("6 - Ordenar a lista (Bubble Sort)");
					for(int i = 0; i < listaInteiros.length; ++i) {
						
						for(int a = 0; a < (listaInteiros.length - 1); ++a) {
							if(listaInteiros[a] > listaInteiros[a + 1]) {
								aux = listaInteiros[a];
								listaInteiros[a] = listaInteiros[a + 1];
								listaInteiros[a + 1] = aux; 
							}
						}
					}
					for(int start = 0; start < listaInteiros.length; start++) {
						System.out.println(listaInteiros[start]);
					}
					break;
/*gabiarra*/		case 7:
					System.out.println("7 - Inserir um novo elemento na lista já ordenada");
					System.out.println("informe um numero: ");
					listaInteiros[2] = scan.nextInt();
					for(int i = 0; i < listaInteiros.length; ++i) {
						
						for(int a = 0; a < (listaInteiros.length - 1); ++a) {
							if(listaInteiros[a] > listaInteiros[a + 1]) {
								aux = listaInteiros[a];
								listaInteiros[a] = listaInteiros[a + 1];
								listaInteiros[a + 1] = aux; 
							}
						}
					}
					for(int start = 0; start < listaInteiros.length; start++) {
						System.out.println(listaInteiros[start]);
					}
					break;
				case 8: 
					System.out.println("8 - Realizar a busca binária por um elemento da lista");
					System.out.println("Informe o valor a ser buscado: ");
					int buscaB = scan.nextInt();
					func.buscar(buscaB, listaInteiros);
					break;
				case 9: 
					System.out.println("9 - Remover um elemento da lista ordenada");
					break;	
				case 10:
					
					//func.pilha(, listaInteiros);
				
			}
			
		System.out.println("Deseja encerrar o programa? (0)Sim | (1) Não");
		fechar = scan.nextInt();	
		
		}while(fechar!=0);
	}
}