package com.fipe.desafio.dto;





import org.springframework.beans.factory.annotation.Autowired;
import com.fipe.desafio.entities.User;
import com.fipe.desafio.repository.VeiculosRepository;

public class ResponseUserDto {
	
	@Autowired
	VeiculosRepository veiculosRepository;
	
	private String nome;
	private String email;
	private String cpf;
	private String dataNascimento;

	
	public ResponseUserDto(User user) {
		this.nome = user.getNome();
		this.email = user.getEmail();
		this.cpf = user.getCpf();
		this.dataNascimento = user.getdataNascimento();
	}

	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}


	public String getCpf() {
		return cpf;
	}


	public String getdataNascimento() {
		return dataNascimento;
	}



	
}
