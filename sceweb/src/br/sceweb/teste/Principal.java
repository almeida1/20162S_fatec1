package br.sceweb.teste;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.Empresa;

public class Principal {

	public static void main(String[] args) {
		Empresa empresa = TesteDeEmpresa.default_().constroi();
		System.out.println(empresa.getCnpj());
		Convenio convenio = TesteDeConvenio.convenio1().constroi();
		System.out.println(convenio.getCNPJ());

	}

}
