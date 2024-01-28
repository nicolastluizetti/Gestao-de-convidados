package com.ntl.festa.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Convidados implements Serializable{

		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue
		private long id;
		
		private String nome;
		
		private Integer quantidadeAcompanhantes;

		
}
