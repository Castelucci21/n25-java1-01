package br.com.senaisp.br.classes;

public class Estudante {
	//Fields ou campos ou variáveis de instância
	private String nome;
	private int ra;
	private double nota;
	private boolean ehFumante;
	//constructor
	public Estudante() {
		setNome("Sem nome");
		setra(0);
		nota = 0.0;
		ehFumante = false;
	}
	
	public Estudante(int ra,String nome) {
		setra(ra);
		setNome(nome);
		nota = 0;
		ehFumante = false;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getra() {
		return ra;
	}
	
	public void setra(int ra) {
		this.ra = ra;
	}
	
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public boolean isEhFumante() {
		return ehFumante;
	}
	public void setEhFumante(boolean ehFumante) {
		this.ehFumante = ehFumante;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + getNome() + "\n" 
				+ "RA: " + getra() + "\n" 
				+ "Nota: "+ getNota() + "\n" 
				+"Fumante: " + isEhFumante() + "\n";
	}
}