package projects;

import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Este programa é uma simulação do jogo da forca.");

		System.out.print("\nO jogo possuí 5 palavras diferentes.\nInsira qualquer número de 1 a 5 para que uma palavra aleatória seja selecionada: ");
		short input = in.nextShort();
		
		int tentativas = 5;
		switch (input) {
		case 1 : 
			System.out.println("Insira 5 letras: ");
			String letra1 = in.next();
			String letra2 = in.next();
			String letra3 = in.next();
			String letra4 = in.next();
			String letra5 = in.next();

			String soma = letra1 + letra2 + letra3 + letra4 + letra5;
			if (soma.equals("chave")) {
				System.out.println("Você acertou!");
			}
			
			if (soma.equalsIgnoreCase("chave") ) {
				while (tentativas > 0) {
				System.out.println("Você errou!");
				tentativas -= tentativas;
				System.out.println("Insira 5 letras: ");
				String letra6 = in.next();
				String letra7 = in.next();
				String letra8 = in.next();
				String letra9 = in.next();
				String letra10 = in.next();

			}
			}
		}
		

		in.close();
	}

}
/*System.out.print("Insira uma letra: ");
			String letra2 = in.next();

			System.out.print("Insira uma letra: ");
			String letra3 = in.next();

			System.out.print("Insira uma letra: ");
			String letra4 = in.next();

			System.out.print("Insira uma letra: ");
			String letra5 = in.next();

			String soma = letra1 + letra2 + letra3 + letra4 + letra5;
	*/