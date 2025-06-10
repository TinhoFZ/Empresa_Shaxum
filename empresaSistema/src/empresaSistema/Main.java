package empresaSistema;

import java.util.Scanner;

public class Main {
public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Bem vindo a Saxum! O que deseja fazer? \n [1] Cadastrar \n [2] Entrar \n [0] Sair");
		int escolhaMain = input.nextInt();
		
		switch (escolhaMain) {
		case 0:
			System.out.println("Sistema fechado.");
			System.exit(0);
			
			break;
		case 1:
			cadastrar();
			break;
		case 2:
			entrar();
			break;
			default:
				System.out.println("Valor inválido!");
				main(null);
		}
		
	}
	
	public static void cadastrar() {
		System.out.println(" [1] Cadastrar cliente \n [2] Cadastrar funcionario \n [0] Voltar");
		int escolhaCadastrar = input.nextInt();
		
			switch (escolhaCadastrar) {
			case 1:
				Cliente.cadastrarCliente();
				break;
			case 2:
				Funcionario.cadastrarFuncionario();
				break;
				default:
					main(null);
			}
	}
	
	public static void entrar() {
		System.out.println(" [1] Entrar cliente \n [2] Entrar funcionario \n [0] Voltar");
		int escolhaEntrar = input.nextInt();
		
			switch (escolhaEntrar) {
			case 1:
				Cliente.entrarCliente();
				break;
			case 2:
				Funcionario.entrarFuncionario();
				break;
				default:
					main(null);
			}
	}

}
