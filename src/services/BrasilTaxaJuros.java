package services;

import java.security.InvalidParameterException;

public class BrasilTaxaJuros {
	
	private Double taxaJuros;

	public BrasilTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public double pagamento(double valor,int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Valor de meses não podem ser menor que 1");
		}
		return valor * Math.pow(1.0 + taxaJuros/100, meses);  //math.pow (a,b) a elevado na b
	}
	
	
	

}
