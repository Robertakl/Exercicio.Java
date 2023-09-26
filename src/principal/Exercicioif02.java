package principal;
import javax.swing.JOptionPane;

public class Exercicioif02 {

	public static void main(String[] args) {
		  
		Integer anoatual = Integer.parseInt(JOptionPane.showInputDialog("DIgite o ano atual"));
		Integer anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de Nascimento"));
		int idade = (anoatual - anoNasc);
		if (idade < 16) {
			JOptionPane.showConfirmDialog(null,"Não pode Votar." + "A sua idade é" + idade);
			
		}else {
			JOptionPane.showConfirmDialog(null,"É eleitor" + "A sua idade é" + idade +"anos");
		}
	}
		

	}


