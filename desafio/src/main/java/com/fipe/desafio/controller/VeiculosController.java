package com.fipe.desafio.controller;

import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fipe.desafio.dto.RequestVeiculosDto;
import com.fipe.desafio.dto.ResponseVeiculosDto;
import com.fipe.desafio.dto.VeiculosDto;
import com.fipe.desafio.entities.User;
import com.fipe.desafio.entities.Veiculos;
import com.fipe.desafio.repository.UserRepository;
import com.fipe.desafio.repository.VeiculosRepository;




@RestController
@RequestMapping("/veiculos")
public class VeiculosController {
	@Autowired
	private VeiculosRepository veiculosRepository;
	
	@Autowired
	private UserRepository userRepository;

	@GetMapping
	public List<ResponseVeiculosDto> listaveiculos() {
		List<ResponseVeiculosDto> response = new ArrayList<ResponseVeiculosDto>();
		this.veiculosRepository.findAll().forEach(veiculos ->{
			response.add(new ResponseVeiculosDto(veiculos));
		});
		return response;
		
	}
	
		
	@PostMapping("/cadastro")
	public ResponseEntity<ResponseVeiculosDto> cadastrarVeiculo(@RequestBody @Valid RequestVeiculosDto cadastro) {
		VeiculosDto veiculosDto = this.getVeiculos(cadastro.getMarca(), cadastro.getModelo(), cadastro.getAnoModelo());
		User user = getUserId(cadastro.getUserId());
		Veiculos veiculos = new Veiculos(veiculosDto.getMarca(), veiculosDto.getModelo(), veiculosDto.getAnoModelo(), veiculosDto.getValor(), user);
		return new ResponseEntity<ResponseVeiculosDto>(new ResponseVeiculosDto(veiculosRepository.save(veiculos)), HttpStatus.CREATED);
	}
	
	private VeiculosDto getVeiculos(String marca, String modelo, String anoModelo) {

	     final String uri = "https://parallelum.com.br/fipe/api/v1/carros/marcas/" + marca + "/modelos/ " + modelo + " /anos/" + anoModelo;
	     RestTemplate restTemplate = new RestTemplate();
	     VeiculosDto result = restTemplate.getForObject(uri, VeiculosDto.class);     
	     
	     return result; 
	     

	}
	
	public User getUserId(Long userId) {
		User userDto = userRepository.getOne(userId);
		return userDto;
	}
		

}

