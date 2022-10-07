package media;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		System.out.println("Digite a primeira nota");
		
		Scanner input = new Scanner(System.in);
		
		double nota1 = input.nextDouble();
		
		System.out.println("Digite a segunda nota");
		
		double nota2 = input.nextDouble();
		
		System.out.println("Digite a terceira nota");
		
		double nota3 = input.nextDouble();
		
		System.out.println("Digite a terceira nota");
		
		double nota4 = input.nextDouble();
		
		double media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A media é: " + media);
		
		input.close();
		
	}

}
