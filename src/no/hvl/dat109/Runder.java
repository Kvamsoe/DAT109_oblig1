/**
 * 
 */
package no.hvl.dat109;

/**
 * @author Anders Kvamsøe
 *
 */
public class Runder {
	public Runde[] runder;

	private Runde runde1 = new Runde(1, "Løver");
	private Runde runde2 = new Runde(2, "Slanger");
	private Runde runde3 = new Runde(3, "Pandaer");
	private Runde runde4 = new Runde(4, "Griser");
	private Runde runde5 = new Runde(5, "Elefanter");
	private Runde runde6 = new Runde(6, "Hvaler");
	private Runde runde7 = new Runde(7, "Tre like");
	private Runde runde8 = new Runde(8, "Fire like");
	private Runde runde9 = new Runde(9, "To par");
	private Runde runde10 = new Runde(10, "Hus");
	private Runde runde11 = new Runde(11, "Fem ulike");
	private Runde runde12 = new Runde(12, "YatZOO");

	public Runder() {
		runder = new Runde[12];
		runder[0] = runde1;
		runder[1] = runde2;
		runder[2] = runde3;
		runder[3] = runde4;
		runder[4] = runde5;
		runder[5] = runde6;
		runder[6] = runde7;
		runder[7] = runde8;
		runder[8] = runde9;
		runder[9] = runde10;
		runder[10] = runde11;
		runder[11] = runde12;
	}

	public Runde[] getRunder() {
		return runder;
	}

	public void setRunder(Runde[] runder) {
		this.runder = runder;
	}

	public int rundeResultat(int runde, Terning[] terninger) {
		if(runde<6) {
			
		}
		
		return 0;
	}
}

