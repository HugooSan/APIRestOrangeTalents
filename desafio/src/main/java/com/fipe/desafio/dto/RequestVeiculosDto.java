package com.fipe.desafio.dto;





public class RequestVeiculosDto {


	
	private String marca;
	private String modelo;
	private String anoModelo;
	private Long userId;
	

	
	public RequestVeiculosDto(String marca, String modelo, String anoModelo, String valor, Long userId) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anoModelo = anoModelo;
		this.userId = userId;
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


	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public Long getUserId() {
		return userId;
	}

	public RequestVeiculosDto() {
		
	}

	
	
	



}
