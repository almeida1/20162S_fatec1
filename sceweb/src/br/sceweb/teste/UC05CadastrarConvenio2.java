package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.ConvenioDAO;
import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC05CadastrarConvenio2 {
	static EmpresaDAO empresaDAO;
	static Empresa empresa;
	static ConvenioDAO convenioDAO;
	static Convenio convenio;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = TesteDeEmpresa.default_().constroi();//cnpj 89424232000180
		empresaDAO.adiciona(empresa);
		convenioDAO = new ConvenioDAO();
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		convenioDAO.exclui("89424232000180");
		convenioDAO.exclui("95117044000102");
		empresaDAO.exclui("89424232000180");
		empresaDAO.exclui("95117044000102");
	}

	@Test
	public void CT01UC05FB_cadastra_convenio_com_sucesso() {
		convenio = TesteDeConvenio.convenio1().constroi();
		convenioDAO.adiciona(convenio);// cnpj 89424232000180
	}
	@Test
	public void CT02UC05A1Cadastrar_convenio_ja_cadastrado(){
		convenio = TesteDeConvenio.para_dti_dtf_vigente().constroi();
		assertTrue (convenioDAO.verificaVigencia(convenio));
	}
}
