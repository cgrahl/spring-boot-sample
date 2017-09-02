package br.com.grahl.pedidos.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="pedidos")
public class Pedido {
	
	@Id
	private String id;
	
	@Column(name="idcliente")
	private String idCliente;
	
	private double valor;
	
	@CreatedDate 
	@Column(columnDefinition="TIMESTAMP")
	private Date dataCriacao;
	
	@LastModifiedDate
	@Column(columnDefinition="TIMESTAMP")
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
