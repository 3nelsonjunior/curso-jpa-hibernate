package br.com.aw.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.aw.curso.modelo.Cliente;

public class RemovendoPrimeiroObjeto {

	public static void main(String[] args) {

		// Inicializando uma unidade de persistência
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exempLoPU");

		// Criando Entity Manager via "fabrica(EntityManagerFactory)"
		EntityManager em = emf.createEntityManager();

		Cliente cliente1 = em.find(Cliente.class, 12L);
		
		em.getTransaction().begin(); //abrindo transação
		em.remove(cliente1); //persistindo objeto cliente
		em.getTransaction().commit(); // sincronizando dados definitivamente
		System.out.println("Deletado com sucesso!!!");
	}

}
