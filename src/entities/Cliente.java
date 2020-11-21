package entities;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import enums.StatusCliente;

public class Cliente extends Pessoa {
	private int id_Cliente;
	private StatusCliente status;
	private Divida divida;
	private GregorianCalendar dataDaUltimaCompra;
	
	private static ArrayList<Cliente> dadosClientes = new ArrayList<Cliente>();
	
	//Constructors
	public Cliente(String nome, Telefone telefone, Endereco endereco, int id_cliente, StatusCliente status, Divida divida, GregorianCalendar dataUltimaCompra) {
		super(nome, telefone, endereco);
		this.id_Cliente = id_cliente;
		this.status = status;
		this.divida = divida;
		this.dataDaUltimaCompra = dataUltimaCompra;
	}
	
	//Gets and sets
	public int getId_Cliente() {
		return id_Cliente;
	}
	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}
	public StatusCliente getStatus() {
		return status;
	}
	public void setStatus(StatusCliente status) {
		this.status = status;
	}
	public Divida getDivida() {
		return divida;
	}
	public void setDivida(Divida divida) {
		this.divida = divida;
	}
	public GregorianCalendar getDataDaUltimaCompra() {
		return dataDaUltimaCompra;
	}
	public void setDataDaUltimaCompra(GregorianCalendar dataDaUltimaCompra) {
		this.dataDaUltimaCompra = dataDaUltimaCompra;
	}
	
	//Methods
	public void realizarCadastro(Cliente cliente) {
		dadosClientes.add(cliente);
	}
	
	public void visualizarCadastro(int idDesejado) {
		for(Cliente cli : dadosClientes) {
			if(cli.getId_Cliente() == idDesejado) {
				System.out.println(cli.toString());
			}
		}
	}
	
	public void atualizarCadastro(Cliente cliente) {
		for (Cliente cli : dadosClientes) {
			if (cli.getId_Cliente() == cliente.getId_Cliente()) {
				dadosClientes.set(dadosClientes.indexOf(cli), cliente);
			}
		}
	}
	
	public void deletarCadastro(int id) {
		for (Cliente cliente : dadosClientes) {
            if (cliente.getId_Cliente() == id) {
                dadosClientes.remove(cliente);
            }
        }
	}
	
	public void gerarRelatorioDeDividas() {
		for(Cliente cliente : dadosClientes) {
			System.out.println(cliente.getDivida());
		}
	}
	
	@Override
	public String toString() {
		return "Cliente [Id Cliente= " + getId_Cliente()
				+ ", Nome= " + getNome()
				+ ", Telefone= " + getTelefone()
				+ ", Endereco= " + getEndereco()
				+ ", Status=" + getStatus()
				+ ", Divida= " + getDivida().getValorDivida()
				+ ", Data da ultima compra= " + getDataDaUltimaCompra()
				+ "]";
	}	
}