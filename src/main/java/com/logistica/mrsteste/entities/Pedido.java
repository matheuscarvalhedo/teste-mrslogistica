package com.logistica.mrsteste.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_pedido")
public class Pedido implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private  String codigo;
	
	@Column(name = "data_pedido")
	private String data;
	
	@Column(name = "cliente")
	private String codigoCliente;
	
	@Column(name = "produto")
	private String produto;
	
	@Column(name = "variedade")
	private String variedade;
	
	@Column(name = "pais")
	private String pais;
	
	@Column(name = "categoria")
	private String categoria;
	
	@Column(name = "safra")
	private String safra;
	
	@Column(name = "preco")
	private String preco;
	
	public Pedido() {
		
	}
	
	public Pedido(String codigo, String data, String codigoCliente, String produto, String variedade, String pais,
			String categoria, String safra, String preco) {
		super();
		this.codigo = codigo;
		this.data = data;
		this.codigoCliente = codigoCliente;
		this.produto = produto;
		this.variedade = variedade;
		this.pais = pais;
		this.categoria = categoria;
		this.safra = safra;
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getVariedade() {
		return variedade;
	}

	public void setVariedade(String variedade) {
		this.variedade = variedade;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getSafra() {
		return safra;
	}

	public void setSafra(String safra) {
		this.safra = safra;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}
	
}
