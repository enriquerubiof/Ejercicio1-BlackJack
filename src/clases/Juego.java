package clases;

import java.util.ArrayList;

import excepciones.BlackJackException;
import excepciones.FinDeJuegoException;

public class Juego
{
	private Mazo baraja;
	private ArrayList <Mano> jugadores;
	private Mano banca;

	public Juego(int numJugadores)
	{
		this.init(numJugadores);
	}

	private void init(int numJugadores)
	{
		this.setBaraja(new Mazo());
		this.getBaraja().barajar();
		this.jugadores = new ArrayList<Mano>();
		for (int i = 0; i < numJugadores; i++)
		{
			this.getJugadores().add(new Mano());
			this.pedirCarta(this.getJugadores().get(i));
		}
		this.setBanca(new Mano());
		this.pedirCarta(this.getBanca());
	}
	
	protected void pedirCarta(Mano jugador) {
		jugador.pedirCarta(baraja);
	}
	
	public Mano getJugador(Mano jugador)
	{
		return this.getJugadores().get(this.getJugadores().indexOf(jugador));
	}
	
	public void setJugador(Mano jugador)
	{
		this.getJugadores().get(this.getJugadores().indexOf(jugador)).equals(jugador);
	}

	public Mazo getBaraja() {
		return this.baraja;
	}

	public void setBaraja(Mazo baraja) {
		this.baraja = baraja;
	}
	
	public ArrayList<Mano> getJugadores() {
		return this.jugadores;
	}

	public void setJugadores(ArrayList<Mano> jugadores) {
		this.jugadores = jugadores;
	}

	public Mano getBanca() {
		return this.banca;
	}

	public void setBanca(Mano banca) {
		this.banca = banca;
	}
	
	public void jugarCarta(Mano jugador) throws FinDeJuegoException, BlackJackException
	{
		this.pedirCarta(jugador);
		if (jugador.finDelJuego()) {
			throw new FinDeJuegoException();
		}
		if (jugador.valorMano() == 21) {
			throw new BlackJackException();
		}
	}
	
	public boolean juegaBanca() throws FinDeJuegoException, BlackJackException {
		this.pedirCarta(banca);
		boolean sigue = false;
		if (banca.finDelJuego())
			throw new FinDeJuegoException();
		if (this.banca.valorMano() == 21)
			throw new BlackJackException();
		if (banca.valorMano() < 17)
			sigue = true;
		else
		{
			for (int i = 0; i < this.getJugadores().size(); i++)
			{
				if (banca.valorMano() < this.getJugadores().get(i).valorMano() && this.getJugadores().get(i).valorMano() <= 21)
					sigue =  true;
			}
		}
		return sigue;
	}
}
