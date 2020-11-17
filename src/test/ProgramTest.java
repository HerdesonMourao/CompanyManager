package test;

import java.util.Scanner;

public class ProgramTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		
		Scanner teclado = new Scanner(System.in);
		
		//Menu Option
		System.out.println("=== Menu ===");
		System.out.println("1) Cadastrar");
		System.out.println("2) Editar");
		System.out.println("3) Visualizar");
		System.out.println("4) Deletar");
		System.out.println("5) Gerar relatório");
		System.out.println("0) Sair");
		System.out.println("Digite sua opção: ");
		int option = teclado.nextInt();
		
		switch (option) {
			case 1:
				System.out.println("=== Qual cadastro deseja fazer ===");
				System.out.println("1) Funcionario");
			
				break;
		}
		//Created Funcionario
		System.out.println("=== Cradastrar Funcionario ===");
		
		
		//Finish keyboard.
		teclado.close();
	}
}