package conversorMoedas;

import javax.swing.*;

public class ConversorMoeda {
	public void converterReaisParaDolares (double valorRecebido) {
		double dolar = valorRecebido / 4.14;
		dolar = (double) Math.round(dolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + dolar + "doláres");
	}
	
	public void converterReaisParaEuro (double valorRecebido) {
		double euro = valorRecebido / 5.28;
		euro = (double) Math.round(euro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + euro + "doláres");
	}
	

	public void converterReaisParaLibras (double valorRecebido) {
		double libras = valorRecebido / 6.08;
		libras = (double) Math.round(libras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + libras + "doláres");
	}
	
	public void converterReaisParaPesoArgentino (double valorRecebido) {
		double pesos = valorRecebido / 0.017;
		pesos = (double) Math.round(pesos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + pesos + "doláres");
	}
	
	public void converterReaisParaPesoChileno (double valorRecebido) {
		double chileno = valorRecebido / 0.0057;
		chileno = (double) Math.round(chileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você possui $" + chileno + "doláres");
	}
}