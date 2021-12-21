package br.edu.udf.testemain;

import java.util.Scanner;

public class ExemploScanner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = s.nextLine();
		
		System.out.println("\nDigite sua altura: ");
		double altura = s.nextDouble();
		
		System.out.println("\nO " + nome + " tem " + altura + "m de altura.");
		
	}

}
