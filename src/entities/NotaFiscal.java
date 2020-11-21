package entities;

import java.util.GregorianCalendar;

public class NotaFiscal {
	private Fornecedor nomeEmpresa;
	private GregorianCalendar dataDeEmissao;
	private double valorDoDocumento;
	private ItemNotaFiscal[] item;
	
	//Constructors
	public NotaFiscal(Fornecedor nomeEmpresa, GregorianCalendar dataDeEmissao, double valorDoDocumento, ItemNotaFiscal[] item) {
		this.nomeEmpresa = nomeEmpresa;
		this.dataDeEmissao = dataDeEmissao;
		this.valorDoDocumento = valorDoDocumento;
		this.item = item;
	}
	
	//Gets and Sets
	public Fornecedor getNomeEmpresa() {
		return nomeEmpresa;
	}
	public void setNomeEmpresa(Fornecedor nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	public GregorianCalendar getDataDeEmissao() {
		return dataDeEmissao;
	}
	public void setDataDeEmissao(GregorianCalendar dataDeEmissao) {
		this.dataDeEmissao = dataDeEmissao;
	}
	public double getValorDoDocumento() {
		return valorDoDocumento;
	}
	public void setValorDoDocumento(double valorDoDocumento) {
		this.valorDoDocumento = valorDoDocumento;
	}
	public ItemNotaFiscal[] getItem() {
		return item;
	}
	public void setItem(ItemNotaFiscal[] item) {
		this.item = item;
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
}