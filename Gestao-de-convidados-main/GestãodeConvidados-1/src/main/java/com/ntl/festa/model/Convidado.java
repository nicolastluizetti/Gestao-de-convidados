package com.ntl.festa.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Convidado implements Serializable{
		public static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue
		public long id;
		
	
		public String nome;
		
	
		public Integer quantidadeAcompanhantes;


		public Convidado(String nome, Integer quantidadeAcompanhantes) {
			this.nome = nome;
			this.quantidadeAcompanhantes = quantidadeAcompanhantes;
		}
		public Convidado() {

		}

		public long getId() {
			return id;
		}


		public void setId(long id) {
			this.id = id;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public Integer getQuantidadeAcompanhantes() {
			return quantidadeAcompanhantes;
		}


		public void setQuantidadeAcompanhantes(Integer quantidadeAcompanhantes) {
			this.quantidadeAcompanhantes = quantidadeAcompanhantes;
		}


		@Override
		public int hashCode() {
			return Objects.hash(id, nome, quantidadeAcompanhantes);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Convidado other = (Convidado) obj;
			return id == other.id && Objects.equals(nome, other.nome)
					&& Objects.equals(quantidadeAcompanhantes, other.quantidadeAcompanhantes);
		}


		@Override
		public String toString() {
			return "Convidado [id=" + id + ", nome=" + nome + ", quantidadeAcompanhantes=" + quantidadeAcompanhantes
					+ "]";
		}
		
		
		
}
