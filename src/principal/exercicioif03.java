package principal;

import javax.swing.JOptionPane;

public class exercicioif03 {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog ("Digite seu Nome");
		Integer n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota"));
		Integer n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota"));
		int nota = (n1 + n2)/2;
		if (nota <70 ) {
		JOptionPane.showConfirmDialog(null,"Você foi:" +  "Aprovado");
				
			}else {
				JOptionPane.showConfirmDialog(null,"Você foi:" + " nota" +"Reprovado");
			}
			
		}
		
		
		
		
	}


