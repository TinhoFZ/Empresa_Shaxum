package empresaSistema;

import java.util.Scanner;

public class Produto {
public static Scanner input = new Scanner(System.in);

public static int codigoCelular = 46, codigoTablet = 32, codigoNotebook = 54,
quantidadeCelular, quantidadeTablet, quantidadeNotebook, escolha;
public static double precoCelular = 290, precoTablet = 400, precoNotebook = 1290;
	// Rodou é usado para checar se certa parte do código já foi usada
public static boolean rodou = false;

	public static void verProdutos() {
		System.out.println("Produtos em estoque: "
				+ "\n Nome: Celular | Preço: R$ 290,00 | Código: 46"
				+ "\n Nome: Tablet | Preço: R$ 400,00 | Código: 32"
				+ "\n Nome: Notebook | Preço: R$ 1290,00 | Código: 54");
		
		System.out.println("\n O que deseja fazer? \n [1] Comprar | [0] Voltar");
		int escolha = input.nextInt();
		
		switch(escolha) {
		case 0:
			Main.main(null);
			break;
		case 1:
			comprarProdutos();
			quantidadeCelular = 0;
			quantidadeTablet = 0;
			quantidadeNotebook = 0;
			break;
			default:
				System.out.println("Valor inválido");
				Main.main(null);
		}
	}
	
	public static void comprarProdutos() {
		
		for (int i = 0; i < 255; i ++) {
			
			if (rodou == true) {
				System.out.println("Deseja parar de comprar? [0] Sim | [Qualquer valor] Não");
				escolha = input.nextInt();
			}
			rodou = true;

			
			if (escolha == 0) {
				double precoTotal = (precoCelular * quantidadeCelular) + (precoTablet * quantidadeTablet) + 
						(precoNotebook * quantidadeNotebook);
				
				System.out.println("Você comprou: \n Celular: " + quantidadeCelular + "| Por R$"+ precoCelular * quantidadeCelular + 
						"\n Tablet: " + quantidadeTablet + "| Por R$"+ precoTablet * quantidadeTablet + 
						"\n Notebook: " + quantidadeNotebook + "| Por R$"+ precoNotebook * quantidadeNotebook + 
						"\n Por um total de R$" + precoTotal);
				Main.main(null);
			}
			
			System.out.println("Insira o código do produto que deseja adicionar ao carrinho");
			int codigoEscolhido = input.nextInt();
			switch (codigoEscolhido) {
			case 46:
				quantidadeCelular ++;
				break;
			case 32:
				quantidadeTablet ++;
				break;
			case 54:
				quantidadeNotebook ++;
				break;
				default: 
					System.out.println("Código invalido");
					comprarProdutos();
			}
			System.out.println("Seu carrinho tem: \n Celular: " + quantidadeCelular + 
					"\n Tablet: " + quantidadeTablet + "\n Notebook: " + quantidadeNotebook);
		}
	}
}