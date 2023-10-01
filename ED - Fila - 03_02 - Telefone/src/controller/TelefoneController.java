package controller;

import model.Fila;

public class TelefoneController {

	public TelefoneController() {
		super();
	}

	public void InsereLiga��o(Fila<String> f, String numero) {
		f.insert(numero);
	}

	public void ConsultaLiga��o(Fila<String> f) {
		if (!f.isEmpty()) {
			String numero = "";
			try {
				numero = f.remove();
			} catch (Exception e) {
				System.err.println(e);
			}
			System.out.println("Chamada perdida de #" + numero);
		} else {
			System.err.println("Fila de chamadas vazia");
		}
	}

}
