package banco.model;

public class ContaCorrente extends Conta {
	private double limiteChequeEspecial;

	public ContaCorrente(Cliente cliente) {
		super(cliente);
		this.limiteChequeEspecial = 500.0;
	}

	@Override
	public boolean sacar(double valor) {
		if (valor <= 0)
			return false;
		if (this.saldo + limiteChequeEspecial >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public String getTipo() {
		return "Corrente";
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
}
