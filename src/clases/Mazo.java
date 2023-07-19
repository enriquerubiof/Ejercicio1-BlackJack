package clases;

import java.util.ArrayList;
import java.util.Collections;

import clases.Carta.Palo;

public class Mazo
{
	protected ArrayList<Carta> baraja;
	
	public Mazo()
	{
		this.baraja = new ArrayList<Carta>();
		for (int i = 1; i <= 13; i++)
			for (Palo p: Palo.values())
				this.baraja.add(new Carta(i, p));
	}

	public ArrayList<Carta> getBaraja() {
		return baraja;
	}

	public void setBaraja(ArrayList<Carta> baraja) {
		this.baraja = baraja;
	}

	@Override
	public String toString()
	{
		String cad = "";
		int cont = 0;
		for (int i = 0; i < this.getBaraja().size(); i++)
		{
			cad += String.format("%-12s", this.baraja.get(cont++)) + " | ";
			if (cont % 4 == 0 && cont != 0)
				cad += "\n";
		}
		cad += "\n";
		return cad;
	}

	public void barajar()
	{
		Collections.shuffle(baraja);
	}

	public Carta solicitarCarta() {
		Carta carta = this.getBaraja().get(0);
		this.getBaraja().remove(0);
		return carta;
	}
}
