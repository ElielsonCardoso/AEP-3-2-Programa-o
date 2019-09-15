package br.unicesumar.AEP;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Avaliacao {
	@Id
	private String id = UUID.randomUUID().toString();
}
