package projects;

import java.util.Scanner;

public class calculadoraDiferente {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("*Isso é uma calculadora rudimentar*");

		System.out.print("Insira o primeiro número: ");
		double n1 = in.nextDouble();
		System.out.print("Insira o segundo número: ");
		double n2 = in.nextDouble();

		System.out.print("Insira o símbolo da operação que deseja realizar(*, +, -, %, /): ");
		String simbolo = in.next();

		switch (simbolo) {
		case "*":
			System.out.println("A multiplicação desses números é: " + (n1 * n2));
			break;
		case "+":
			System.out.println("A soma desses números é: " + (n1 + n2));
			break;
		case "-":
			System.out.println("A diferença desses números é: " + (n1 - n2));
			break;
		case "%":
			System.out.println("O segundo número equivale a " + ((100 * n2) / n1) + "% do primeiro número.");
			break;
		case "/":
			System.out.println("A divisão desses números é: " + (n1 / n2));
			break;
		}

		in.close();
	}

}
