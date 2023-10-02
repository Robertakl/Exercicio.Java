package principal;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class exercicioderepeticao {
	public static void main(String[] args) {
		int codigo;
		int quantestoque;
		double precounit;
		String nomeProduto;
		int contador=1;
		double somaTEstoque=0.0;
		while(contador <=200) {
			JOptionPane.showMessageDialog(null,"Produto" + contador );
			nomeProduto=JOptionPane.showInputDialog("Digite o nome do Produto");
			
			codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
			quantestoque= Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade que tem em estoque"));
			precounit= Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do produto"));
			
			double estoque= precounit * quantestoque;
               JOptionPane.showMessageDialog(null,"Valor total do estoque: R$"+  estoque +  " Nome do produto"  + nomeProduto);
               contador++;
               
		}
	}
}

