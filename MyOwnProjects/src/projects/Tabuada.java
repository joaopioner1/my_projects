package projects;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Insira o valor da tabuada: ");
		int valor = in.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}
	
		in.close();
	}

}
