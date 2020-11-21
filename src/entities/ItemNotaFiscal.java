package entities;

import java.util.ArrayList;

public class ItemNotaFiscal {
	private int codigoProduto;
	private String descricaoItem;
	private int quantidade;
	private double valorUnidade;
	private double valorTotal;
	
	private static ArrayList<ItemNotaFiscal> dadosNotaFiscal = new ArrayList<ItemNotaFiscal>();
	
	//Constructs
	public ItemNotaFiscal(int codigoProduto, String descricaoItem, int quantidade, double valorUnidade, double valorTotal) {
		this.codigoProduto = codigoProduto;
		this.descricaoItem = descricaoItem;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
		this.valorTotal = valorTotal;
	}
	
	//Gets and sets
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	public String getDescricaoItem() {
		return descricaoItem;
	}
	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValorUnidade() {
		return valorUnidade;
	}
	public void setValorUnidade(double valorUnidade) {
		this.valorUnidade = valorUnidade;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	//Methods
	public void realizarCadastro(ItemNotaFiscal itemNotaFiscal) {
		dadosNotaFiscal.add(itemNotaFiscal);
	}
		
	public void visualizarCadastro(int idDesejado) {
		for(ItemNotaFiscal nota : dadosNotaFiscal) {
			if(nota.getCodigoProduto() == idDesejado) {
				System.out.println(nota.toString());
			}
		}
	}
		
	public void atualizarCadastro(ItemNotaFiscal itemNotaFiscal) {
		for (ItemNotaFiscal nota : dadosNotaFiscal) {
			if (nota.getCodigoProduto() == itemNotaFiscal.getCodigoProduto()) {
				dadosNotaFiscal.set(dadosNotaFiscal.indexOf(nota), itemNotaFiscal);
			}
		}
	}
		
	public void deletarCadastro(int id) {
		for (ItemNotaFiscal nota : dadosNotaFiscal) {
            if (nota.getCodigoProduto() == id) {
                dadosNotaFiscal.remove(nota);
            }
        }
	}
		
	@Override
	public String toString() {
		return "ItemNotaFiscal [Codigo produto= " + getCodigoProduto()
				+ ", Descricao do item= " + getDescricaoItem()
				+ ", Quantidade= " + getQuantidade()
				+ ", Valor unitario= " + getValorUnidade()
				+ ", Valor total= " + getValorTotal() + "]";
	}
}