
public class TestaContaEstouro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroAgencia = 1234;
		int numeroConta   = 111111;
		
		Conta minhaConta = new Conta(numeroAgencia, numeroConta);
		
			  minhaConta.depositar(100000.0);
			  minhaConta.sacar(5000);
 
		Conta minhaConta2 = new Conta();	  
			  
			  System.out.println( minhaConta.verSaldo() );
			  
		
		/* 
		 * Desafio:
			
			Criar Construtor recebendo um Cliente.
			Isto é, ao criar uma conta, automaticamente terei um cliente	  
		*/	  
	}

}
