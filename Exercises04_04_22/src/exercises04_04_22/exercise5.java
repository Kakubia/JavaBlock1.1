/*
Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
No final, mostre a soma dos números digitados.
 */
package exercises04_04_22;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		int x,soma=0;
		Scanner ler = new Scanner(System.in);
		do 
		{
			System.out.println("Digite um número: ");
			x=ler.nextInt();
			soma+=x;
		} while(x!=0);
		System.out.println("A soma dos números é: "+soma);
	}

}
