package br.com.senaisp.com.Aula04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nome = sc.nextLine();
		//Exemplo: Roberto da Silva Saulo
		//Obter o primeiro nome e o último nome que foi digitado
		
		if (nome.contains(" ")) {
			//Tratando para User que não sabe ler
		String priNome = nome.substring(0,nome.indexOf(" "));
		String sobreNome = nome.substring(nome.lastIndexOf(" ")+1);
		
		System.out.println(nome + '\n' + priNome + '\n' +sobreNome);
		sc.close();
		
		}else {
			System.out.println("Nome inválido");
		}
		
		
		
	}

}
