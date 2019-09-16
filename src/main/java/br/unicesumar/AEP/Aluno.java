package br.unicesumar.AEP;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Aluno {
	@Id
	private String id = UUID.randomUUID().toString();
	private String nome;

	@OneToOne
	private Conceito conceito;

	@JsonIgnore
	public Conceito getConceito() {
		return conceito;
	}	
	
	public String getId() {
		return this.id;
	}
	
	public String getNome() {
		return nome;
	}

	public Aluno(String nome) {
		this.nome = nome;
	}
	
}
