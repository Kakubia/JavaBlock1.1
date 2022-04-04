/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99.
 */
package exercises04_04_22;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		
		int idade,contNovo=0,contVelho=0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite a idade: ");
		idade=ler.nextInt();
		if(idade<21 && idade>0)
		{
			contNovo++;
		}
		else if(idade>50)
		{
			contVelho++;
		}
		while(idade!=-99)
		{
			System.out.println("Digite a idade: ");
			idade=ler.nextInt();
			if(idade<21 && idade>0)
			{
				contNovo++;
			}
			else if(idade>50)
			{
				contVelho++;
			}
		}
		System.out.println("O total de pessoas com menos de 21 anos é "+contNovo+" e o total de pessoas com mais de 50 anos é "+contVelho);
		System.out.println("Fim do programa");
	}
}
