package br.com.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class autor {
	
	@Id
	@Column(name = "idautor")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAutor;
}
