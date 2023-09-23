package principal;

import javax.swing.JOptionPane;

//Shift + CRTL + C - Faznedo comentario
//1- Faça um programa para solicitar um número, calcular e informar o seu dobro

public class Exercicio01 {
	
	
	//main CTRL + Espaço
	public static void main(String[] args) {
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor"));
		int dobro =(numero * 2);
		JOptionPane.showInputDialog(null,"O dobro foi: " + dobro);
						
		
	}

}
