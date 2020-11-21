package entities;

import java.util.ArrayList;
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
	
	private static ArrayList<Itens> dadosItens = new ArrayList<Itens>();
	
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
	public void realizarCadastro(Itens itens) {
		dadosItens.add(itens);
	}
		
	public void visualizarCadastro(int idDesejado) {
		for(Itens item : dadosItens) {
			if(item.getId_Item() == idDesejado) {
				System.out.println(item.toString());
			}
		}
	}
		
	public void atualizarCadastro(Itens itens) {
		for (Itens item : dadosItens) {
			if (item.getId_Item() == itens.getId_Item()) {
				dadosItens.set(dadosItens.indexOf(item), itens);
			}
		}
	}
	
	public void deletarCadastro(int id) {
		for (Itens itens : dadosItens) {
            if (itens.getId_Item() == id) {
                dadosItens.remove(itens);
            }
        }
	}
	
	public void gerarRelatorioDeEstoque() {
		for(Itens itens : dadosItens) {
			System.out.println(itens.getNome());
		}
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