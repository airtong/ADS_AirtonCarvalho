package banco;

public class ContaCorrente extends Conta {

	@Override
	void rentabilizar() {
		this.saldo *= 1.01;
	}

	@Override
	public String toString() {
		return "Conta corrente [saldo=" + saldo + "]";
	}
	
}
