package entities;

import java.util.GregorianCalendar;
import enums.StatusDivida;

public class Divida {
	private double valorDivida;
	private GregorianCalendar vencimentoDaParcela;
	private StatusDivida statusDivida;
	
	//Constructs
	public Divida(double valorDivida, GregorianCalendar vencimentoDaParcela, StatusDivida statusDivida) {
		this.valorDivida = valorDivida;
		this.vencimentoDaParcela = vencimentoDaParcela;
		this.statusDivida = statusDivida;
	}
	
	//Gets and sets
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public GregorianCalendar getVencimentoDaParcela() {
		return vencimentoDaParcela;
	}
	public void setVencimentoDaParcela(GregorianCalendar vencimentoDaParcela) {
		this.vencimentoDaParcela = vencimentoDaParcela;
	}
	public StatusDivida getStatusDivida() {
		return statusDivida;
	}
	public void setStatusDivida(StatusDivida statusDivida) {
		this.statusDivida = statusDivida;
	}
		
	@Override
	public String toString() {
		return "Divida [valor= " + getValorDivida()
				+ ", Vencimento da parcela= " + getVencimentoDaParcela()
				+ ", Situação da divida= " + getStatusDivida() + "]";
	}
}