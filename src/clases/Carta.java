package clases;

import excepciones.CartaIncorrectaException;

public class Carta
{
	enum Palo
	{
		TREBOL, DIAMANTES, CORAZONES, PICAS
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
		return this.mostrarNumero() + "-" + palo;
	}

	public int getValor()
	{
		int valor = this.getNumero();
		if (valor == 1)
		/*{
			if (valorMmano + 11 > 21)
				valor = 1;
			else*/
				valor = 11;
		//}
		else if (valor == 11 || valor == 12 || valor == 13)
			valor = 10;
		return valor;
	}
	
	public String mostrarNumero()
	{
		String valor = "" + this.getNumero();
		if (valor.equals("1"))
			valor = "AS";
		else if (valor.equals("11"))
			valor = "J";
		else if (valor.equals("12"))
			valor = "Q";
		else if (valor.equals("13"))
			valor = "K";
		return valor;
	}
}
