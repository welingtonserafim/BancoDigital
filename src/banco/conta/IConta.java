package banco.conta;

public interface IConta {
	void depositar(double valor);
	boolean sacar(double valor);
	boolean transferir(double valor, IConta destino);
	double getSaldo();
	int getNumero();
	String getTipo();
}
