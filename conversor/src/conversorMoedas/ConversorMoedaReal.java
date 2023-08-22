package conversorMoedas;

import javax.swing.*;

public class ConversorMoedaReal {
	public void converterDolarParaReal (double valorRecebido) {
		double dolar = valorRecebido * 4.14;
		dolar = (double) Math.round(dolar / 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + dolar + "doláres");
	}
	
	public void converterEuroParaReal (double valorRecebido) {
		double euro = valorRecebido * 5.28;
		euro = (double) Math.round(euro / 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + euro + "doláres");
	}
	
	public void converterLibraParaReal (double valorRecebido) {
		double libra = valorRecebido * 6.08;
		libra = (double) Math.round(libra / 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + libra + "doláres");
	}
	
	public void converterReaisParaPesoArgentino (double valorRecebido) {
		double pesos = valorRecebido * 0.017;
		pesos = (double) Math.round(pesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + pesos + "doláres");
	}
	
	public void converterReaisParaPesoChileno (double valorRecebido) {
		double chileno = valorRecebido * 0.0057;
		chileno = (double) Math.round(chileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + chileno + "doláres");
	}
}
