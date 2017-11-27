package br.com.aw.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.aw.curso.modelo.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {
		// Inicializando uma unidade de persistência
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exempLoPU");

		// Criando Entity Manager via "fabrica(EntityManagerFactory)"
		EntityManager em = emf.createEntityManager();

		Cliente cliente1 = em.find(Cliente.class, 20L);

		em.getTransaction().begin(); // abrindo transação
		cliente1.setProfissao("Analista de Sistemas Jr.");
		em.getTransaction().commit(); // sincronizando dados definitivamente
		System.out.println("Atualizado com sucesso!!!");

	}

}
