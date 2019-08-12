package services;

import java.security.InvalidParameterException;

public class BrasilTaxaJuros implements InterfaceTaxaJuros  {
	
	private Double taxaJuros;

	public BrasilTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}
	@Override
	public double pagamento(double valor,int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Valor de meses n�o podem ser menor que 1");
		}
		return (valor + 10)* Math.pow(1.0 + taxaJuros/100, meses);  //math.pow (a,b) a elevado na b
	}				// mais 10 aqui foi para diferenciar a taxa brasil					
	
	
	

}
