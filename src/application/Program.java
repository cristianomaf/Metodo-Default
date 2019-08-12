package application;

import java.util.Scanner;

import services.BrasilTaxaJuros;
import services.InterfaceTaxaJuros;
import services.UsaTaxaJuros;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		Double taxaJuros =0.0;
		
		System.out.print("Entre com o valor do emprestimo: ");
	    double valor = scan.nextDouble();
	    System.out.print("Entre com a quantidade de meses a parcelar:");
	    int meses = scan.nextInt();
		
		
		System.out.println("Qual taxa de juros deseja usar Brasil ou Estados Unidos (B/U)");
		char pais = scan.next().charAt(0);
		
		if (pais == 'B') {
			taxaJuros = 2.0;
			InterfaceTaxaJuros txb = new BrasilTaxaJuros(taxaJuros);
			System.out.printf("O valor a pagar de um emprestimo de %.2f em %d vezes = %.2f ",valor,meses,txb.pagamento(valor, meses));
		}
		else {
			taxaJuros = 1.0;
			InterfaceTaxaJuros txb = new UsaTaxaJuros(taxaJuros);
			System.out.printf("O valor a pagar de um emprestimo de %.2f em %d vezes = %.2f ",valor,meses,txb.pagamento(valor, meses));
		}
			
		
		
		
		
		scan.close();
	}

}
