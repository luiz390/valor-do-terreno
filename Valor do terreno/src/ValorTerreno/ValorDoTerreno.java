package ValorTerreno;

import java.util.Scanner;

public class ValorDoTerreno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double area,comprimento,metroquadrado,valor,largura;
		
		System.out.println("digite o comprimento");
		comprimento = sc.nextDouble();
		System.out.println("digite a largura");
		largura = sc.nextDouble();
		System.out.println("Digite o valor do metro quadrado ");
		metroquadrado = sc.nextDouble();
		
		area = comprimento * largura;
		valor = area * metroquadrado;
		
		System.out.println("O TAMANHO DA AREA É " + area);
		System.out.println("O VALOR TOTAL DA AREA " + valor);
		
		
		
		
		

	}

}
