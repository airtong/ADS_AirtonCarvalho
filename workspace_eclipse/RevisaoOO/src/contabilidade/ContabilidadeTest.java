package contabilidade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ContabilidadeTest {
	
	@Test
	void testEmpresaMEI() {
		EmpresaMEI empresaMEI = new EmpresaMEI(100.0);
		
		Double valorIREsperado = 27.5;
		assertEquals(valorIREsperado, empresaMEI.getValorIR(), 2);
		
		Double valorISSEsperado = 0.0;
		assertEquals(valorISSEsperado, empresaMEI.getValorISS(), 2);
	}
	
	@Test
	void testEmpresaSimples() {
		EmpresaSimples empresaSimples = new EmpresaSimples(100.0);
		
		Double valorIREsperado = 15.0;
		assertEquals(valorIREsperado, empresaSimples.getValorIR());
		
		Double valorISSEsperado = 8.0;
		assertEquals(valorISSEsperado, empresaSimples.getValorISS());
	}

}
