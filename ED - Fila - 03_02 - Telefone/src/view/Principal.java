package view;

import javax.swing.JOptionPane;

import controller.TelefoneController;
import model.Fila;

public class Principal {

	public static void main(String[] args) {
		TelefoneController tc = new TelefoneController();
		Fila<String> f = new Fila<String>();
		int c = 0;
		String numero = "";
		do {

			c = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para adicionar uma chamada perdida /n"
					+ "Digite 2 para consultar a chamada perdida /n" + " Digite 9 para sair"));

			switch (c) {
			case 1:
				numero = JOptionPane.showInputDialog("Insira o número desejado");
				tc.InsereLigação(f, numero);
				break;
			case 2:
				tc.ConsultaLigação(f);
				break;
			case 0:
				System.out.println("Finalizando...");
				break;
			default:
				System.out.println("Opção Invalida");
				break;
			}

		} while (c != 0);

	}

}
