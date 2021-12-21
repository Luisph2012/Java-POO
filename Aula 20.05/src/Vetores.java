public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Criação do objeto
		Utils utilitarios = new Utils();
		
		// Vetor de inteiros
		int[] idades = new int[10];	
		
		// Tratamento de Exceções e Controle de erros
		try {
			
			// O erro aqui é o for rodar além do tamanho esperado
			// no exemplo 10 posições e aqui ele roda 11 posições
			for (int i=0; i <= idades.length; i++) {
				idades[i] = i * 2;
			}
			
		// Tratamento do erro especifico para vetor fora do limite esperado (ArrayIndexOutOfBoundsException)
		}catch (ArrayIndexOutOfBoundsException erro){
			
			System.out.println("Erro 814: Houve um erro inesperado!");
			
		// Tratamento de qualquer erro (Exceção) - Exception	
		}catch (Exception erro){
			
			System.out.println("Erro 815: Houve um erro inesperado!");
			
		// Tratamento para "Se tudo ainda tiver funcionando" entra aqui	
		}finally {
			
			System.out.println("Tamanho do vetor - " + idades.length);
			
			utilitarios.imprimeArray(idades);
		}

	}

}
