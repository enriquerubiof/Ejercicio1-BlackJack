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
		this.valorMano();
		return "Puntuación: " + this.valorMano() + "\n" + super.toString();
	}

	public int valorMano()
	{
		int valor = 0;
		boolean hayAses = false;
		for (int i = 0; i < this.baraja.size(); i++)
		{
			if (this.baraja.get(i).getValor() == 1)
			{
				hayAses = true;
			}
			valor += this.baraja.get(i).getValor();
		}
		if (hayAses && valor + 10 <= 21)
			return valor + 10;
		else
			return valor;
	}

	public boolean finDelJuego()
	{
		return this.valorMano() > 21;
	}

	public void pedirCarta(Mazo mazo)
	{
		this.baraja.add(mazo.solicitarCarta());
	}
}
