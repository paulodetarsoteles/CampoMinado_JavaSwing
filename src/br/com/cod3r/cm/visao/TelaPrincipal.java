package br.com.cod3r.cm.visao;

import javax.swing.JFrame;

import br.com.cod3r.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(20 ,20 ,40 ); 
		add(new PainelTabuleiro(tabuleiro)); 
		
		setTitle("CAMPO MINADO"); 
		setSize(480, 480); 
		setLocationRelativeTo(null); 
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
		setVisible(true); 
	}
	
	public static void main(String[] args) {
		new TelaPrincipal(); 
	}
}