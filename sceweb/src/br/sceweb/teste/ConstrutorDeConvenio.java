package br.sceweb.teste;

import br.sceweb.modelo.Convenio;
/*
 * Test data builder - usa o design pattern builder na criacao de objetos de teste unitario
 */
public class ConstrutorDeConvenio {
		
		private String cnpj ;
		private String dataInicio ;
		private String dataTermino ;

		
		public static ConstrutorDeConvenio umConvenio() {
			return new ConstrutorDeConvenio();
		}

		public ConstrutorDeConvenio comCNPJ(String cnpj) {
			this.cnpj = cnpj;
			return this;
		}
		public ConstrutorDeConvenio comDataInicio(String data) {
			this.dataInicio = data;
			return this;
		}
		public ConstrutorDeConvenio comDataTermino(String data) {
			this.dataTermino = data;
			return this;
		}
		public ConstrutorDeConvenio mas(){
			return ConstrutorDeConvenio.umConvenio()
					.comCNPJ(cnpj)
					.comDataInicio(dataInicio)
					.comDataTermino(dataTermino);
		}
		public Convenio constroi() {
	        return new Convenio(cnpj, dataInicio, dataTermino);
	    }
}
