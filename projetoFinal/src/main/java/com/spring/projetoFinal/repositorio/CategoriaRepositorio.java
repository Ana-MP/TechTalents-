package com.spring.projetoFinal.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.spring.projetoFinal.dto.CategoriaDto;

public interface CategoriaRepositorio extends CrudRepository<CategoriaDto, Long> {
	
	
}


