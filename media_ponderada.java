//Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. 
//Cada caso de teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a 
//média ponderada, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor 
//tem peso 5. Vale lembrar que a média ponderada é a soma de todos os valores multiplicados pelo seu 
//respectivo peso, dividida pela soma dos pesos.


import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		double x, y, z, media;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n=sc.nextInt();
		
		for (i=1; i<=n; i++) {
			System.out.println("Digite tres numeros:");
			x=sc.nextDouble();
			y=sc.nextDouble();
			z=sc.nextDouble();
			media=(x*2+y*3+z*5)/10.0; 
			System.out.println("MEDIA = " + String.format("%.1f", media));	
		}
		sc.close();
	}

}
