package banco_digital_com_java;

public class ContaPoupança extends Conta{

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
		
	}
	
}	
		
	
	
	


