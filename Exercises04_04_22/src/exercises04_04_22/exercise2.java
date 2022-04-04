/*
Ler 10 números e imprimir quantos são pares e quantos são ímpares. 
 */
package exercises04_04_22;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		int x,contPar=0,contImpar=0;
		Scanner ler = new Scanner(System.in);
		for(int i=1;i<=10;i++)
		{
			System.out.println("Digite um numero: ");
			x=ler.nextInt();
			if(x%2==0)
			{
				contPar++;
			}
			else if(x%2==1)
			{
				contImpar++;
			}
			System.out.println("Foram digitados "+contPar+" numeros pares e "+contImpar+" numeros impares");
		}
	}

}
