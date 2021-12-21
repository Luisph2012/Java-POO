// Classe "Filho" que herda metodos e atributos da Classe "Pai" Funcionario
public class Gerente extends Funcionario {
	
	private int senha;
	private int numeroDeFuncionariosGerenciados;
	
	public boolean autenticar (int senha) {
		
		if (this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		}else {
			System.out.println("Acesso Negado!");
			return false;			
		}
		
	}
	@Override //Anotacao
	
	public double getBonificacao() {
		return super.getBonificacao() + 1000;
	}
	
}
