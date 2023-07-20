package clases;

import java.util.ArrayList;

public class Juego
{
	private Mazo baraja;
	private ArrayList <Mano> jugadores;

	public Juego()
	{
		this.baraja = new Mazo();
		this.jugadores = new ArrayList <Mano>();
	}

	public Juego(Mazo baraja, ArrayList <Mano> jugadores)
	{
		this.baraja = baraja;
		this.jugadores = jugadores;
	}

	public Mazo getBaraja() {
		return baraja;
	}

	public void setBaraja(Mazo baraja) {
		this.baraja = baraja;
	}

	public ArrayList<Mano> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Mano> jugadores) {
		this.jugadores = jugadores;
	}
}
