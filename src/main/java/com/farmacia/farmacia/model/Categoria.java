package com.farmacia.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo nome não pode estar em branco")
	@Size(min = 2, max = 100, message = "O atributo nome aceita o mínimo de 2 caracteres e máximo de 100 caracteres")
	private String nome;
	
	@NotBlank(message = "O atributo descrição é Obrigatório!")
	@Size (min = 5, max = 1000, message = "O atributo descrição aceita no minimo 5 caracteres e no máximo 1000 caracteres")
	private String descricao;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}