package empresaSistema;

import java.util.Scanner;

public class Main {
public static Scanner input = new Scanner(System.in);
private static String escolhaMain, escolhaCadastrar, escolhaEntrar;

	public static void main(String[] args) {
		
		System.out.println("Bem vindo a Saxum! O que deseja fazer? \n [1] Cadastrar \n [2] Entrar \n [3] Sair");
		escolhaMain = input.nextLine();
		
		switch (escolhaMain) {
		case "1":
			cadastrar();
			break;
		case "2":
			entrar();
			break;
			default:
				System.exit(0);
		}
		
	}
	
	public static void cadastrar() {
		System.out.println(" [1] Cadastrar cliente \n [2] Cadastrar funcionario \n [3] Voltar");
		
		escolhaCadastrar = input.nextLine();
		input.nextLine();

			switch (escolhaCadastrar) {
			case "1":
				Cliente.cadastrarCliente();
				break;
			case "2":
				Funcionario.cadastrarFuncionario();
				break;
				default:
					main(null);
			}
	}
	
	public static void entrar() {
		System.out.println(" [1] Entrar cliente \n [2] Entrar funcionario \n [3] Voltar");
		try {
		escolhaEntrar = input.nextLine();
		} catch (Exception e) {
			System.out.println("Insira um valor válido.");
		}
			switch (escolhaEntrar) {
			case "1":
				Cliente.entrarCliente();
				break;
			case "2":
				Funcionario.entrarFuncionario();
				break;
				default:
					main(null);
			}
	}

}
