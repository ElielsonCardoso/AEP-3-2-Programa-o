package br.unicesumar.AEP;

import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Conceito {
	@Id
	private String id = UUID.randomUUID().toString();
	private String nome;
	
	@OneToOne(mappedBy = "conceitos")
	private Nota nota;
	
	@NotNull
	@OneToOne(mappedBy = "conceitos")
	private Avaliacao avaliacao;
	
	@NotNull
	@OneToOne(mappedBy = "conceitos")
	private Aluno aluno;	
	
	public Conceito(Nota nota, Avaliacao avaliacao, Aluno aluno) {
		if(aluno != null) {
			this.aluno = aluno;
		}else {
			throw new RuntimeException("OBRIGATÓRIO PREENCHER O ALUNO!");
		}
		
		if(avaliacao != null) {
			this.avaliacao = avaliacao;
		}else {
			throw new RuntimeException("OBRIGATÓRIO PREENCHER A AVALIAÇÃO!");			
		}
		
		this.nota = nota;				
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Nota getNota() {
		return this.nota;
	}
	
	public Aluno getAluno() {
		return this.aluno;
	}
	
	public Avaliacao getAvaliacao() {
		return this.avaliacao;
	}
}
