package empresaSistema;

import java.util.Scanner;

public class Funcionario {

public static Scanner input = new Scanner(System.in);

public static String [] funcionarioNome = new String[255], funcionarioEmail = new String[255], 
funcionarioCep = new String[255], cargo = new String[255];
public static double [] salario = new double[255];
public static int [] diasTrabalhados = new int[255];
public static boolean [] folga = new boolean[255];
// funcionarioAtual serve para saber qual usuário está logado atualmente
public static int funcionarios = 0, funcionarioAtual;
private static String escolha;

	public static void cadastrarFuncionario() {
		
		System.out.println("Insira seu nome");
		funcionarioNome[funcionarios] = input.nextLine();
		
		System.out.println("Insira seu email");
		funcionarioEmail[funcionarios] = input.nextLine();
		
		System.out.println("Insira seu cep");
		funcionarioCep[funcionarios] = input.nextLine();
		
		System.out.println("Insira seu cargo");
		cargo[funcionarios] = input.nextLine();
		
		try {
			System.out.println("Insira seu salário");
			salario[funcionarios] = input.nextDouble();
	
			System.out.println("Insira a quantidade de dias trabalhados (de 1 a 30)");
			diasTrabalhados[funcionarios] = input.nextInt();
			input.nextLine();
		} catch (Exception e) {
			System.out.println("Insira um valor válido.");
			Main.main(null);
		}
		
		if (diasTrabalhados[funcionarios] == 30) {
			folga[funcionarios] = true;
		} else if (diasTrabalhados[funcionarios] < 30){
			folga[funcionarios] = false;
		} else {
			System.out.println("Você não pode trabalhar mais de 30 dias!");
			cadastrarFuncionario();
		}
		
		funcionarios++;
		Main.main(null);
	}
	
	public static void entrarFuncionario() {
		
		System.out.println("Qual o seu nome?");
		String consultarNome = input.nextLine();
		
		System.out.println("Qual seu email?");
		String consultarEmail = input.nextLine();
		
		System.out.println("Qual seu CEP?");
		String consultarCEP = input.nextLine();
		
		for (int i = 0; i < funcionarios; i ++) {
			if (consultarNome.equalsIgnoreCase(funcionarioNome[i]) && consultarEmail.equalsIgnoreCase(funcionarioEmail[i])
					&& consultarCEP.equalsIgnoreCase(funcionarioCep[i])) {	
				
				funcionarioAtual = i;
				System.out.println("O que deseja fazer? \n [1] Ver salario | [0] Voltar");
				escolha = input.nextLine();
				
				switch (escolha) {
				case "0":
					Main.entrar();
					break;
				case "1":
					Salario.verSalario();
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
