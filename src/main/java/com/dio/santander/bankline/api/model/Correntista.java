package com.dio.santander.bankline.api.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tabela_correntista")
public class Correntista {

	//Chave primária será o id
	@Id
	//Chave primária será gerenciada pelo JPA - não criada manualmente
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	//Coluna cpf tem o tamanho 20, ou seja, o cpf pode ter até 20 caracteres
	@Column(length = 20)
	private String cpf;
	
	//Coluna nome tem o tamanho 100, ou seja, o nome pode ter até 100 caracteres
	@Column(length = 100)
	private String nome;
	
	//Algumas informações que fazem parte da classe Conta serão armazenadas na tabela principal (Correntista)
	@Embedded
	private Conta conta;
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
