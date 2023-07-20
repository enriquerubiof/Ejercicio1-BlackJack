package clases;

import excepciones.CartaIncorrectaException;

public class Carta
{
	enum Palo
	{
		treboles, diamantes, corazones, picas
	};
	private int numero;
	private Palo palo;
	

	public Carta(int numero, Palo palo) throws CartaIncorrectaException
	{
		if (numero < 1 || numero > 13)
		{
			throw new CartaIncorrectaException();
		}
		this.numero = numero;
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public Palo getPalo() {
		return palo;
	}
	
	@Override
	public String toString() {
		return this.mostrarNumero() + "_de_" + palo;
	}

	public int getValor()
	{
		int valor = this.getNumero();
		if (valor == 1)
		{
			valor = 1;
		}
		else if (valor == 11 || valor == 12 || valor == 13)
			valor = 10;
		return valor;
	}
	
	public String mostrarNumero()
	{
		String valor = "" + this.getNumero();
		if (valor.equals("1"))
			valor = "as";
		else if (valor.equals("11"))
			valor = "jota";
		else if (valor.equals("12"))
			valor = "reina";
		else if (valor.equals("13"))
			valor = "rey";
		return valor;
	}
}
