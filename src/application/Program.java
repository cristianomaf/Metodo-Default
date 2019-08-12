package application;

import java.util.Scanner;

import services.BrasilTaxaJuros;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Entre com taxa de juros:");
		double taxaJuros = scan.nextDouble();
		System.out.print("Entre com o valor do emprestimo: ");
		double valor = scan.nextDouble();
		System.out.print("Entre com a quantidade de meses a parcelar:");
		int meses = scan.nextInt();
		
		BrasilTaxaJuros txb = new BrasilTaxaJuros(taxaJuros);
		System.out.printf("O valor a pagar de um emprestimo de %.2f em %d vezes = %.2f ",valor,meses,txb.pagamento(valor, meses));
		
		
		scan.close();
	}

}
