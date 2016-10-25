package br.sceweb.teste;

public final class TesteDeEmpresa {
	
	public static ConstrutorDeEmpresa default_(){
		return ConstrutorDeEmpresa
				.umaEmpresa()
				.comCNPJ("89424232000180")
				.comNome("Secretaria de Saude")
				.comNomeFantasia("Secretaria de Saude")
				.comEndereco("Dr. Arnaldo, 351, São Paulo - SP, 01246-000")
				.comTelefone("1111111");
	}
	public static ConstrutorDeEmpresa comSQLException_data_trucation(){
		return ConstrutorDeEmpresa
				.umaEmpresa()
				.comCNPJ("95117044000102")
				.comNome("UBS")
				.comNomeFantasia("UBS-ZL")
				.comEndereco("Av. Aguia de Haia, 351, São Paulo - SP, 01246-000")
				.comTelefone("22222");
	}
	public static ConstrutorDeEmpresa comCnpjInvalido(){
		return ConstrutorDeEmpresa.umaEmpresa().mas().comCNPJinvalido();
	}

}
