package br.edu.udf.execucao;

import br.edu.udf.reino.genero.Cachorro;
import br.edu.udf.reino.genero.Peixe;

public class TesteAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Peixe novoPeixe = new Peixe();
			  novoPeixe.setNome("Nemo");
			  novoPeixe.setPeso(50);
			  novoPeixe.setTipoHabitat("Aquário");
				
		System.out.println("Nome do Peixe: " + novoPeixe.getNome() + "\nPeso do Peixe: " + novoPeixe.getPeso() + "Kg \nHabitat do Peixe: " + novoPeixe.getTipoHabitat());

		Cachorro novoCachorro = new Cachorro();
				 novoCachorro.setNome("TóTó");
			 	 novoCachorro.setPeso(150);
			 	 novoCachorro.setRaca("São Bernardo");
			
	    System.out.println("\nNome do Cachorro: " + novoCachorro.getNome() + "\nPeso do Cachorro: " + novoCachorro.getPeso() + "Kg \nRaça do Cachorro: " + novoCachorro.getRaca());

		
	}

}
