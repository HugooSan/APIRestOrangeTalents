package com.fipe.desafio.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.fipe.desafio.entities.Veiculos;

public interface VeiculosRepository extends JpaRepository<Veiculos, Long>{
	Veiculos findByAnoModelo(String anoModelo);
}
