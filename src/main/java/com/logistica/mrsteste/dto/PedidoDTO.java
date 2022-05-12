package com.logistica.mrsteste.dto;


import com.logistica.mrsteste.entities.Pedido;

public class PedidoDTO {
	
	private String codigo;
	
	private String data;
	
	private String codigoCliente;
	
	private String produto;
	
	private String variedade;
	
	private String pais;
	
	private String categoria;
	
	private String safra;
	
	private String preco;
	
	public PedidoDTO() {
		
	}

	public PedidoDTO(String codigo, String data, String codigoCliente, String produto, String variedade, String pais, String categoria,
			String safra, String preco) {
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
	
	public PedidoDTO(Pedido pedido) {
		codigo = pedido.getCodigo();
		data = pedido.getData();
		codigoCliente = pedido.getCodigoCliente();
		produto = pedido.getProduto();
		variedade = pedido.getVariedade();
		pais = pedido.getPais();
		categoria = pedido.getCategoria();
		safra = pedido.getSafra();
		preco = pedido.getPreco();
		
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
