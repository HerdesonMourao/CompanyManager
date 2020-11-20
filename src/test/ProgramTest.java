package test;

import java.util.Scanner;
import entities.*;
import enums.StatusFuncionario;
import enums.NivelDeAcesso;

public class ProgramTest {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		boolean sairOpcao = false;
		
		//Instancias
		Funcionario funcionario = null;
		
		do {
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
					System.out.println("Digite sua opção: ");
					int option2 = teclado.nextInt();
				
					if(option2 == 1) {
						System.out.println("=== Cadastro de Funcionario ===");
							
						System.out.println("Id: ");
						int id = teclado.nextInt();
							
						System.out.println("Nome: ");
						String nome = teclado.next();
							
						System.out.println("=== Telefone ===");
						System.out.println("DDD: ");
						String ddd = teclado.next();
						System.out.println("Numero: ");
						String numeroTelefone = teclado.next();
							
						Telefone telefone = new Telefone(ddd, numeroTelefone);
							
						System.out.println("=== Endereco ===");
						System.out.println("Logradouro: ");
						String logradouro = teclado.next();
						System.out.println("Numero: ");
						String numero = teclado.next();
						System.out.println("Complemento: ");
						String complemento = teclado.next();
						System.out.println("Bairro: ");
						String bairro = teclado.next();
						System.out.println("Cidade: ");
						String cidade = teclado.next();
						System.out.println("CEP: ");
						String cep = teclado.next();
						System.out.println("UF: ");
						String unidadeFederativa = teclado.next();
							
						Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, cep, unidadeFederativa);
							
						System.out.println("Cargo: ");
						String cargo = teclado.next();
							
						System.out.println("=== Status ===");
						System.out.println("1 - VINCULADO");
						System.out.println("2 - DESVINCULADO");
						System.out.println("Digite o status do funcionario: ");
						int op = teclado.nextInt();
						
						StatusFuncionario status;
									
						if(op == 1) {
							status = StatusFuncionario.VINCULADO;
						} else {
							status = StatusFuncionario.DESVINCULADO;
						}
							
						System.out.println("=== Nivel de acesso ===");
						System.out.println("1 - SIMPLES");
						System.out.println("2 - GERENCIA");
						System.out.println("3 - PROPRIETARIO");
						System.out.println("Digite o nivel de acesso do funcionario: ");	
						int op2 = teclado.nextInt();
							
						NivelDeAcesso nivelDeAcesso;
						
						if(op2 == 1) {
							nivelDeAcesso = NivelDeAcesso.SIMPLES;
						} else if(op2 == 2) {
							nivelDeAcesso = NivelDeAcesso.GERENCIA;
						} else {
							nivelDeAcesso = NivelDeAcesso.PROPRIETARIO;
						}
							
						System.out.println("Login: ");
						String login = teclado.next();
							
						System.out.println("Senha: ");
						String senha = teclado.next();
						
						try {
							funcionario = new Funcionario(nome, telefone, endereco, id, cargo, status, nivelDeAcesso, login, senha);
							
							funcionario.realizarCadastro(funcionario);
							
							System.out.println("");
							System.out.println("--- Cadastro realizado com sucesso ---");
							System.out.println("");
						}catch (Exception e) {
							System.out.println(e);
						}	
					}
					
					break;
				
				case 2:
					break;
					
				case 3:
					try {
						funcionario.visualizarCadastro();
					}catch (Exception e) {
						System.out.println(e);
					}
					
					break;
					
				case 4:
					break;
				
				case 5:
					break;
					
				case 0:
					System.out.println("=== Sair ===");
					System.out.println("Deseja realmente sair?");
					System.out.println("1 - sim");
					System.out.println("2 - não");
					System.out.println("Digite a opção desejada: ");
					int decisao = teclado.nextInt();

					if (decisao == 1) {
						sairOpcao = true;
					}
					
					break;
			}
		}while(sairOpcao != true);
		
		//Finish keyboard.
		teclado.close();
	}
}