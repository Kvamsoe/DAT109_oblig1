/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Anders Kvamsøe
 *
 */
public class Runde {
	private int rundeid;
	private String beskrivelse;

	public Runde(int id, String beskrivelse) {
		this.rundeid = id;
		this.beskrivelse = beskrivelse;
	}

	public int getRundeid() {
		return rundeid;
	}

	public void setRundeid(int rundeid) {
		this.rundeid = rundeid;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}
}
