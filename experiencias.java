//Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para 
//organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, 
//quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. 
//Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
//Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, 
//o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento. 
//Faça um programa que leia um valor inteiro N que indica os vários casos de teste que vem a seguir. 
//Cada caso de teste contém um inteiro que representa a quantidade de cobaias utilizadas e uma letra 
//('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho). 
//Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada
// uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com 
//dois dígitos após o ponto. 


import java.util.Locale;
import java.util.Scanner;

public class experiencias {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, quantidade, soma, coelhos, ratos, sapos;
		char tipo;
		double perCoelho, perRatos, perSapos;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		n=sc.nextInt();
		
		soma=0;
		coelhos=0;
		ratos=0;
		sapos=0;
		for (i=1; i<=n; i++) {
			System.out.print("Quantidade de cobaias: ");
			quantidade=sc.nextInt();
			soma=soma+quantidade;
			System.out.print("Tipo de cobaia: ");
			tipo=sc.next().charAt(0);
			if (tipo=='C') {
				coelhos=coelhos+quantidade;
			}
			else if (tipo=='R') {
				ratos=ratos+quantidade;
			}
			else {
				sapos=sapos+quantidade;
			}	
		}
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + soma + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);

		perCoelho=(100.0/soma)*coelhos;
		perRatos=(100.0/soma)*ratos;
		perSapos=(100.0/soma)*sapos;
		System.out.println("Percentual de Coelhos: " + String.format("%.2f", perCoelho));
		System.out.println("Percentual de Ratos: " + String.format("%.2f", perRatos));
		System.out.println("Percentual de Sapos: " + String.format("%.2f", perSapos));
		
		sc.close();
	}
}

