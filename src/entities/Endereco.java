package entities;

public class Endereco {
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String cep;
	private String unidadeFederativa;
	
	//Constructors
	public Endereco(String logradouro, String numero, String bairro, String cidade, String cep, String unidadeFederativa) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.unidadeFederativa = unidadeFederativa;
	}
	
	public Endereco(String logradouro, String numero, String complemento, String bairro, String cidade, String cep, String unidadeFederativa) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		this.unidadeFederativa = unidadeFederativa;
	}
	
	//Gets and Sets
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}
	
	public void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}
	
	//Methods
	@Override
	public String toString() {
		return this.getLogradouro() +
				", nº " + this.getNumero() +
				", " + this.getComplemento() +
				", " + this.getBairro() +
				", " + this.getCidade() +
				", " + this.getCep() +
				", " + this.getUnidadeFederativa() + ".";
	}
}