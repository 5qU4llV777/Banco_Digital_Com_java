package banco_digital_com_java;

public interface IConta {
	
     void sacar(double valor);
	
	 void depositar(double valor);
		
	 void transferir(double valor, Conta contaDestino);
	 
	 void imprimirExtrato();

	void transferir(double valor, IConta contaDestino);
	 
	 
		
}


