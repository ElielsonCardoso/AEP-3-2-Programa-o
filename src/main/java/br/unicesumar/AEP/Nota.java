package br.unicesumar.AEP;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Nota {
	@Id
	private String id = UUID.randomUUID().toString();
	
	@Min(value = 0)
	@Max(value = 10)
	private Double valor;
	
	@OneToOne
	private Conceito conceito;

	@JsonIgnore
	public Conceito getConceito() {
		return conceito;
	}	
	
	public Nota(Double valor) {
		if((valor > 10) || (valor < 0)){
			throw new RuntimeException("NOTA INVÁLIDA!");
		}else {
			this.valor = valor;
		}
	}
	
	public String getId() {
		return this.id;
	}	
	
	public Double getValor() {
		return this.valor;
	}

}
