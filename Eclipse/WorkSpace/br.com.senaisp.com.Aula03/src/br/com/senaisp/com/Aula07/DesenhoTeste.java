package br.com.senaisp.com.Aula07;

import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class DesenhoTeste {

	public static void main(String[] args) {
		JOptionPane pnl = new JOptionPane();
		JDialog dlg = pnl.createDialog("Desenhos em Java");
		dlg.setSize(800,600);
		
		//Mostrar quantidade de instancias
		System.out.println("Qtde " + Desenho.getQtdeInstancias());
		
		//Criando o desenho
		Retangulo ret = new Retangulo(50,50,300,200,Color.blue);
		Quadrado quad = new Quadrado(400,400,50, Color.magenta);
		Triangulo tri = new Triangulo (50,50,300,200,Color.green);
		
		//Mostrar quantidade de instancias
		System.out.println("Qtde " + Desenho.getQtdeInstancias());
		
		//Aplicando o desenho na janela
		dlg.setContentPane(tri);
		
		//mostrando a Janela
		dlg.setVisible(true);
	}

}
