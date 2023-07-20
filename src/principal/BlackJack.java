package principal;


import java.util.Scanner;

import clases.Mano;
import clases.Mazo;

public class BlackJack
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int seguir = 1;
		int tuPunt = 0, rivalPunt = 0;
		Mano manoPJ1 = new Mano();
		Mano manoPJ2 = new Mano();
		String separador = "   ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~   \n";
		Mazo mazo = new Mazo();
		
		mazo.barajar();
		System.out.println("Mazo actualmente:");
		System.out.println(mazo);

		System.out.println(separador);
		while (seguir == 1)
		{
			manoPJ1.pedirCarta(mazo);
			manoPJ1.valorMano();
			tuPunt = manoPJ1.valorMano();
			System.out.println("Tu mano actualmente es:");
			System.out.println(manoPJ1);
			System.out.println(separador);
			if (manoPJ1.finDelJuego())
			{
				System.out.println("Te excediste de 21, has perdido");
				sc.nextLine();
				System.exit(0);
			}
			else
			{
				System.out.println("¿Deseas más cartas? (0/1):");
				seguir = sc.nextInt();
				System.out.println(separador);
			}
		}
		sc.nextLine();
		System.out.println(separador);
		manoPJ2.valorMano();
		while (manoPJ2.valorMano() < 17)
		{
			manoPJ2.pedirCarta(mazo);
			manoPJ2.valorMano();
			rivalPunt = manoPJ2.valorMano();
			System.out.println("El rival robó una carta. Pulse para continuar.");
			System.out.println(manoPJ2);
			System.out.println(separador);
			sc.nextLine();
			if (manoPJ2.finDelJuego())
			{
				System.out.println("El rival se excedió de 21. ¡HAS GANADO!");
				sc.nextInt();
				System.exit(0);
			}
		}
		if (tuPunt > rivalPunt)
			System.out.println("¡GANASTE!");
		else if (tuPunt < rivalPunt)
			System.out.println("Has perdido, inténtalo de nuevo");
		else
			System.out.println("Empatasteis.");
		System.out.println("Tu puntuación: " + tuPunt + "\nPuntuación rival: " + rivalPunt);
	}

}
