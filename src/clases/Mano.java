package clases;

import java.util.ArrayList;


public class Mano extends Mazo
{
	public Mano()
	{
		this.baraja = new ArrayList<Carta>();
	}

	@Override
	public String toString()
	{
		return "Puntuación: " + this.valorMano() + "\n" + super.toString();
	}

	public int valorMano()
	{
		int valor = 0;
		for (int i = 0; i < this.baraja.size(); i++)
		{
			valor += this.baraja.get(i).getValor(this);
		}
		return valor;
	}

	public boolean finDelJuego()
	{
		if (this.valorMano() > 21)
			return true;
		return false;
	}

	public void pedirCarta(Mazo mazo)
	{
		this.baraja.add(mazo.solicitarCarta());
	}
}
