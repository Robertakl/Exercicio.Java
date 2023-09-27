package principal;

import javax.swing.JOptionPane;

public class exercicioswitch {
	public static void main(String[] args) {
		
		String nome  = JOptionPane.showInputDialog("Digite seu nome");
		Integer Mês = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do seu Nascimento"));
		
	switch (Mês) {
	case 1:
		JOptionPane.showMessageDialog(null,"O mes que foi digitado é Janeiro " + "\n O seu planeta regente é Saturno/Verde" + "\nSeu nome é " + nome);
		break;
	case 2:
		JOptionPane.showMessageDialog(null, nome + " Vênus/Azul");
		break;
	case 3:
		JOptionPane.showMessageDialog(null, nome + " Júpiter/Vermelho");
		break;
		
	case 4:
		JOptionPane.showMessageDialog(null, nome + " Marte/Amarelo");
		break;
		
	case 5:
		JOptionPane.showMessageDialog(null, nome + " Saturno/Verde");
		break;
	
	case 6:
		JOptionPane.showMessageDialog(null, nome + " Vênus/Azul");
		break;
		
	case 7:
		JOptionPane.showMessageDialog(null, nome + " Júpiter/Vermelho");
		break;
		
	case 8:
		JOptionPane.showMessageDialog(null, nome + " Marte/Amarelo");
		break;
		
	case 9:
		JOptionPane.showMessageDialog(null, nome + " Saturno/Verde");
		break;
		
	case 10:
		JOptionPane.showMessageDialog(null, nome + " Vênus/Azul");
		break;
		
	case 11:
		JOptionPane.showMessageDialog(null, nome + " Júpiter/Vermelho");
		break;
		
	case 12:
		JOptionPane.showMessageDialog(null, nome + " Marte/Amarelo");
		break;

	default:
		JOptionPane.showMessageDialog(null, " Não existe o planeta q foi digitado");

		break;
	}
		
	}

}
