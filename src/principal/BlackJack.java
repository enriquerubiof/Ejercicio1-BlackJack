package principal;

import clases.Mazo;

public class BlackJack
{
	public static void main(String[] args)
	{
		Mazo mazo = new Mazo();
		System.out.println(mazo);
		
		mazo.barajar();
		System.out.println(mazo);
		
		System.out.println(mazo.solicitarCarta());
		System.out.println(mazo);
	}

}
