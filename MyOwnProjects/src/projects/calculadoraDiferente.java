package projects;

import java.util.Scanner;

public class calculadoraDiferente {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("*Isso � uma calculadora rudimentar*");

		System.out.print("Insira o primeiro n�mero: ");
		double n1 = in.nextDouble();
		System.out.print("Insira o segundo n�mero: ");
		double n2 = in.nextDouble();

		System.out.print("Insira o s�mbolo da opera��o que deseja realizar(*, +, -, %, /): ");
		String simbolo = in.next();

		switch (simbolo) {
		case "*":
			System.out.println("A multiplica��o desses n�meros �: " + (n1 * n2));
			break;

		}

		in.close();
	}

}
