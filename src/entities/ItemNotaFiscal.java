package entities;

public class ItemNotaFiscal {
	private String codigoProduto;
	private String descricaoItem;
	private int quantidade;
	private double valorUnidade;
	private double valorTotal;
	
	//Constructs
	public ItemNotaFiscal(String codigoProduto, String descricaoItem, int quantidade, double valorUnidade, double valorTotal) {
		this.codigoProduto = codigoProduto;
		this.descricaoItem = descricaoItem;
		this.quantidade = quantidade;
		this.valorUnidade = valorUnidade;
		this.valorTotal = valorTotal;
	}
	
	//Gets and sets
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
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
	@Override
	public String toString() {
		return "ItemNotaFiscal [getCodigoProduto()=" + getCodigoProduto() + ", getDescricaoItem()=" + getDescricaoItem()
				+ ", getQuantidade()=" + getQuantidade() + ", getValorUnidade()=" + getValorUnidade()
				+ ", getValorTotal()=" + getValorTotal() + "]";
	}
}