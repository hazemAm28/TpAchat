package com.esprit.examen.dto;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import com.esprit.examen.entities.Facture;

@Getter
@Setter
public class DtoReglement {
	
	private Long idReglement;
	private float montantPaye;
	private float montantRestant;
	private Boolean payee;
	private Date dateReglement;
	private Facture facture;
	public DtoReglement(float montantPaye, float montantRestant, Boolean payee, Date dateReglement) {
		super();
		this.montantPaye = montantPaye;
		this.montantRestant = montantRestant;
		this.payee = payee;
		this.dateReglement = dateReglement;
	}
	
	

}
