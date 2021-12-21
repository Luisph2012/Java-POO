
// Classe "Pai
public class Funcionario {

	/*
	 * Protected - acessado (visível)
	 * 			   pela própria classe
	 * 			   e por suas subclasses.
	 * 
	 * OBS: Também pode ser acessado 
	 *      para mesmo pacote.
	 * */ 
	
	protected String nome;
	protected String cpf;
	protected double salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getBonificacao() {
		return this.salario * 0.10;
	}
	
	
}
