package com.spring.projetoFinal.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.spring.projetoFinal.dto.ProdutoDto;

public interface ProdutoRepositorio extends CrudRepository<ProdutoDto, Long> {
	

}
