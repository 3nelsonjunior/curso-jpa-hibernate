package br.com.aw.curso.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.aw.curso.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {
		
		// Inicializando uma unidade de persistência
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exempLoPU");
		
		// Criando Entity Manager via "fabrica(EntityManagerFactory)"
		EntityManager em = emf.createEntityManager();
		
		
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Alex Muralha");
		cliente1.setIdade(25);
		cliente1.setProfissao("Goleiro");
		cliente1.setSexo("M");
		
		em.getTransaction().begin(); //abrindo transação
		em.persist(cliente1); //persistindo objeto cliente
		em.getTransaction().commit(); // sincronizando dados definitivamente
		
		System.out.println("Cliente salvo com sucesso!!!");
		//em.close();
	}

}
