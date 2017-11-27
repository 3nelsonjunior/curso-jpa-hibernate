package br.com.aw.curso.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //informando que a classe é uma entidade(ou seja terá dados persistidos na tabela)
public class Cliente {
	
	@Id //identificador da tabela
	@GeneratedValue(strategy=GenerationType.IDENTITY) // dado gerado automaticamente pelo BD
	private Long codigo;
	
	private String nome;
	private Integer idade;
	private String sexo;
	private String profissao;
	
	
	
	//get's and set's
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	

}
