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
			valor += this.baraja.get(i).getValor();
		}
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
