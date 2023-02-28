package esporte;

import org.junit.jupiter.api.Test;

public class AtletaTest {

	@Test
	void testarConstrutor() {

		Pessoa pessoaEdson = new Pessoa("Edson", 21);

		System.out.println(pessoaEdson.nome);
		System.out.println(pessoaEdson.idade);
		
		Atleta atletaEdson = new Atleta("Edson", 21, 80, false);
		
		System.out.println(atletaEdson.nome);
		System.out.println(atletaEdson.idade);
		System.out.println(atletaEdson.peso);
		System.out.println(atletaEdson.aposentado);
		
		
	}
}
