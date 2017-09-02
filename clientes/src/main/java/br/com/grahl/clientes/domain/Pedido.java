package br.com.grahl.clientes.domain;

import java.util.Date;

public class Pedido {
	
	private String id;
	
	private String idCliente;
	
	private double valor;
	
	private Date dataCriacao;
	
	private Date dataAlteracao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}

}
