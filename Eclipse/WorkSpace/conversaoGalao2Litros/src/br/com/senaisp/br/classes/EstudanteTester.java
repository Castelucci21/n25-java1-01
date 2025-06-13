package br.com.senaisp.br.classes;

public class EstudanteTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudante est = new Estudante();
		
		//Duas diferentes formas de printar informações em tela	
		est.setNome("Aluno 01");
		est.setra(1234);
		System.out.println(est);
		
		//Ultilizando Constructor torna mais facil de armazenar
		Estudante est2 = new Estudante(4567,"Aluno 02");
		System.out.println(est2);

	}

}