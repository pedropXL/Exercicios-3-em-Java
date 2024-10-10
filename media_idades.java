//Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. 
//O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir a 
//idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a 
//mensagem "IMPOSSIVEL CALCULAR".


import java.util.Locale;
import java.util.Scanner;

public class media_idades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, soma, quantidade;
		double media;
		
		System.out.println("Digite as idades:");
		x=sc.nextInt();
		
		soma=0;
		quantidade=0;
		
		while (x>=0) {
			soma=soma+x;
			quantidade=quantidade+1;
			x=sc.nextInt();
		}
		
		if (quantidade!=0) {
			media=(double)soma/quantidade;
			System.out.println("MEDIA = " + String.format("%.2f", media));
		}
		else {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		sc.close();
	}

}
