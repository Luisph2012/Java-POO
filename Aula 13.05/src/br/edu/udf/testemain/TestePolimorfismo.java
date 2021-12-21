package br.edu.udf.testemain;

import br.edu.udf.colaboradores.Funcionario;
import br.edu.udf.colaboradores.Gerente;
import br.edu.udf.utilitarias.ControleDeBonificacoes;

public class TestePolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Objeto para controle de Bonificações
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente funcionario1 = new Gerente();
				funcionario1.setNome("Ezequias");
				funcionario1.setSalario(5000);
		
		System.out.println("Bonificação Ezequias - " + funcionario1.getBonificacao());
		
				// Chamada do método que controla o valor das bonificações
				controle.registrar(funcionario1);
			
		Gerente funcionario2 = new Gerente();
				funcionario2.setNome("Thiago");
				funcionario2.setSalario(2000);
				
				// Chamada do método que controla o valor das bonificações
				controle.registrar(funcionario2);
				
		System.out.println("Bonificação Thiago - " + funcionario2.getBonificacao());
		
		Funcionario funcionario3 = new Funcionario();
					funcionario3.setNome("Lucas");
					funcionario3.setSalario(300);
					
				// Chamada do método que controla o valor das bonificações	
				controle.registrar(funcionario3);
				
		System.out.println("Bonificação Lucas - " + funcionario3.getBonificacao());			
		
		System.out.println("Total de Bonificações - " + controle.getTotalDeBonificacoes());
		
		
	}

}
