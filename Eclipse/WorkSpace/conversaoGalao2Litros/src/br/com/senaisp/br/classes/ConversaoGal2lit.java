package br.com.senaisp.br.classes;

import java.util.Scanner;

public class ConversaoGal2lit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos galões deseja converter em litros: ");
		
		double galao = sc.nextDouble();
		double litros = galao * 3.785;		
		// Fazendo a conversão e mostrando
		System.out.println(galao + " Galões é igual a " + litros + " Litros");
		sc.close();
	}

}
