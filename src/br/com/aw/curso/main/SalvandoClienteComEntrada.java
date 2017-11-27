package br.com.aw.curso.main;

import java.io.IOException;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.aw.curso.modelo.Cliente;

public class SalvandoClienteComEntrada {

	public static void main(String[] args) throws IOException {

		// Inicializando uma unidade de persistência
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exempLoPU");

		// Criando Entity Manager via "fabrica(EntityManagerFactory)"
		EntityManager em = emf.createEntityManager();

		Scanner entrada = new Scanner(System.in);
		
		Cliente cliente1 = new Cliente();

		System.out.print("Digite o nome do cliente.: ");
		String nomeCliente = entrada.next();
		cliente1.setNome(nomeCliente);
		//System.out.println();
		
		System.out.print("Digite a idade do cliente.: ");
		Integer idadeCliente = entrada.nextInt();
		cliente1.setIdade(idadeCliente);
		//System.out.println();
		
		System.out.print("Digite o sexo do cliente.: ");
		String sexoCliente = entrada.next();
		cliente1.setSexo(sexoCliente);
		//System.out.println();
		
		System.out.print("Digite a profissão do cliente.: ");
		String profissaoCliente = entrada.next();
		cliente1.setProfissao(profissaoCliente);
		//System.out.println();
		
		System.out.println("Codigo......: " + cliente1.getCodigo());
		System.out.println("Nome......: " + cliente1.getNome());
		System.out.println("Idade.....: " + cliente1.getIdade());
		System.out.println("Sexo......: " + cliente1.getSexo());
		System.out.println("Profissão.: " + cliente1.getProfissao());
				
		System.in.read();
		
		em.getTransaction().begin(); // abrindo transação
		em.persist(cliente1); // persistindo objeto cliente
		em.getTransaction().commit(); // sincronizando dados definitivamente

		System.out.println("Cliente salvo com sucesso!!!");

		em.close();

	}

}
