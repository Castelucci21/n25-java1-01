package br.com.senaisp.com.Aula05;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		//Usando o Scanner para ler um arquivo texto
		Scanner sc = new Scanner(Exercicio01.class.getResourceAsStream("arquivo.txt"));
		String linha = sc.nextLine(); //Pegando cabeçario
		Scanner sca = new Scanner(linha);
		sca.useDelimiter(";");
		//imprimindo o cabeçario
		while(sca.hasNext()) {
			System.out.print(sca.next() + "\t\t"); // /t = Tab 
		}
		System.out.println(); //Pulando a linha 
		sca.close();
		while(sc.hasNextLine()) {
			linha = sc.nextLine(); 
			sca = new Scanner (linha);
			sca.useDelimiter(";");
			
			
			
		}
	}

}
