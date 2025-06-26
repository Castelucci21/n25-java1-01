package br.com.senaisp.com.Aula07;

public class BaralhoTeste {

	public static void main(String[] args) {
		Baralho bar = new Baralho();
		bar = new Baralho();
		Carta ct;
		do {
			ct = bar.getCartaSorteada();
			System.out.println(ct);
		} while(bar.getNumCartasDisp()>0);
	}

}
