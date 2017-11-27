package br.com.aw.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.aw.curso.modelo.Cliente;

public class ConsultandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exempLoPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente1 = em.find(Cliente.class, 20L); // codigo = 1 long

		if(cliente1 != null) {
			System.out.println("Codigo......: " + cliente1.getCodigo());
			System.out.println("Nome......: " + cliente1.getNome());
			System.out.println("Idade.....: " + cliente1.getIdade());
			System.out.println("Sexo......: " + cliente1.getSexo());
			System.out.println("Profissão.: " + cliente1.getProfissao());
		}
		else {
			System.out.println("Cliente não encontrado!!!");
		}
	}
}
