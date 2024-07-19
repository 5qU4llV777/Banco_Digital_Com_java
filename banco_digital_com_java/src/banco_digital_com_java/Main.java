package banco_digital_com_java;

public class Main {

	public static void main(String[] args) {
		Cliente Claudio = new Cliente();
		Claudio.setNome("Claudio nogueira");
		
		Conta cc = new ContaCorrente(Claudio);
		Conta poupanca = new ContaPoupanca(Claudio);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}