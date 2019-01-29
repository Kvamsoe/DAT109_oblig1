/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Anders Kvamsøe
 *
 */
public class Spiller {
	private String navn;
	private int poeng;
	public Kolonne kolonne;
	
	/**
	 * Konstruktør
	 * @param navn
	 */
	public Spiller(String navn) {
		this.navn = navn;
		poeng = 0;
	}

	public Kolonne getKolonne() {
		return kolonne;
	}

	public void setKolonne(Kolonne kolonne) {
		this.kolonne = kolonne;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getPoeng() {
		return poeng;
	}

	public void setPoeng(int poeng) {
		this.poeng = poeng;
	}
	
}
