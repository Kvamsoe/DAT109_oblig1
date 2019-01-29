package no.hvl.dat109;

/**
 * @author Anders Kvamsøe
 *
 */
public class Blokk {
	private Kolonne[] kolonner;
	private Runder runder;
	private Kolonne kolonne1 = new Kolonne(1);
	private Kolonne kolonne2 = new Kolonne(2);
	private Kolonne kolonne3 = new Kolonne(3);
	private Kolonne kolonne4 = new Kolonne(4);
	private Kolonne kolonne5 = new Kolonne(5);
	
	public Blokk(Spiller[] spillere) {
		runder = new Runder();
		kolonner[0] = kolonne1;
		kolonner[1] = kolonne2;
		kolonner[2] = kolonne3;
		kolonner[3] = kolonne4;
		kolonner[4] = kolonne5;
		tildelKolonne(spillere);
	}

	private void tildelKolonne(Spiller[] spillere) {
		for(int i = 0; i<spillere.length; i++) {
			spillere[i].setKolonne(kolonner[i]);
		}
		
	}

	public Kolonne[] getKolonner() {
		return kolonner;
	}

	public void setKolonner(Kolonne[] kolonner) {
		this.kolonner = kolonner;
	}

	public Runder getRunder() {
		return runder;
	}

	public void setRunder(Runder runder) {
		this.runder = runder;
	}
	
}
