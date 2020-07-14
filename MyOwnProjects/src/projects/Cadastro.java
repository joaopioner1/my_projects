package projects;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("*Este programa � um sistema de cadastro rudimentar*");

		System.out.print("\nOl�, voc� deseja criar uma conta neste site (Sim/Nao)? ");
		String answer = in.nextLine();

		if (answer.equals("Sim") || answer.equals("sim")) {

			System.out.print("Insira o seu e-mail: ");
			String email1 = in.nextLine();

			System.out.print("Insira a sua senha com 8 at� 12 caracteres (apenas n�meros): ");
			long senha1 = in.nextLong();

			int count = 0;
			while (count < 100) {
				System.out.println(".");
				count++;
			}
			System.out.println("Ol�, seja bem-vindo de novo! Fa�a login para entrar.");

			System.out.print("Insira seu e-mail: ");
			String email2 = in.next();

			System.out.print("Insira sua senha: ");
			long senha2 = in.nextLong();

			if (senha2 == senha1 && email1.equals(email2)) {
				System.out.println("Seu login foi efetuado com sucesso!");
			} else {
				System.out.println("E-mail ou senha errados, por favor tente novamente.");
			}
		} else {
			System.out.println("Ok, at� logo!");
		}

		in.close();
	}
}