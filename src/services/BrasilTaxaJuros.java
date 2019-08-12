package services;

public class BrasilTaxaJuros implements InterfaceTaxaJuros {

	private Double taxaJuros;

	public BrasilTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}

}
