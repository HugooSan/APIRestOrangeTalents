package com.fipe.desafio.controller;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fipe.desafio.dto.ResponseUserDto;
import com.fipe.desafio.entities.User;
import com.fipe.desafio.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;


	@GetMapping
	public List<User> lista() {
		List<User> user = userRepository.findAll();
		return user;

	}
	@GetMapping("/{id}")
	public User detalhar(@PathVariable Long id) {
		return userRepository.getOne(id);
	}

	@PostMapping("/cadastro")
	public ResponseEntity<ResponseUserDto> cadastrar(@RequestBody @Valid User cadastro) throws Exception {
		if(cadastro == null) {
		return new ResponseEntity<ResponseUserDto>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<ResponseUserDto>(new ResponseUserDto(userRepository.save(cadastro)), HttpStatus.CREATED);

	}
	
}
