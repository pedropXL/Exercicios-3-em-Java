//Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números impares
// entre eles.


import java.util.Scanner;

public class soma_impares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y, z, soma, a;
		
		System.out.println("Digite dois numeros:");
		x=sc.nextInt();
		y=sc.nextInt();
		
		if (x>y) {
			z=x;
			x=y;
			y=z;
		}
		
		soma=0;
		
		for (a=x+1; a<=y-1; a++) {
			if (a%2!=0) {
				soma=soma+a;
			}
		}
		System.out.println("SOMA DOS IMPARES = " + soma);
		sc.close();
	}

}
