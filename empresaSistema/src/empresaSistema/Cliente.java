package empresaSistema;

import java.util.Scanner;

public class Cliente {

public static Scanner input = new Scanner(System.in);
	
// Pedir mais informações quando o código estiver mais completo
public static String [] usuarioNome = new String[255], usuarioEmail = new String[255], 
usuarioCep = new String[255], cpf = new String[255], cnpj = new String[255];
public static int usuarios = 0;

	public static void cadastrarCliente() {
		
		System.out.println("Insira seu nome");
		usuarioNome[usuarios] = input.nextLine();
		
		System.out.println("Insira seu email");
		usuarioEmail[usuarios] = input.nextLine();
		
		System.out.println("Insira seu cpf");
		cpf[usuarios] = input.nextLine();
		
		System.out.println("Insira seu cep");
		usuarioCep[usuarios] = input.nextLine();
		
		usuarios++;
		Main.main(null);
		
	}
	
	public static void entrarCliente() {
		System.out.println("Qual o seu nome?");
		String consultarNome = input.nextLine();
		
		System.out.println("Qual seu email?");
		String consultarEmail = input.nextLine();
		
		System.out.println("Qual seu cpf?");
		String consultarCPF = input.nextLine();
		
		for (int i = 0; i < usuarios; i ++) {
			if (consultarNome.equalsIgnoreCase(usuarioNome[i]) && consultarEmail.equalsIgnoreCase(usuarioEmail[i])
					&& consultarCPF.equalsIgnoreCase(cpf[i])) {
				
				System.out.println("O que deseja fazer? \n [1] Ver produtos | [0] Voltar");
				int escolha = input.nextInt();
				
				switch (escolha) {
				case 0:
					Main.main(null);
					break;
				case 1:
					Produto.verProdutos();
					break;
					default:
						System.out.println("Valor inválido");
						Main.main(null);
				}
		}	else {
			System.out.println("Informações incorretas!");
			Main.main(null);
			}
	}
}
}
