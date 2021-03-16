package com.spring.projetoFinal.servico;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.spring.projetoFinal.dto.CategoriaDto;
import com.spring.projetoFinal.repositorio.CategoriaRepositorio;


@Service
public class CategoriaServico {
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	

	public void incluir ( CategoriaDto categoria) {
		
		
			
			categoriaRepositorio.save(categoria);
	
	
		
	}
	
	    
}
