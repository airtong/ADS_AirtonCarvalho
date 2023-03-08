package pacote;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

public class ProdutoTest {
	
	@Test
	void testeProdutoComoJavaBean() {
		Produto produto = new Produto();
		produto.setDescricao("Queijo Minas Kg");
		produto.setValorCompra(50.00);
		produto.setDataValidade(LocalDate.of(2023, Month.DECEMBER, 30));
		
		System.out.println(produto);
	}
}
