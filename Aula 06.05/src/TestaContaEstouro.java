
public class TestaContaEstouro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroAgencia = 1234;
		int numeroConta   = 111111;
		
		Conta minhaConta = new Conta(numeroAgencia, numeroConta);
		
			  minhaConta.depositar(9595);
			  minhaConta.sacar(5000);
 
		Conta minhaConta2 = new Conta();	  
			  
			  System.out.println( minhaConta.verSaldo() );  
			  
		
		/* 
		 * Desafio:
			
			Criar Construtor recebendo um Cliente.
			Isto é, ao criar uma conta, automaticamente terei um cliente	  
		*/
			  
				
		Cliente novoCliente = new Cliente();
				novoCliente.setNome("Raul");
				novoCliente.setSobrenome("Silva");
			  
		Conta minhaConta3 = new Conta(novoCliente);
		System.out.println( minhaConta3.getTitular().getNome() + " " + minhaConta3.getTitular().getSobrenome() );
  
	}

}
