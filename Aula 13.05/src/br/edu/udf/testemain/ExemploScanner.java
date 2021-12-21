package br.edu.udf.testemain;

import java.util.Scanner;

	/**
	 *  Neste exemplo vamos solicitar ao usuário que
	 *  digite sua idade e depois vamos imprimir 
	 *  os dados lidos (Capturados)
	 */

public class ExemploScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		
		// Captura a ação
		int idade = s.nextInt();
		
		System.out.println("Sua idade é " + idade + " anos.");

	}

}
