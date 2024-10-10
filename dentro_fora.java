//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. 
//Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, 

import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i, n, x, dentro, fora;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n=sc.nextInt();
		
		dentro=0;
		fora=0;
		
		for (i=1; i<=n; i++) {
			System.out.print("Digite um numero: ");
			x=sc.nextInt();
			if (x>=10 && x<=20) {
				dentro=dentro+1;
			}
			else {
				fora=fora+1;
			}
		}
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");

		sc.close();
	}

}