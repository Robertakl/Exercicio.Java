package principal;

import javax.swing.JOptionPane;

public class exercicioloop {
	public static void main(String[] args) {
		
		// Variáveis.
		String nomeAluno;
		double nota1;
		double nota2;
		int contador =0;
		double somaNotas=0.0;
		
		//Loop para ler os dados dos Alunos.
		while (true) {
			nomeAluno=JOptionPane.showInputDialog("Digite o nome do aluno (ou 'FIM' ara encerrar):");
			
			//Verifica se o Usuário Digitou 'Fim' para encerrar.
			if (nomeAluno.equalsIgnoreCase("FIM")) {
				break; //Sai do LOOP
			}
			
			//Leitura das notas dos alunos
			nota1=Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do aluno"));
			nota2=Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do aluno"));
			
			//Cálculo da média.
			double media=(nota1 + nota2)/2;
			
			// 	Incrementa o contador e acumula as notas
			contador++;
			somaNotas += media;
			
			//Exibe a média do aluno.
		  JOptionPane.showMessageDialog(null," Média do aluno" + nomeAluno + ":"+ media);
		}
		//Verifica se foram inseridos dados antes de calcular a média geral.
		if (contador>0) {
			// Cálculo da média geral.
			double mediaGeral=somaNotas/contador;
			JOptionPane.showMessageDialog(null,"Média geral da turma:" + mediaGeral);
		}else {
			JOptionPane.showMessageDialog(null,"Nenhum aluno inserido. Encerrando o programa.");
			
		}
		
		
	}

}
 