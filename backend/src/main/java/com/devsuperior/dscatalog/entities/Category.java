package com.devsuperior.dscatalog.entities;

import java.io.Serializable;
import java.util.Objects;

public class Category implements Serializable{
	
	//conversão do objeto em bytes (colocado por conta de ser uma boa medida)
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	//construido por padrão
	public Category() {		
	}

	public Category(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//metodo padrão mais rápido, só que menos preciso nas comparações. 
	//Usado para grande quantidade de dados.
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	//metodo padrão mais lento, só que mais preciso nas comparações.
	//Usado para menor quantidade de dados
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
