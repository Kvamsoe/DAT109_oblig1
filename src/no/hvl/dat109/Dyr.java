/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Anders Kvams�e
 *
 */
public class Dyr {
	private String navn;
	private String farge;
	private int id;
	
	/**
	 * Konstrukt�r
	 * @param navn
	 * @param farge
	 * @param id
	 */
	public Dyr(String navn, String farge, int id) {
		this.navn = navn;
		this.farge = farge;
		this.id = id;
	}

	public String getNavn() {
		return navn;
	}

	public String getFarge() {
		return farge;
	}

	public int getId() {
		return id;
	}
}
