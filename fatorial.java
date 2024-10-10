//Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o 
//fatorial de N.


import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, n, fatorial;
		
		System.out.print("Digite o valor de N: ");
		n=sc.nextInt();
		
		fatorial=1;
		for (i=1; i<=n; i++) {
			fatorial=fatorial*i;
		}
		System.out.println("FATORIAL = " + fatorial);
		sc.close();
	}

}
