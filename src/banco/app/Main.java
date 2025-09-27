package banco.app;

import banco.model.Cliente;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;
import banco.service.Banco;

public class Main {
	public static void main(String[] args) {
		Banco banco = new Banco("Banco Digital");

		Cliente alice = banco.cadastrarCliente("Alice Silva", "111.111.111-11");
		Cliente bob = banco.cadastrarCliente("Bob Santos", "222.222.222-22");

		ContaCorrente ccAlice = banco.abrirContaCorrente(alice);
		ContaPoupanca cpBob = banco.abrirContaPoupanca(bob);

		ccAlice.depositar(1000.0);
		cpBob.depositar(500.0);

		System.out.println(ccAlice);
		System.out.println(cpBob);

		boolean saqueAlice = ccAlice.sacar(1300.0);
		System.out.println("Saque 1300 da conta corrente Alice: " + saqueAlice + " => " + ccAlice.getSaldo());

		boolean saqueBob = cpBob.sacar(600.0);
		System.out.println("Saque 600 da poupança Bob: " + saqueBob + " => " + cpBob.getSaldo());

		boolean transferencia = banco.transferirEntreContas(ccAlice.getNumero(), cpBob.getNumero(), 200.0);
		System.out.println("Transferência de 200 da CC Alice para Poup Bob: " + transferencia);
		System.out.println(ccAlice);
		System.out.println(cpBob);

		cpBob.aplicarRendimento(0.01);
		System.out.println("Após rendimento 1% na poupança: " + cpBob.getSaldo());
	}
}