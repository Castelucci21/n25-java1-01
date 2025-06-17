package br.com.senaisp.com.Aula05;

import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.next(); // Ultiliza do delimitador padrão
		System.out.println("Seu nome é " + nome);
		
		//Agora o nome completo
		System.out.println("Digite seu nome completo: ");
		sc.nextLine();
		String nomeCompleto = sc.nextLine(); // Usa o delimitador \n
		System.out.println("Seu nome completo é " + nomeCompleto);
		sc.close();
	}

}
