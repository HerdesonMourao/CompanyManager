package entities;

//Imports
import enums.StatusFuncionario;
import java.util.ArrayList;
import enums.NivelDeAcesso;

public class Funcionario extends Pessoa{
	private int id_Funcionario;
	private String cargo;
	private StatusFuncionario status;
	private NivelDeAcesso nivelDeAcesso;
	private String login;
	private String senha;
	
	private static ArrayList<Funcionario> dadosFuncionarios = new ArrayList<Funcionario>();

	//Constructors		
	public Funcionario(String nome, Telefone telefone, Endereco endereco, int id_Funcionario, String cargo, StatusFuncionario status, NivelDeAcesso nivelDeAcesso, String login, String senha) {
		super(nome, telefone, endereco);
		this.id_Funcionario = id_Funcionario;
		this.cargo = cargo;
		this.status = status;
		this.nivelDeAcesso = nivelDeAcesso;
		this.login = login;
		this.senha = senha;
	}

	//Gets and Sets
	public int getId_Funcionario() {
		return id_Funcionario;
	}
	public void setId_Funcionario(int id_Funcionario) {
		this.id_Funcionario = id_Funcionario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public StatusFuncionario getStatus() {
		return status;
	}
	public void setStatus(StatusFuncionario status) {
		this.status = status;
	}
	public NivelDeAcesso getNivelDeAcesso() {
		return nivelDeAcesso;
	}
	public void setNivelDeAcesso(NivelDeAcesso nivelDeAcesso) {
		this.nivelDeAcesso = nivelDeAcesso;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	//Methods
	public void realizarCadastro(Funcionario funcionario) {
		dadosFuncionarios.add(funcionario);
	}
	
	public void visualizarCadastro(int idDesejado) {
		for(Funcionario fun: dadosFuncionarios) {
			if(fun.getId_Funcionario() == idDesejado) {
				System.out.println(fun.toString());
			}
		}
	}
	
	public void atualizarCadastro(Funcionario funcionario) {
		for (Funcionario fun : dadosFuncionarios) {
			if (fun.getId_Funcionario() == funcionario.getId_Funcionario()) {
				dadosFuncionarios.set(dadosFuncionarios.indexOf(fun), funcionario);
			}
		}
	}
	
	public void deletarCadastro(int id) {
		for (Funcionario funcionario : dadosFuncionarios) {
            if (funcionario.getId_Funcionario() == id) {
                dadosFuncionarios.remove(funcionario);
            }
        }
	}

	@Override
	public String toString() {
		return "Funcionario [Id Funcionario= " + getId_Funcionario() 
				+ ", Nome= " + getNome()
				+ ", Telefone= " + getTelefone().toString()
				+ ", Endereco= " + getEndereco().toString()
				+ ", Cargo= " + getCargo()
				+ ", Status= " + getStatus()
				+ ", Nivel de acesso= " + getNivelDeAcesso() 
				+ ", Login=" + getLogin()
				+ ", Senha= " + getSenha()
				+ "]";
	}	
}