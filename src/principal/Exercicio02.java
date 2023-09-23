package principal;

import javax.swing.JOptionPane;

//2- crie um programa para ler dois números e informar a média aritmética e a metadde entre eles.

public class Exercicio02 {
	
	public static void main(String[] args) {
		int medAri, metDif = 0;

		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
		medAri = (n1 + n2) / 2;
		metDif = (n1 + n2) / 2;
		JOptionPane.showMessageDialog(null, "A média Aritmética: " + medAri);
		JOptionPane.showMessageDialog(null, "A metade da diferença:" + metDif);
		
		
	}
	
	

}
