package banco.model;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public boolean sacar(double valor) {
		if (valor <= 0)
			return false;
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public void aplicarRendimento(double taxaMensal) {
		if (taxaMensal > 0 && this.saldo > 0) {
			this.saldo += this.saldo * taxaMensal;
		}
	}

	@Override
	public String getTipo() {
		return "Poupanca";
	}
}