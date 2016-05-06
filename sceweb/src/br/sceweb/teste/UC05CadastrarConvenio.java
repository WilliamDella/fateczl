package br.sceweb.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Convenio;
import br.sceweb.modelo.ConvenioDAO;

public class UC05CadastrarConvenio {

	public static String dataInicio;
	public static Convenio convenio;
	public static ConvenioDAO convenioDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		dataInicio = "28/04/2015";
		convenio = new Convenio();
		convenioDAO = new ConvenioDAO();
	}
	
//	@Test
//	public void UC05FBT01Cadastrar_convenio_com_sucesso() {
//		convenio.setDataInicio(dataInicio);
//		assertTrue(dataInicio.equals(convenio.getDataInicio()));
//	}
	
//	@Test(expected=IllegalArgumentException.class)
//	public void CT06UC05A3CadastrarConvenio_cnpj_invalido() {
//		cnpj = "11111";
//		convenio.setCnpj(cnpj);
//	}

//	@Test
//	public void CT03UC05A2Cadastrar_convenio_data_invalida() {
//		assertFalse(convenio.validaData("42/05/2016"));
//	}
	
	@Test
	public void test() {
		assertEquals(1, convenioDAO.adiciona(convenio));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


}
