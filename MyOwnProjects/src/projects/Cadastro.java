package projects;

import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("*Este programa é um sistema de cadastro rudimentar*");

<<<<<<< HEAD
		System.out.print("\nOlá, você deseja criar uma conta neste site (Sim/Nao)? ");
=======
		System.out.print("\nOlÃ¡Â¡, vocÃª deseja criar uma conta neste site (Sim/Nao)? ");
>>>>>>> branch 'master' of https://github.com/joaopioner1/myownprojects
		String answer = in.nextLine();

		if (answer.equals("Sim") || answer.equals("sim")) {

			System.out.print("Insira seu nome completo: ");
			in.nextLine();
			
			System.out.print("Insira o seu e-mail: ");
			String email1 = in.nextLine();

<<<<<<< HEAD
			System.out.print("Insira a sua senha com 8 até 12 caracteres (apenas números): ");
=======
			System.out.print("Insira a sua senha com 8 atÃƒÂ© 12 caracteres (apenas nÃƒÂºmeros): ");
>>>>>>> branch 'master' of https://github.com/joaopioner1/myownprojects
			long senha1 = in.nextLong();

			int count = 0;
			while (count < 100) {
				System.out.println(". . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . . .");
				count++;
			}
<<<<<<< HEAD
			System.out.print("Olá, seja bem-vindo! Faça login para entrar");
			
=======

			System.out.println("OlÃ¡, seja bem-vindo! FaÃ§a login para entrar.");

			System.out.println("OlÃ¡, seja bem-vindo! FaÃ§a login para entrar.");

>>>>>>> branch 'master' of https://github.com/joaopioner1/myownprojects
			System.out.print("\nInsira seu e-mail: ");
			String email2 = in.next();

			System.out.print("Insira sua senha: ");
			long senha2 = in.nextLong();

			if (senha2 == senha1 && email1.equals(email2)) {
				System.out.println("Seu login foi efetuado com sucesso!");
			
			} else {
				System.out.println("E-mail ou senha errados, por favor tente novamente.");
			}
		} else {
			System.out.println("Ok, até logo!");
		}

		in.close();
	}
}
