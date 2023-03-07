package contabilidade;

public class EmpresaMEI implements Tributavel {
	private static final Double TAXA_ISS_EMPRESA_MEI = 0.0;
	private static final Double TAXA_IR_EMPRESA_MEI = 0.275;
	Double faturamentoMensal;

	public EmpresaMEI(Double faturamentoMensal) {
		super();
		this.faturamentoMensal = faturamentoMensal;
	}

	@Override
	public Double getValorIR() {
		return this.faturamentoMensal * TAXA_IR_EMPRESA_MEI;
	}

	@Override
	public Double getValorISS() {
		return this.faturamentoMensal * TAXA_ISS_EMPRESA_MEI;
	}
	
	
}
