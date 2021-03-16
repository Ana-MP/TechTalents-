package com.spring.projetoFinal.controller;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.projetoFinal.dto.CategoriaDto;
import com.spring.projetoFinal.servico.CategoriaServico;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	private CategoriaServico categoriaServico;
	
	@PostMapping(consumes="application/json", produces = "application/json")
	public CategoriaDto incluir( @NotNull @Valid @RequestBody CategoriaDto categoria) {
		
		
		categoriaServico.incluir(categoria);
		
		return categoria;
		
		
	}

}
