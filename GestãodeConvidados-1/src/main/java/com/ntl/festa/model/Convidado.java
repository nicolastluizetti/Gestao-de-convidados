package com.ntl.festa.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Convidado implements Serializable{

		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue
		public long id;
		
		public String nome;
		
		public Integer quantidadeAcompanhantes;

		public Convidado(long id, String nome, Integer quantidadeAcompanhantes) {
			this.nome = nome;
			this.quantidadeAcompanhantes = quantidadeAcompanhantes;
		}

		public Convidado() {
			
		}	
		
		public long getId() {
			return id;
		}
		
		
		
		public void setNome(String nome) {
			this.nome = nome;
			
		}
		
		public String getNome() {
			return this.nome;
		}
		
		public void setAcompanhantes(int acompanhantes) {
			this.quantidadeAcompanhantes = acompanhantes;
			
		}
		
		public int getAcompanhantes() {
			return this.quantidadeAcompanhantes;
		}
		
		
		

		
}
