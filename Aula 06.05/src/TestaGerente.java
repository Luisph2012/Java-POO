
public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gerente novoGerente = new Gerente();
		
				novoGerente.setNome("Raul Silva");
				novoGerente.setCpf("123456789");
				novoGerente.setSalario(5000);
				
				double SalarioTotal = novoGerente.getBonificacao() + novoGerente.getSalario();		
		
				
		System.out.println( "Nome do Gerente - " + novoGerente.getNome() );
		System.out.println( "CPF do Gerente - "  + novoGerente.getCpf() );
		System.out.println( "Salario do Gerente - "  + novoGerente.getSalario() );
		System.out.println( "Bonificacao do Gerente - "  + novoGerente.getBonificacao() );
		System.out.println( "Salario Total - "  + SalarioTotal);
		
	}

}
