package entities;

import java.util.GregorianCalendar;
import enums.StatusItem;

public class Itens {
	private int id_Item;
	private String nome;
	private String classificacao;
	private double valor;
	private Fornecedor fornecedor;
	private GregorianCalendar dataDeEntrada;
	private StatusItem statusItem;
	
	//Constructors
	public Itens(int id_Item, String nome, String classificacao, double valor, Fornecedor fornecedor, GregorianCalendar dataDeEntrada, StatusItem statusItem) {
		this.id_Item = id_Item;
		this.nome = nome;
		this.classificacao = classificacao;
		this.valor = valor;
		this.fornecedor = fornecedor;
		this.dataDeEntrada = dataDeEntrada;
		this.statusItem = statusItem;
	}

	//Gets and Sets
	public int getId_Item() {
		return id_Item;
	}
	public void setId_Item(int id_Item) {
		this.id_Item = id_Item;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public GregorianCalendar getDataDeEntrada() {
		return dataDeEntrada;
	}
	public void setDataDeEntrada(GregorianCalendar dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}
	public StatusItem getStatusItem() {
		return statusItem;
	}
	public void setStatusItem(StatusItem statusItem) {
		this.statusItem = statusItem;
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
	
	public void gerarRelatorioDeEstoque() {
		
	}

	@Override
	public String toString() {
		return "Itens [Id Item= " + getId_Item()
				+ ", Nome= " + getNome()
				+ ", Classificacao= " + getClassificacao()
				+ ", Valor= " + getValor()
				+ ", Fornecedor= " + getFornecedor().getNome()
				+ ", Data de entrada= " + getDataDeEntrada()
				+ ", Status Item= " + getStatusItem()
				+ "]";
	}
}