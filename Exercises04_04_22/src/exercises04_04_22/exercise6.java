/*
Escrever um programa que receba vários números inteiros no teclado. 
E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).
 */
package exercises04_04_22;

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		int n,media,soma=0,contador=0;
		Scanner ler = new Scanner(System.in);
		do
		{
			System.out.println("Digite um número: ");
			n=ler.nextInt();
			if(n%3==0 && n!=0)
			{
				contador++;
				soma+=n;			
			}
		}while(n!=0);
		media=soma/contador;	
		System.out.println("A média dos múltiplos de 3 é "+media);
		System.out.println("Fim do programa");
	}

}
