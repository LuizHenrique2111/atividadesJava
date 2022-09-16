package CalculadoraClass;

public class Calculadora {

	private double taxaMensal;
	private double aporteMensal;
	private double capitalInicial;
	private double rendimento;
	private double novoCapital;

	public double getTaxaMensal() {
		return taxaMensal;
	}

	public void setTaxaMensal(double taxaMensal) {
		this.taxaMensal = taxaMensal;
	}

	public double getAporteMensal() {
		return aporteMensal;
	}

	public void setAporteMensal(double aporteMensal) {
		this.aporteMensal = aporteMensal;
	}

	public double getCapitalInicial() {
		return capitalInicial;
	}

	public void setCapitalInicial(double capitalIncial) {
		this.capitalInicial = capitalIncial;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void calculaRendimento() {
		this.rendimento = this.capitalInicial * this.taxaMensal / 100;
	}

	public double getNovoCapital() {
		return novoCapital;
	}

	public void setNovoCapital(double novoCapital) {
		this.novoCapital = novoCapital;
	}

	public void novoRendimento() {
		this.rendimento = (this.novoCapital + this.aporteMensal) * this.taxaMensal / 100;
	}

}
