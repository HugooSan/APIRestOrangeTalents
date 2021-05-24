package com.fipe.desafio.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class VeiculosDto {

	
	
	@JsonProperty("Marca")
	private String marca;
	@JsonProperty("Modelo")
	private String modelo;
	@JsonProperty("AnoModelo")
	private String anoModelo;
	@JsonProperty("Valor")
	private String valor;
	
	
	
	
	public VeiculosDto(String marca, String modelo, String anoModelo, String valor) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.valor = valor;
	}
	
	

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAnoModelo() {
		return anoModelo;
	}


	public String getValor() {
		return valor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}



	public VeiculosDto() {
		
	}





}
