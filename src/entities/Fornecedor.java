package entities;

import java.util.ArrayList;

public class Fornecedor extends Pessoa {
	private int id_Fornecedor;
	private String cnpj;
	private Divida dividaMercadoria;
	
	private static ArrayList<Fornecedor> dadosFornecedor = new ArrayList<Fornecedor>();
	
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
		dadosFornecedor.add(fornecedor);
	}
	
	public void visualizarCadastro(int idDesejado) {
		for(Fornecedor fornecedor : dadosFornecedor) {
			if(fornecedor.getId_Fornecedor() == idDesejado) {
				System.out.println(fornecedor.toString());
			}
		}
	}
	
	public void atualizarCadastro(Fornecedor fornecedor) {
		for (Fornecedor forn : dadosFornecedor) {
			if (forn.getId_Fornecedor() == fornecedor.getId_Fornecedor()) {
				dadosFornecedor.set(dadosFornecedor.indexOf(forn), fornecedor);
			}
		}
	}
	
	public void deletarCadastro(int id) {
		for (Fornecedor fornecedor : dadosFornecedor) {
            if (fornecedor.getId_Fornecedor() == id) {
                dadosFornecedor.remove(fornecedor);
            }
        }
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