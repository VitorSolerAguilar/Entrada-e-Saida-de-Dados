package com.java.leituradados;
import java.util.Scanner;

public class LeituraDeDados {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String Nome = Sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		int Idade = Sc.nextInt();
		
		if(Idade < 18) {
			System.out.println("Menor de idade!");
		}
		else if(Idade >= 18 && Idade < 70) {
			System.out.println("Maior de idade!");
		}
		else if(Idade >= 70) {
			System.out.println("Terceira idade!");
		}
	}
}