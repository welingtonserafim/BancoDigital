package banco.service;

import java.util.ArrayList;
import java.util.List;

import banco.model.Cliente;
import banco.model.Conta;
import banco.model.ContaCorrente;
import banco.model.ContaPoupanca;

public class Banco {
	private String nome;
	private List<Cliente> clientes = new ArrayList<>();
	private List<Conta> contas = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}

	public Cliente cadastrarCliente(String nome, String cpf) {
		Cliente c = new Cliente(nome, cpf);
		clientes.add(c);
		return c;
	}

	public ContaCorrente abrirContaCorrente(Cliente cliente) {
		ContaCorrente cc = new ContaCorrente(cliente);
		contas.add(cc);
		cliente.adicionarConta(cc);
		return cc;
	}

	public ContaPoupanca abrirContaPoupanca(Cliente cliente) {
		ContaPoupanca cp = new ContaPoupanca(cliente);
		contas.add(cp);
		cliente.adicionarConta(cp);
		return cp;
	}

	public Conta buscarConta(int numero) {
		for (Conta c : contas) {
			if (c.getNumero() == numero)
				return c;
		}
		return null;
	}

	public boolean transferirEntreContas(int numOrigem, int numDestino, double valor) {
		Conta origem = buscarConta(numOrigem);
		Conta destino = buscarConta(numDestino);
		if (origem == null || destino == null)
			return false;
		return origem.transferir(valor, destino);
	}

	public String getNome() {
		return nome;
	}
}