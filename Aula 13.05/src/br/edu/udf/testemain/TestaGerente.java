package br.edu.udf.testemain;

import br.edu.udf.colaboradores.Funcionario;
import br.edu.udf.colaboradores.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario testeFuncionario; // é só uma referencia para um Funcionario
		
		Funcionario testeFuncionario2 = new Funcionario(); // Objeto
		
		
		Gerente novoGerente = new Gerente();
		
				novoGerente.setNome("Raul Silva");
				novoGerente.setCpf("123456789");
				novoGerente.setSalario(5000);
				
		System.out.println( "Nome do Gerente - " + novoGerente.getNome() );
		System.out.println( "CPF do Gerente - "  + novoGerente.getCpf() );
		System.out.println( "Salário do Gerente - "  + novoGerente.getSalario() );
		System.out.println( "Bonificacao do Gerente - "  + novoGerente.getBonificacao() );
		
	}

}
