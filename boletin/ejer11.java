package boletin;

import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el primer numero");
		int n1=teclado.nextInt();
		System.out.println("Dame el segundo numero");
		int n2=teclado.nextInt();
		
		
		if (n1>n2) {
			
		System.out.println("N1 es mayor que N2");
		}
		else
		{
			
			System.out.println("N2 es mayor que N1");
			
			
			
		}
	}

}
