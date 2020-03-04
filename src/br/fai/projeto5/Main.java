package br.fai.projeto5;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
	}

	private void start() {
		
		int cont = 0;
		
		for (cont = 0; cont <= 5; cont ++) {
		switch(cont) {
		case 1:
			System.out.println("Primeira condicao.");
			break;
		case 2:
			System.out.println("Nao encontrou uma condicao.");
			break;
		case 3:
			System.out.println("Nao encontrou uma condicao.");
			break;
		case 4:
			System.out.println("Segunda condicao");
			break;
		case 5:
			System.out.println("Nao encontrou uma condicao.");
			break;
		}
		}
	}

}