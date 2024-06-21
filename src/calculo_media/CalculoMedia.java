package calculo_media;

import java.util.Scanner;

public class CalculoMedia {
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	
	public void lerNotas() {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota 1: ");
		nota1 = Scanner.nextDouble();
		
		System.out.print("Digite a nota 2: ");
		nota2 = Scanner.nextDouble();
		
		System.out.print("Digite a nota 3: ");
		nota3 = Scanner.nextDouble();
		
		System.out.print("Digite a nota 4: ");
		nota4 = Scanner.nextDouble();
	}
	
	public double calcularMedia() {
		return (nota1 + nota2 + nota3 + nota4) /4;
	}
	
	public void imprimirMedia() {
		double media = calcularMedia();
		System.out.print("A media é: " + media);
	}
	
	public static void main(String[] args) {
		CalculoMedia mediaNotas = new CalculoMedia();
		mediaNotas.lerNotas();
		mediaNotas.imprimirMedia();
	}

}
