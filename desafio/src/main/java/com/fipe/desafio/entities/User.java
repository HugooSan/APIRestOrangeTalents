package com.fipe.desafio.entities;




import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;




@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull@NotEmpty
	private String nome;
	@NotNull@NotEmpty
	@Length(min = 5)@Column(unique = true)
	private String email;
	@NotNull@NotEmpty
	@Length(min = 11)@Column(unique = true)
	private String cpf;
	@NotNull@NotEmpty
	private String dataNascimento;
	@OneToMany(mappedBy= "user")
	@JsonManagedReference
	private Set<Veiculos> cadVeiculos;

	public User() {

	}

	public User(Long id, String nome, String email, String cpf, String dataNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;

	}
	
	//Getters e Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Set<Veiculos> getCadVeiculos() {
		return cadVeiculos;
	}

	public void setCadVeiculos(Set<Veiculos> cadVeiculos) {
		this.cadVeiculos = cadVeiculos;
	}

}
