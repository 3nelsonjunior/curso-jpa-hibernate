package br.com.aw.curso.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.fabric.xmlrpc.Client;

import br.com.aw.curso.modelo.Cliente;

public class ConsultandoComJPQL {

	public static void main(String[] args) {
		 
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exempLoPU");
		EntityManager em = emf.createEntityManager();

		//utilizando JPQL
		// Lista de Cliente chamada Cliente..
		// recebendo resultado de uma query(JPQL) "select * from Cliente"
		List<Cliente> clientes = em.createQuery("from Cliente", Cliente.class).getResultList();
		
		for(Cliente cliente : clientes) {
			System.out.println("Codigo......: " + cliente.getCodigo());
			System.out.println("Nome......: " + cliente.getNome());
			System.out.println("Idade.....: " + cliente.getIdade());
			System.out.println("Sexo......: " + cliente.getSexo());
			System.out.println("Profissão.: " + cliente.getProfissao());
			System.out.println();
		}
		
		

	}

}
