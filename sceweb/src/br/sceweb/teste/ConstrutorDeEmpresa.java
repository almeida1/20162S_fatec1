package br.sceweb.teste;

import br.sceweb.modelo.Empresa;

public class ConstrutorDeEmpresa {

	
	//Atributos default
	public static final String CNPJ = "89424232000180";
	public static final String NOME = "Casas Bahia";
	public static final String NOME_FANTASIA = "Casas Bahia";
	public static final String ENDERECO = "Rua Aguia de Haia";
	public static final String TELEFONE = "12212121";
	private String cnpj = CNPJ;
	private String nomeDaEmpresa = NOME;
	private String nomeFantasia = NOME_FANTASIA;
	private String endereco = ENDERECO;
	private String telefone = TELEFONE;
	
	private ConstrutorDeEmpresa(){
	}
	
	public static ConstrutorDeEmpresa umaEmpresa(){
		return new ConstrutorDeEmpresa();
	}
	public ConstrutorDeEmpresa comCNPJ(String cnpj){
		this.cnpj = cnpj;
		return this;
	}
	public ConstrutorDeEmpresa comNome(String nome){
		this.nomeDaEmpresa = nome;
		return this;
	}
	public ConstrutorDeEmpresa comNomeFantasia(String nome){
		this.nomeFantasia = nome;
		return this;
	}
	public ConstrutorDeEmpresa comEndereco(String endereco){
		this.endereco = endereco;
		return this;
	}
	public ConstrutorDeEmpresa comTelefone(String telefone){
		this.telefone = telefone;
		return this;
	}
	public ConstrutorDeEmpresa comCNPJinvalido(){
		this.cnpj = "894242320001801";
		return this;
	}
	public ConstrutorDeEmpresa comCNPJnulo(){
		this.cnpj = null;
		return this;
	}
	public ConstrutorDeEmpresa mas(){
		return ConstrutorDeEmpresa
					.umaEmpresa()
					.comCNPJ(cnpj)
					.comNome(nomeDaEmpresa)
					.comNomeFantasia(nomeFantasia)
					.comEndereco(endereco)
					.comTelefone(telefone);
		
	}
	public Empresa build(){
		Empresa empresa = new Empresa();
		empresa.setCnpj(cnpj);
		empresa.setNomeDaEmpresa(nomeDaEmpresa);
		empresa.setNomeFantasia(nomeFantasia);
		empresa.setEndereco(endereco);
		empresa.setTelefone(telefone);
	return new Empresa();	
	}
}
