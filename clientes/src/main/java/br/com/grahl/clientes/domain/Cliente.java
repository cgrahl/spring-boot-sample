package br.com.grahl.clientes.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

@Entity
@Table(name="clientes")
public class Cliente {
	
	@Id
	private String id;
	
	@Column(length=100, nullable=false)
	private String nome;
	
	@Column(length=200)
	private String endereco;
	
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public Date getDataAlteracao() {
		return dataAlteracao;
	}
	
}
