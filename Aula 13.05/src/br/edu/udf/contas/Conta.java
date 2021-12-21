package br.edu.udf.contas;
import br.edu.udf.clientes.Cliente;

public class Conta {

	private int		agencia;
	private int 	conta;
	private Cliente	titular;
	private double	saldo;
	
	// Construtor, msm nome da Classe
	// "Principal" da classe
	public Conta (){
		System.out.println("Construindo uma nova conta... ");
	}
	
	public Conta (int numeroAgencia, int numeroConta){
		this.agencia 	= numeroAgencia;
		this.conta 		= numeroConta;
	}
	
	public Conta (Cliente titular){
		this.titular = titular;
	}
	
	//////// Getters e Setters
	
	// "Pega" - Retornar valor
	public int getAgencia() {
		return this.agencia;
	}
	
	// "Bota" (colocar) - Atribuir/modifica valor (Setar valor)
	public void setAgencia(int novaAgencia) {
		this.agencia = novaAgencia;
	}
	////////////////////////////////////////////
	
	
	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double quantidadeSaque) {
		
		if (this.saldo >= quantidadeSaque) {		
			this.saldo -= quantidadeSaque;
			System.out.println(" Saque efetuado com sucesso! =D ");
		} else {
			System.out.println(" Sem saldo! ");
		}
		
	}
	
	public void depositar(double quantidadeDeposito) {
		this.saldo += quantidadeDeposito;
	}
	
	public double verSaldo() {
		return this.saldo;
	}
	
}
