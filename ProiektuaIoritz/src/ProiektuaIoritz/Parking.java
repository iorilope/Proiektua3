package ProiektuaIoritz;

// TODO: Auto-generated Javadoc
/**
 * The Class Parking.
 */
public class Parking {

	/** The mota string. */
	private String motaString;

	/** The okupatuta. */
	private boolean okupatuta;

	/** The ibilgailua string. */
	private String ibilgailuaString;

	/** The denbora string. */
	private String denboraString;

	/** The Plaza zenbaki. */
	int PlazaZenbaki;

	/**
	 * Instantiates a new parking.
	 *
	 * @param mota the mota
	 */
	public Parking(String mota) {
		this.motaString = mota;
		this.okupatuta = false;
		this.ibilgailuaString = null;
		this.denboraString = null;
	}

	/**
	 * Gets the mota.
	 *
	 * @return the mota
	 */
	public String getMota() {
		return motaString;
	}

	/**
	 * Checks if is okupatuta.
	 *
	 * @return true, if is okupatuta
	 */
	public boolean isOkupatuta() {
		return okupatuta;
	}

	/**
	 * Gets the ibilgailua.
	 *
	 * @return the ibilgailua
	 */
	public String getIbilgailua() {
		return ibilgailuaString;
	}

	/**
	 * Gets the denbora.
	 *
	 * @return the denbora
	 */
	public String getdenbora() {
		return denboraString;
	}

	/**
	 * Okupatu.
	 *
	 * @param ibilgailua the ibilgailua
	 * @param denbora the denbora
	 */
	public void okupatu(String ibilgailua, String denbora) {
		this.okupatuta = true;
		this.ibilgailuaString = ibilgailua;
		this.denboraString = denbora;
	}

	/**
	 * Desokupatu.
	 */
	public void desokupatu() {
		this.okupatuta = false;
		this.ibilgailuaString = null;
		this.denboraString = null;
	}

	/**
	 * Gets the plaza zenbaki.
	 *
	 * @return the plaza zenbaki
	 */
	public int getPlazaZenbaki() {

		return PlazaZenbaki;
	}
}