package services;

public class UsaTaxaJuros implements InterfaceTaxaJuros {

	private Double taxaJuros;

	public UsaTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}

}
