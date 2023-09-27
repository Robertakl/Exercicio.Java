package principal;

import javax.swing.JOptionPane;

public class exercicio04switch {
	
	public static void main(String[] args) {
		double desc= 0;
		double salliqui= 0;
		String nome =JOptionPane.showInputDialog("Digite seu nome");
		Integer codfuncao = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da função"));
		Double sal = Double.parseDouble(JOptionPane.showInputDialog("Digite o sálario"));
		
		
		switch (codfuncao) {
		case 100:
			 desc=(sal*0.03);
			 salliqui=( sal-desc);
			JOptionPane.showMessageDialog(null,"O desconto da função 100 foi:" + salliqui);
			break;
		case 200:
			desc=(sal*0.05);
			salliqui=(sal-desc);
			JOptionPane.showMessageDialog(null,"O desconto da função 200 foi:" + salliqui);
            break;
		case 600:
			desc= (sal*0.07);
			salliqui=(sal-desc);
			JOptionPane.showMessageDialog(null," O desconto da função 600 foi:" + salliqui);
			break;
		case 700:
			desc=(sal*0.10);
			salliqui=(sal-desc);
			JOptionPane.showMessageDialog(null," O desconto da função 700 foi:" +salliqui);
			break;
		case 900:
			desc=(sal*0.15);
			salliqui=(sal-desc);
			JOptionPane.showMessageDialog(null,"O desconto da função 900 foi:" + salliqui);
			break;
		default:
			JOptionPane.showMessageDialog(null,"A função digitada não foi encontrada ");
			break;
		}
	}

}
