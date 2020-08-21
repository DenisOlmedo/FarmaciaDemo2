package com.projeto.model;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Compra implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String produto;
	private java.lang.String principioAtivo;
	private int quantidade;
	private int quantidadeTotal = 0;

	private java.lang.String aprovado = "True";

	private java.lang.String mensagem;

	public Compra() {
	}

	public java.lang.String getProduto() {
		return this.produto;
	}

	public void setProduto(java.lang.String produto) {
		this.produto = produto;
	}

	public java.lang.String getPrincipioAtivo() {
		return this.principioAtivo;
	}

	public void setPrincipioAtivo(java.lang.String principioAtivo) {
		this.principioAtivo = principioAtivo;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getQuantidadeTotal() {
		return quantidadeTotal;
	}

	public void setQuantidadeTotal(int quantidadeTotal) {
		this.quantidadeTotal = quantidadeTotal;
	}

	public java.lang.String getAprovado() {
		return this.aprovado;
	}

	public void setAprovado(java.lang.String aprovado) {
		this.aprovado = aprovado;
	}

	public java.lang.String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(java.lang.String mensagem) {
		this.mensagem = mensagem;
	}

	public Compra(java.lang.String produto, java.lang.String principioAtivo,
			int quantidade, int quantidadeTotal, java.lang.String aprovado,
			java.lang.String mensagem) {
		this.produto = produto;
		this.principioAtivo = principioAtivo;
		this.quantidade = quantidade;
		this.quantidadeTotal = quantidadeTotal + this.quantidade;
		this.aprovado = aprovado;
		this.mensagem = mensagem;
	}

}