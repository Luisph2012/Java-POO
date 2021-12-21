
// Declaração da Classe
public class Conta {
	
	// Declaração dos atributos (características)
	int agencia;
	int num_conta;
	String titular;
	double saldo;
	String senha;
	
	// Declaração dos metodos (ações)
	
	// retorno nomeDoMetodo parametros
	boolean sacar(double quantidadeSaque) {
		
		if(this.saldo < quantidadeSaque) {
			return false;
		}else {
			this.saldo = this.saldo - quantidadeSaque;
			return true;
		}
		
	}
	
	void depositar(double quantidadeDeposito) {
		
		this.saldo += quantidadeDeposito;
	}

}
