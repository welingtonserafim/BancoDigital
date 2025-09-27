package banco.model;

import banco.conta.IConta;

public abstract class Conta implements IConta {
	private static int SEQUENCIAL = 1;

	private int numero;
	private Cliente cliente;
	protected double saldo;

	public Conta(Cliente cliente) {
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
		this.saldo = 0.0;
	}

	@Override
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor do depósito deve ser maior que zero.");
		}
		this.saldo += valor;
	}

	@Override
	public boolean transferir(double valor, IConta destino) {
		if (valor <= 0)
			return false;
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public int getNumero() {
		return this.numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public String toString() {
		return String.format("Conta %d (%s) - Cliente: %s - Saldo: %.2f", getNumero(), getTipo(), cliente.getNome(),
				getSaldo());
	}

	@Override
	public abstract boolean sacar(double valor);

	@Override
	public abstract String getTipo();
}