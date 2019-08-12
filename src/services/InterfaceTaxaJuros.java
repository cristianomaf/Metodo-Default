package services;

import java.security.InvalidParameterException;

public interface InterfaceTaxaJuros {
	
	public double getTaxaJuros();
	
	
	//metodo default direto na interface
	default double pagamento(double valor,int meses) {
		if(meses < 1) {
			throw new InvalidParameterException("Valor de meses não podem ser menor que 1");
		}
		return valor * Math.pow(1.0 + getTaxaJuros()/100, meses);  //math.pow (a,b) a elevado na b
	}		

}
