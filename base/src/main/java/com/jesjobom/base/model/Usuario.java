package com.jesjobom.base.model;

/**
 * Usuários do sistema
 *
 * @author Jairton Junior
 */
public class Usuario {
	
	private Integer id;
	
	private String nome;
	
	private String observacao;
	
	private boolean ativo;

	public Usuario() {
	}

	public Usuario(Integer id, String nome, String observacao, boolean ativo) {
		this.id = id;
		this.nome = nome;
		this.observacao = observacao;
		this.ativo = ativo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
