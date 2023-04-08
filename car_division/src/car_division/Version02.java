package car_division;

import javax.swing.JOptionPane;

public class Version02 {

	public static void main(String[] args) {

		int conf = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado?");

		if (conf == 0) {
			String carros = JOptionPane.showInputDialog("Quantidade de carros dados:"); // Adiciona os valores recebidos
																						// da entrada(input) de dados a
																						// 2 objetos.
			String pessoas = JOptionPane.showInputDialog("Quantidade de pessoas que receberam os carros");
			double carrosQuant = Double.parseDouble(carros);    // Como os inputs acima consideram "String" os valores
																// recebidos, foi feito a conversão para Double para
																// poder fazer os cálculos.
			double pessoasQuant = Double.parseDouble(pessoas);
			int division = (int) (carrosQuant / pessoasQuant);
			double restolho = carrosQuant % pessoasQuant;

			JOptionPane.showMessageDialog(null,
					carrosQuant + " carros dados. " + " O número de carros que cada um recebeu foi: " + division + " E "
							+ restolho + " carros sobraram");
		} else if (conf == 1) {
			JOptionPane.showMessageDialog(null, "Não será exibido resultado.");
		} else {
			JOptionPane.showMessageDialog(null, "Exibição do resultado cancelada");
		}

	}

}
