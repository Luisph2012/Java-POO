package br.edu.udf.utilitarias;

import br.edu.udf.colaboradores.Funcionario;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes = 0;
	
	public void registrar(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return totalDeBonificacoes;
	}

}
