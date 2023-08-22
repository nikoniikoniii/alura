package conversorMoedas;

import conversorMoedas.ConversorMoeda;
import conversorMoedas.ConversorMoedaReal;

import javax.swing.JOptionPane;
import java.util.Objects;

public class functionCurrency {
	ConversorMoeda moedas = new ConversorMoeda();
	ConversorMoedaReal reais = new ConversorMoedaReal();
	
	public void converterMoeda(double valorRecebido) {
		String opcao = (JOptionPane.showInputDialog (JOptionPane.showInputDialog(null,
                "Escolha a moeda para a qual você deseja girar seu dinheiro ", "Moedas", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Reais a Dólares", "De Reais a Euros", "De Reais a Libras", "De Reais a Peso Argentino", "De Reais a Peso Chileno", "De Dólares a Reais", "De Euros a Reais", "De Libras a Reais", "De Peso Argentino a Reais", "De Peso Chileno a Reais"}, "Escolha")).toString());
	

        switch (opcao) {
            case "De Reais a Dólares":
                moedas.converterReaisParaDolares(valorRecebido);
                break;
            case "De Reais a Euros":
                moedas.converterReaisParaEuro(valorRecebido);
                break;
            case "De Reais a Libras":
                moedas.converterReaisParaLibras(valorRecebido);
                break;
            case "De Reais a Peso Argentino":
                moedas.converterReaisParaPesoArgentino(valorRecebido);
                break;
            case "De Reais a Peso Chileno":
                moedas.converterReaisParaPesoChileno(valorRecebido);
                break;
            case "De Dólares a Reais":
                reais.converterDolarParaReal(valorRecebido);
                break;
            case "De Euros a Reais":
                reais.converterEuroParaReal(valorRecebido);
                break;
            case "De Libras a Reais":
                reais.converterLibraParaReal(valorRecebido);
                break;
            case "De Peso Argentino a Reais":
                reais.converterReaisParaPesoArgentino(valorRecebido);
                break;
            case "De Peso Chileno a Reais":
                reais.converterReaisParaPesoChileno(valorRecebido);
                break;
        	}
		}
	}
	