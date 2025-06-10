package empresaSistema;

import java.util.Scanner;

public class Salario {
public static Scanner input = new Scanner(System.in);

public static double [] desconto = new double[255], salarioTotal = new double[255];
	public static void verSalario() {
		
		// i é usado para diminuir o tamanho do código
		int i = Funcionario.funcionarioAtual;
		desconto[i] = (30 - Funcionario.diasTrabalhados[i]) * (Funcionario.salario[i]/30);
		
		salarioTotal[i] = Funcionario.salario[i] - desconto[i]; 

		System.out.println(" Salario base: " + Funcionario.salario[i]  + 
				"\n Dias trabalhados: " + Funcionario.diasTrabalhados[i] + 
				"\n Salario descontado: " + desconto[i] + 
				"\n Salario total: " + salarioTotal[i]);
		
		if (Funcionario.folga[i]) {
			System.out.println("Tem folga: Sim");
		} else {
			System.out.println("Tem folga: Não");
		}
	
	Main.main(null);
	}
}
