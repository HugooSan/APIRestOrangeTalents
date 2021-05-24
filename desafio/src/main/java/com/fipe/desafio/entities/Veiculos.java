package com.fipe.desafio.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"dataNascimento"})
@Entity
public class Veiculos {


	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modelo;
	private String anoModelo;
	private String valor;
	@ManyToOne
    @JoinColumn(name = "user_id")
	@JsonBackReference
	private User user;
	



	public Veiculos(String marca, String modelo, String anoModelo, String valor, User user) {
		super();
	
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.user = user;
		
		}
	
	


	public Long getId() {
		return id;
	}

	public Veiculos() {
		
	}

	public void setId(Long id) {
		this.id = id;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getAnoModelo() {
		return anoModelo;
	}


	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}




	public String getValor() {
		return valor;
	}




	public void setValor(String valor) {
		this.valor = valor;
	}




	public User getUser() {
		return user;
	}




	public void setUser(User user) {
		this.user = user;
	}

	
	
}

