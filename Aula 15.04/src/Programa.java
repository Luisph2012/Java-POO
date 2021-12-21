
public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Criação de conta (instancia-la)
		Conta minhaConta;
			  minhaConta = new Conta();
			  
			  // Atribuição de valores
			  minhaConta.agencia 	= 123456;
			  minhaConta.num_conta	= 55555;
			  minhaConta.titular	= "Kleuber";
			  minhaConta.saldo		= 5000.0;
			  minhaConta.senha		= "asdfadfaskjl;lpoinasd2102938471204398";
			  
			System.out.println("Saldo atual da conta do " + minhaConta.titular + ": " + minhaConta.saldo);  
			
			// Chamada do Método
			boolean tentativaSaque = minhaConta.sacar(2000000);
			
				if(tentativaSaque) {
					System.out.println(" Consegui sacar!!!! =D ");
				}else {
					System.out.println(" Rodei... =( ");
				}
			
			System.out.println("Saldo atual da conta do " + minhaConta.titular + ": " + minhaConta.saldo);  
		
		Conta minhaContaSegundoTitular;
			  minhaContaSegundoTitular = new Conta();
			  
			  minhaContaSegundoTitular.titular	= "Thiago";
			  minhaContaSegundoTitular.saldo 	= minhaConta.saldo;
			  
		  System.out.println("Saldo atual da conta do " + minhaContaSegundoTitular.titular + ": " + minhaContaSegundoTitular.saldo);
		  
		// Chamada do Método
		  minhaContaSegundoTitular.depositar(10000);
		  
		  minhaConta.saldo 	= minhaContaSegundoTitular.saldo;
		  
		  System.out.println("Saldo atual da conta do " + minhaContaSegundoTitular.titular + ": " + minhaContaSegundoTitular.saldo);
		  System.out.println("Saldo atual da conta do " + minhaConta.titular + ": " + minhaConta.saldo);  
	}

}
