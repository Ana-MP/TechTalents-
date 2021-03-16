package com.spring.projetoFinal.controller;

import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.projetoFinal.dto.ProdutoDto;
import com.spring.projetoFinal.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	@Autowired
	private ProdutoRepositorio produtoRepositorio;

	@PostMapping(consumes = "application/json", produces = "application/json")
	public ProdutoDto incluir(@NotNull @Valid @RequestBody ProdutoDto produto) {

		produtoRepositorio.save(produto);

		return produto;

	}

	@DeleteMapping("{id}")
	void remove(@PathVariable Long id) {
		produtoRepositorio.deleteById(id);
	}

	@GetMapping("{id}")
	public Optional<ProdutoDto> recuperarPorId(@PathVariable Long id) {

		return produtoRepositorio.findById(id);

	}

	@GetMapping(produces = "application/json")
	public Iterable<ProdutoDto> listar(@RequestParam(value = "limit", required = false) Long limit,
			@RequestParam(value = "orderby", required = false) String orderby) {
		System.out.println(limit);
		System.out.println(orderby);
		return produtoRepositorio.findAll();
	}

	@PutMapping("{id}")
	public ProdutoDto editar(@RequestBody ProdutoDto produto, @PathVariable Long id) {

		produto.setId(id);
		return produtoRepositorio.save(produto);

	}
}
