package com.fipe.desafio.dto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import com.fipe.desafio.entities.Veiculos;

public class ResponseVeiculosDto {

	private String marca;
	private String modelo;
	private String anoModelo;
	private String valor;
	private String diaRodizio;
	private boolean rodizioAtivo;

	public ResponseVeiculosDto(Veiculos veiculo) {

		this.marca = veiculo.getMarca();
		this.modelo = veiculo.getModelo();
		this.anoModelo = veiculo.getAnoModelo();
		this.valor = veiculo.getValor();
		this.diaRodizio = diaDoRodizio();
		this.rodizioAtivo = rodizioAtivo();

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
	public String diaDeHoje() {
		DateFormat dateFormat = new SimpleDateFormat("EEEE");
        Calendar cal = Calendar.getInstance();
        Date date = cal.getTime();
        String todaysdate = dateFormat.format(date);
         return todaysdate;
	}
	
	public String diaDoRodizio() {
		String ano = anoModelo.substring(anoModelo.length()-1);
		String rodizio = "";
		if(ano.endsWith("0") || ano.endsWith("1")) {
			rodizio = "segunda-feira";
		}else if(ano.endsWith("2") || ano.endsWith("3")){
			rodizio = "terça-feira";
		}else if(ano.endsWith("4") || ano.endsWith("5")){
			rodizio = "quarta-feira";
		}else if(ano.endsWith("6") || ano.endsWith("7")){
			rodizio = "quinta-feira";
		}else if(ano.endsWith("8") || ano.endsWith("9")){
			rodizio = "sexta-feira";
		}else {
			rodizio = "Não é";
		}
		
		return rodizio;
		
	}
	public boolean rodizioAtivo() {
		return diaDeHoje().equals(diaDoRodizio());
	}

	public String getDiaRodizio() {
		return diaRodizio;
	}

	public boolean isRodizioAtivo() {
		return rodizioAtivo;
	}
	

}
