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

		System.out.print("Insira o s�mbolo da opera��o que deseja realizar(*, +, -, %, /, raiz): ");
		String simbolo = in.next();

		switch (simbolo) {
		case "*":
			System.out.println("A multiplica��o desses n�meros �: " + (n1 * n2));
			break;
		case "+":
			System.out.println("A soma desses n�meros �: " + (n1 + n2));
			break;
		case "-":
			System.out.println("A diferen�a desses n�meros �: " + (n1 - n2));
			break;
		case "%":
			System.out.println("O segundo n�mero equivale a " + ((100 * n2) / n1) + "% do primeiro n�mero.");
			break;
		case "/":
			System.out.println("A divis�o desses n�meros �: " + (n1 / n2));
			break;
		case "raiz":
			System.out.println("A ra�z quadrada do primeiro n�mero �: " + Math.sqrt(n1) + "\nA ra�z quadrada do segundo n�mero �: " + Math.sqrt(n2));
			break;
		}

		in.close();
	}

}