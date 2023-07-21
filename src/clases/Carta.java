package clases;

import excepciones.CartaIncorrectaException;

public class Carta
{
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
		if (this.getNumero() == 1)
			return 1;
		else if (this.getNumero() == 11 || this.getNumero() == 12 || this.getNumero() == 13)
			return 10;
		return this.getNumero();
	}
	
	public String mostrarNumero()
	{
		switch (this.getNumero())
		{
			case 1:
				return "as";
			case 11:
				return "jota";
			case 12:
				return "reina";
			case 13:
				return "rey";
			default:
				return "" + this.getNumero();
		}
	}
}
