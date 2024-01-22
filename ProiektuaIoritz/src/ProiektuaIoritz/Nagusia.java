package ProiektuaIoritz;

import java.util.Scanner;

public class Nagusia {

	public static void main(String[] args) {
		Aparkalekua aparkaleku = new Aparkalekua();
		Scanner scanner = new Scanner(System.in);

		int aukera;
		do {
			try {
				System.out.println("\n--- Menu ---");
				System.out.println("1. Erakutsi erabilgarri dauden aparkalekuak");
				System.out.println("2. Okupatu aparkalekua");
				System.out.println("3. Desokupatu aparkalekua");
				System.out.println("0. irten");
				System.out.print("Aukeratu: ");
				aukera = scanner.nextInt();
				scanner.nextLine(); 

				switch (aukera) {
				case 1:
					try {
						System.out.println("Erabilgarri dauden aparkalekuak:");
						aparkaleku.BilatuParkingDispo();
					} catch (Exception e) {
						System.out.println("Errorea gertatu da: " + e.getMessage());
					}
					break;
				case 2:
					try {
						System.out.println("Erabilgarri dauden aparkalekuak:");
						aparkaleku.BilatuParkingDispo();

						System.out.print("Sartu okupatu nahi duzun plazaren zenbakia: ");
						int numplazaokupatu = scanner.nextInt();
						scanner.nextLine();

						System.out.print("Sartu ibilgailua: ");
						String ibilgailuaokupatu = scanner.nextLine();
						System.out.print("Sartu denbora: ");
						String denboraOkupatu = scanner.nextLine();

						aparkaleku.okupatuparking(numplazaokupatu, ibilgailuaokupatu, denboraOkupatu);
					} catch (Exception e) {
						System.out.println("Errorea gertatu da: " + e.getMessage());

					}
					break;
				case 3:
					try {
						System.out.print("Sartu desokupatu nahi duzun plazaren zenbakia: ");
						int numPlazaDesokupatu = scanner.nextInt();
						scanner.nextLine();
						aparkaleku.DesokupatuParkinga(numPlazaDesokupatu);
					} catch (Exception e) {
						System.out.println("Errorea gertatu da: " + e.getMessage());

					}
					break;
				case 0:
					System.out.println("Programatik ireteten Agur!");
					break;
				default:
					System.out.println("Aukera desegokia.");
				}
			} catch (Exception e) {
				System.out.println("Errorea gertatu da: " + e.getMessage());
				scanner.nextLine();
				aukera = -1;
			}
		} while (aukera != 0);
		scanner.close();
	}
}