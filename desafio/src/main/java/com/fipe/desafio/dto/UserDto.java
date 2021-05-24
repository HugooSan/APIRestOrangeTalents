package com.fipe.desafio.dto;

import com.fipe.desafio.entities.User;

public class UserDto {


	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;
	private Long veiculoId;


	public UserDto(String nome, String email, String cpf, String dataNascimento, Long veiculoId) {

		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.veiculoId = veiculoId;

	}



	public UserDto(User user) {
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getdataNascimento() {
		return dataNascimento;
	}



	public void setdataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	public Long getVeiculoId() {
		return veiculoId;
	}



	public void setVeiculoId(Long veiculoId) {
		this.veiculoId = veiculoId;
	}



	
	

}
