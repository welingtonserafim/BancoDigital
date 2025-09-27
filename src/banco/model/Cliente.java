package banco.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private List<Conta> contas = new ArrayList<>();

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public void adicionarConta(Conta conta) {
		contas.add(conta);
	}

	public List<Conta> getContas() {
		return Collections.unmodifiableList(contas);
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return nome + " (" + cpf + ")";
	}
}