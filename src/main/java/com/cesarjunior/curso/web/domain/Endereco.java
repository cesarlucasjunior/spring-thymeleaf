package com.cesarjunior.curso.web.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Endereco extends AbstractEntity<Long>{
	
	@Column(nullable = false)
	private String logradouro;
	
	@Column(nullable = false)
	private String bairro;
	
	@Column(nullable = false)
	private String cidade;
	
	@Column(nullable = false, length = 9)
	private String cep;
	
	@Column(nullable = false, length = 5)
	private String numero;
	
	private String complemento;
	
	//@Column(nullable = false, length = 2)
	//@Enumerated(EnumType.STRING) -> Anotação que informa a JPA o tipo de dados que queremos salvar.
	//private UF uf;
	
	// Gerar métodos getters e setters.
	

}
