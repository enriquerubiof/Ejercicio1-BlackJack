package clases;

import java.util.ArrayList;
import java.util.Collections;

import clases.Carta.Palo;
import excepciones.CartaIncorrectaException;

public class Mazo
{
	protected ArrayList<Carta> baraja;
	
	public Mazo()
	{
		this.baraja = new ArrayList<Carta>();
		for (int i = 1; i <= 13; i++)
			for (Palo p: Palo.values())
				try {
					this.baraja.add(new Carta(i, p));
				} catch (CartaIncorrectaException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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

	protected Carta solicitarCarta()
	{
		Carta carta = this.getBaraja().get(0);
		this.getBaraja().remove(0);
		return carta;
	}
}
