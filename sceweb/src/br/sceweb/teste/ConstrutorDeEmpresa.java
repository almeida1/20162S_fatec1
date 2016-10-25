package br.sceweb.teste;

import br.sceweb.modelo.Empresa;
/*
 * Test data builder - usa o design pattern builder na criacao de objetos de teste unitario
 */
public class ConstrutorDeEmpresa {

	
	private String cnpj ;
	private String nomeDaEmpresa;
	private String nomeFantasia;
	private String endereco;
	private String telefone;

	private ConstrutorDeEmpresa() {
	}

	public static ConstrutorDeEmpresa umaEmpresa() {
		return new ConstrutorDeEmpresa();
	}

	public ConstrutorDeEmpresa comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public ConstrutorDeEmpresa comNome(String nome) {
		this.nomeDaEmpresa = nome;
		return this;
	}

	public ConstrutorDeEmpresa comNomeFantasia(String nome) {
		this.nomeFantasia = nome;
		return this;
	}

	public ConstrutorDeEmpresa comEndereco(String endereco) {
		this.endereco = endereco;
		return this;
	}

	public ConstrutorDeEmpresa comTelefone(String telefone) {
		this.telefone = telefone;
		return this;
	}

	public ConstrutorDeEmpresa comCNPJinvalido() {
		this.cnpj = "894242320001801";
		return this;
	}

	public ConstrutorDeEmpresa comCNPJnulo() {
		this.cnpj = null;
		return this;
	}

	public ConstrutorDeEmpresa mas() {
		return ConstrutorDeEmpresa.umaEmpresa()
				.comCNPJ(cnpj)
				.comNome(nomeDaEmpresa)
				.comNomeFantasia(nomeFantasia)
				.comEndereco(endereco)
				.comTelefone(telefone);
	}

	public Empresa constroi() {
		Empresa empresa = new Empresa();
		empresa.setCnpj(cnpj);
		empresa.setNomeDaEmpresa(nomeDaEmpresa);
		empresa.setNomeFantasia(nomeFantasia);
		empresa.setEndereco(endereco);
		empresa.setTelefone(telefone);
		return empresa;
	}
}
