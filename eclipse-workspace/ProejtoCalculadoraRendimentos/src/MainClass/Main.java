package MainClass;

import javax.swing.JOptionPane;

import CalculadoraClass.Calculadora;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("------------------CALCULADORA DE RENDIMENTOS------------------");

		JOptionPane.showMessageDialog(null, "Bem-Vindo a Calculadora de Rendimentos");
		// Declatando variaveis
		String capitalInicial = JOptionPane.showInputDialog("Qual o seu capital inicial?");
		String aporteMensal = JOptionPane.showInputDialog("Qual ser� o valor aportado mensalmente?");
		String taxaMensal = JOptionPane.showInputDialog("Qual vai ser o juros mensal do rendimento?");

		// Instanciando a Classe calculador para o objeto calc
		Calculadora calc = new Calculadora();

		// Convertendo as variaveis criadas
		double capitalInicialD = Double.parseDouble(capitalInicial);
		double aporteMensalD = Double.parseDouble(aporteMensal);
		double taxaMensalD = Double.parseDouble(taxaMensal);

		// Inserindo os valores das variaveis nos atributos com o metodo Setter
		calc.setCapitalInicial(capitalInicialD);
		calc.setAporteMensal(aporteMensalD);
		calc.setTaxaMensal(taxaMensalD);

		/*
		 * JOptionPane.showMessageDialog(null, "O capital incial � " +
		 * calc.getCapitalInicial()); JOptionPane.showMessageDialog(null,
		 * "O aporte Incial � " + calc.getAporteMensal());
		 * JOptionPane.showMessageDialog(null, "A taxa mensal � " +
		 * calc.getTaxaMensal());
		 */

		// Chamando o metodo que calcula o rendimento
		calc.calculaRendimento();

		System.out.printf("O seu rendimento no 1� m�s ser� de %.2f", calc.getRendimento());
		double novoCapital = calc.getCapitalInicial() + calc.getRendimento();
		calc.setNovoCapital(novoCapital);

		// System.out.println("\n" + novoCapital);

		for (int mes = 2; mes <= 120; mes++) {

			calc.novoRendimento();

			System.out.printf("\nO seu rendimento no " + mes + "� m�s ser� de R$%.2f", calc.getRendimento());

			novoCapital += calc.getRendimento() + calc.getAporteMensal();
			calc.setNovoCapital(novoCapital);

			System.out.printf("\nCapital Acumulado no "+ mes+ "� m�s %.2f", novoCapital);
		}

		System.out.printf("\n\nTotal Investido: R$%.2f", calc.getCapitalInicial() + calc.getAporteMensal() * 120);
		System.out.printf("\nTotal Atual: R$%.2f", calc.getNovoCapital());

	}

}
