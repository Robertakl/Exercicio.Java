package principal;

import javax.swing.JOptionPane;

public class Exercicioif01 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		
		if (idade < 18) {
			JOptionPane.showConfirmDialog(null, nome + "Você tem" + idade +"anos então você é menor.");
			
			
		}
		
		
	}
	

}
