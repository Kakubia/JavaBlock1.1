/*
Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), 
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre:
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
 */
package exercises04_04_22;

import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		int cont=0,idade,sexo,temperamento,contCalm=0,contMNerv=0,contMAgr=0,contOCalm=0,contTNerv40=0,contTCalm18=0;
		Scanner ler = new Scanner(System.in);
		while(cont<150)
		{
			System.out.println("Digite a idade: ");
			idade=ler.nextInt();
			System.out.println("\nDigite o sexo: " );
			sexo=ler.nextInt();
			System.out.println("\nDigite o temperamento: ");
			temperamento=ler.nextInt();
			
			if(temperamento==1)
			{
				contCalm++;
			}
			if(sexo==1 && temperamento==2)
			{
				contMNerv++;
			}
			if(sexo==2 && temperamento==3)
			{
				contMAgr++;
			}
			if(sexo==3 && temperamento==1)
			{
				contOCalm++;
			}
			if(temperamento==2 && idade>40)
			{
				contTNerv40++;
			}
			if(temperamento==1 && idade<18)
			{
				contTCalm18++;
			}
			cont++;
		}
		System.out.println("O numero de pessoas calmas é "+contCalm);
		System.out.println("O numero de mulheres nervosas é "+contMNerv);
		System.out.println("O numero de homens agressivos é "+contMAgr);
		System.out.println("O numero de outros calmos é "+contOCalm);
		System.out.println("O numero de pessoas nervosas com mais de 40 anos é "+contTNerv40);
		System.out.println("O numero de pessoas calmas com menos de 18 anos é "+contTCalm18);
	}

}
