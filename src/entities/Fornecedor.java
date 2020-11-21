package entities;

public class Fornecedor extends Pessoa {
	private int id_Fornecedor;
	private String cnpj;
	private Divida dividaMercadoria;
	
	//Methods
	public Fornecedor(String nome, Telefone telefone, Endereco endereco, int id_Fornecedor, String cnpj, Divida dividaMercadoria) {
		super(nome, telefone, endereco);
		this.id_Fornecedor = id_Fornecedor;
		this.cnpj = cnpj;
		this.dividaMercadoria = dividaMercadoria;
	}

	//Gets and Sets
	public int getId_Fornecedor() {
		return id_Fornecedor;
	}
	public void setId_Fornecedor(int id_Fornecedor) {
		this.id_Fornecedor = id_Fornecedor;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Divida getDividaMercadoria() {
		return dividaMercadoria;
	}
	public void setDividaMercadoria(Divida dividaMercadoria) {
		this.dividaMercadoria = dividaMercadoria;
	}
	
	//Methods
	public void realizarCadastro(Fornecedor fornecedor) {
		
	}
	
	public void visualizarCadastro(int idDesejado) {
	
	}
	
	public void atualizarCadastro() {
		
	}
	
	public void deletarCadastro() {
		
	}

	@Override
	public String toString() {
		return "Fornecedor [id Fornecedor= " + getId_Fornecedor()
				+ ", Nome= " + getNome()
				+ ", Telefone= " + getTelefone()
				+ ", Endereco= " + getEndereco()
				+ ", Cnpj= " + getCnpj() 
				+ ", Divida de Mercadoria= " + getDividaMercadoria()
				+ "]";
	}	
}