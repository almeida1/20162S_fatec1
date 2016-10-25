package br.sceweb.teste;

public class TesteDeConvenio {
	
	
	public static ConstrutorDeConvenio convenio1(){
		return ConstrutorDeConvenio
				.umConvenio()
				.comCNPJ("89424232000180")
				.comDataInicio("03/05/2016")
				.comDataTermino("20/05/2016");
	}
	
	public static ConstrutorDeConvenio convenio2(){
		return ConstrutorDeConvenio.umConvenio()
				.comCNPJ("95117044000102")
				.comDataInicio("03/05/2016")
				.comDataTermino("20/05/2016");
	}
	
	
	public static ConstrutorDeConvenio prorrogacao1DoConvenio1(){
		return ConstrutorDeConvenio
				.umConvenio()
				.comCNPJ("89424232000180")
				.comDataInicio("21/05/2016")
				.comDataTermino("04/06/2016");
	}
	public static ConstrutorDeConvenio prorrogacao2DoConvenio1(){
		return ConstrutorDeConvenio
				.umConvenio()
				.comCNPJ("89424232000180")
				.comDataInicio("05/06/2016")
				.comDataTermino("30/06/2016");
	}
	public static ConstrutorDeConvenio para_dti_dtf_vigente(){
		return ConstrutorDeConvenio
				.umConvenio()
				.comCNPJ("89424232000180")
				.comDataInicio("04/05/2016")
				.comDataTermino("19/05/2016");
	}
	
}
