package br.unicesumar.AEP;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nota {
	@Id
	private String id = UUID.randomUUID().toString();
	private Double valor;
	
	public Nota(Double valor) {
		if((valor > 10) || (valor < 0)){
			throw new RuntimeException("NOTA INVÁLIDA!");
		}else {
			this.valor = valor;
		}
	}
	
	public Double getValor() {
		return this.valor;
	}
}
