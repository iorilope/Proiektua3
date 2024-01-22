package ProiektuaIoritz;

import java.util.ArrayList;
import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class Aparkalekua.
 */
public class Aparkalekua {

	/** The Constant NUM_PLAZAk. */
	private static final int NUM_PLAZAk = 200;

	/** The plazak. */
	private Parking[] plazak;

	/** The parking list. */
	private ArrayList<Parking> parkingList;

	/**
	 * Instantiates a new aparkalekua.
	 */
	public Aparkalekua() {
		this.plazak = new Parking[NUM_PLAZAk];
		this.parkingList = new ArrayList<>();
		PlazakHasi();
	}

	/**
	 * Plazak hasi.
	 */
	private void PlazakHasi() {
		try {
			Random random = new Random();
			for (int i = 0; i < NUM_PLAZAk; i++) {
				String mota = random.nextDouble() < 0.33 ? "Bertakoa" : random.nextDouble() < 0.66 ? "Publikoa" : "Ez-gaituena";
				plazak[i] = new Parking(mota);
			}
		} catch (Exception e) {
			System.out.println("Errorea gertatu da PlazakHasi()-n: " + e.getMessage());
		}
	}

	/**
	 * Bilatu parking dispo.
	 */
	public void BilatuParkingDispo() {
		try {
			for (int i = 0; i < NUM_PLAZAk; i++) {
				if (!plazak[i].isOkupatuta()) {
					System.out.println("Plaza erabilgarria: " + (i + 1) + " - Mota: " + plazak[i].getMota());
				}
			}
		} catch (Exception e) {
			System.out.println("Errorea gertatu da BilatuParkingDispo()-n: " + e.getMessage());
		}
	}


	/**
	 * Lortu parking mota.
	 *
	 * @param PlazaZenbakia the plaza zenbakia
	 * @return the string
	 */
	public String LortuParkingMota(int PlazaZenbakia) {
		try {
			if (parkingList != null) {
				for (Parking parking : parkingList) {
					if (parking.getPlazaZenbaki() == PlazaZenbakia) {
						return parking.getMota();
					}
				}
			}
		} catch (Exception e) {
			System.out.println("Errorea gertatu da LortuParkingMota()-n: " + e.getMessage());
		}
		return null;
	}



	/**
	 * Okupatuparking.
	 *
	 * @param plazaZenbaki the plaza zenbaki
	 * @param ibilgailua the ibilgailua
	 * @param denbora the denbora
	 */
	public void okupatuparking(int plazaZenbaki,String ibilgailua, String denbora) {
		try {
			if (plazaZenbaki >= 1 && plazaZenbaki <= NUM_PLAZAk) {
				if (!plazak[plazaZenbaki - 1].isOkupatuta()) {
					plazak[plazaZenbaki - 1].okupatu(ibilgailua, denbora);
					System.out.println(plazaZenbaki + " plaza okupatu du " + ibilgailua + " ibilgailuak - Ordua: " + denbora);
				} else {
					System.out.println(plazaZenbaki + " plaza ez dago erabilgarri");
				}
			} else {
				System.out.println("Plaza zenbaki desegokia..");
			}
		} catch (Exception e) {
			System.out.println("Errorea gertatu da okupatuparking()-n: " + e.getMessage());
		}
	}

	/**
	 * Desokupatu parkinga.
	 *
	 * @param plazaZenbakia the plaza zenbakia
	 */
	public void DesokupatuParkinga(int plazaZenbakia) {
		try {
			if (plazaZenbakia >= 1 && plazaZenbakia <= NUM_PLAZAk) {
				if (plazak[plazaZenbakia - 1].isOkupatuta()) {
					plazak[plazaZenbakia - 1].desokupatu();
					System.out.println("Deskopatu da ondorengo plaza : " + plazaZenbakia);
				} else {
					System.out.println("Plaza " + plazaZenbakia + " ez dago okupatuta.");
				}
			} else {
				System.out.println("Plaza zenbaki desegokia.");
			}
		} catch (Exception e) {
			System.out.println("Errorea gertatu da DesokupatuParkinga()-n: " + e.getMessage());
		}
	}
}
