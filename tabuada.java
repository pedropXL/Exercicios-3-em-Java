//Ler um número inteiro N, daí mostrar na tela a tabuada de N para 1 a 10, conforme exemplo.

import java.util.Scanner;

public class tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, i, resultado;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		x=sc.nextInt();
		
		for (i=1; i<11; i++) {
			resultado=x*i;
			System.out.println(x + " X " + i + " = " + resultado);
		}
		sc.close();
	}

}
