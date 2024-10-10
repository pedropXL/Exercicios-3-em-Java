//Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo segundo. 
//Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.

import java.util.Locale;
import java.util.Scanner;

public class divisao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, numerador, denominador;
		double divisao;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n=sc.nextInt();
		
		for (i=1; i<=n; i++) {
			System.out.print("Entre com o numerador: ");
			numerador=sc.nextInt();
			System.out.print("Entre com o denominador: ");
			denominador=sc.nextInt();
			if (denominador==0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				divisao=(double)numerador/denominador;
				System.out.println("DIVISAO = " + String.format("%.2f", divisao));
			}
		}
			sc.close();
	}
}
