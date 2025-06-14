package br.com.senaisp.com.Aula04;

public class Exemplo02 {

	public static void main(String[] args) {
		String str01 = "Roberto da Silva Sauro";
		//Verificar se há dino no texto
		
		System.out.println(str01.contains("dino"));
		
		//obter a posição no texto de um subtexto
		System.out.println(str01.indexOf("o"));
		
		//Obter o caracter na posição desejada
		System.out.println(str01.charAt(3)); //Começa do 0
		
		//Obtendo substring de uma string sem limitar o final
		System.out.println(str01.substring(8));
		
		//Obtendo substring de uma string sem limitar o final
		System.out.println(str01.substring(8,16));
		
		//Usando o compareTo
		System.out.println(str01.compareToIgnoreCase("Roberta"));
	}

}
