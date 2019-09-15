package br.unicesumar.AEP;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
	@Id
	private String id = UUID.randomUUID().toString();
	private String nome;

	public String getNome() {
		return nome;
	}

	public Aluno(String nome) {
		this.nome = nome;
	}
	
}
