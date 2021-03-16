package com.spring.projetoFinal.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data

@Entity
@Table(name = "categoria")

public class CategoriaDto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private Long id;
	
	@NotBlank
	private String nome;
	
	
	
	@NotBlank
	@Size(min = 5, max = 5)
	@Pattern(regexp = "[A-Z a-z]{3}[0-9]{2}")
	private String codigo;
	
	

}
