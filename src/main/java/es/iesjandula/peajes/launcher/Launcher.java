package es.iesjandula.peajes.launcher;

import java.util.Scanner;

import es.iesjandula.peajes.classes.TicketGeneral;
import es.iesjandula.peajes.classes.TicketSpecial;
import es.iesjandula.peajes.classes.Ticket;

/**
 * 
 * @author David Martinez
 *
 */
public class Launcher
{
	/**
	 * 
	 * Method main
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// ---------------TESTING AREA----------------
		TicketGeneral test1 = new TicketGeneral(100, 200, 10);
		TicketGeneral test2 = new TicketGeneral(100, 200, 11);

		TicketSpecial test3 = new TicketSpecial(100, 200, 10);
		TicketSpecial test4 = new TicketSpecial(100, 200, 12);

		Ticket test5 = new TicketGeneral(100, 200, 10);
		Ticket test6 = new TicketGeneral(100, 200, 11);

		System.out.println("NO IGUALES");
		System.out.println(test1.toString() + "\n" + test2.toString());
		System.out.println(test1.equals(test2));

		System.out.println("IGUALES");
		System.out.println(test1.toString() + "\n" + test1.toString());
		System.out.println(test1.equals(test1));

		System.out.println("NO IGUALES");
		System.out.println(test3.toString() + "\n" + test4.toString());
		System.out.println(test3.equals(test4));

		System.out.println("IGUALES");
		System.out.println(test3.toString() + "\n" + test3.toString());
		System.out.println(test3.equals(test3));

		System.out.println("NO IGUALES");
		System.out.println(test5.toString() + "\n" + test6.toString());
		System.out.println(test5.equals(test6));

		System.out.println("IGUALES");
		System.out.println(test6.toString() + "\n" + test6.toString());
		System.out.println(test6.equals(test6));

		// ---------------TESTING AREA----------------

		Scanner scanner = new Scanner(System.in);
		// ---PRINCIPAL LOOP----
		boolean isRunning = true;

		while (isRunning)
		{
			System.out.println("-----MENU----\n" + "[2] Normal Vehicle\n" + "[1] Buss/Special Vehicle\n");

			int selection = scanner.nextInt();

			switch (selection)
			{
			case 1:
			{
				// ---BUSS / SPECIAL VEHICLES---

				System.out.println("BUSS/SPECIAL-VEHICLE");
				System.out.println("PASAJEROS");
				double pasengers = scanner.nextDouble();

				System.out.println("Start kilometer");
				double startKilometer = scanner.nextDouble();

				System.out.println("End kilometer");
				double endKilometer = scanner.nextDouble();

				System.out.println("Price kilometer");
				double kilometerPrice = scanner.nextDouble();

				TicketSpecial ticketSp = new TicketSpecial(startKilometer, endKilometer, kilometerPrice);

				double totalPrice = ticketSp.calculateDiscount(endKilometer - startKilometer);

				System.out.println("Total Price - " + totalPrice * pasengers);

				break;
			}
			case 2:
			{
				// ---NORMAL VEHICLES---
				System.out.println("NORMAL-VEHICLE");
				System.out.println("Start kilometer");

				double startKilometer = scanner.nextDouble();

				System.out.println("End kilometer");
				double endKilometer = scanner.nextDouble();

				System.out.println("Price kilometer");
				double kilometerPrice = scanner.nextDouble();

				TicketGeneral ticketGn = new TicketGeneral(startKilometer, endKilometer, kilometerPrice);

				double totalPrice = ticketGn.calculateDiscount(endKilometer - startKilometer);

				System.out.println("Total Price - " + totalPrice);

				break;
			}
			}
		}
		// ---COLE THE SCANNER---
		scanner.close();
	}

}
