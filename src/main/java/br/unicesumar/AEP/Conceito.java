package br.unicesumar.AEP;

import java.util.UUID;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Conceito {
	@Id
	private String id = UUID.randomUUID().toString();
	@OneToOne(cascade=CascadeType.ALL)
	private Nota nota;
	@OneToOne(cascade=CascadeType.ALL)
	private Avaliacao avaliacao;
	@OneToMany(cascade=CascadeType.ALL)
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
}
