/**
 * 
 */
package no.hvl.dat109;

import java.util.Arrays;

/**
 * @author Anders Kvamsøe
 *
 */
public class Kolonne {
	private int kolonneId;
	
	public int[] kolonne;
	

	public Kolonne(int id) {
		kolonneId = id;
		kolonne = new int[12];
	}

	public int getKolonneId() {
		return kolonneId;
	}

	public void setKolonneId(int kolonneId) {
		this.kolonneId = kolonneId;
	}

	public int[] getKolonne() {
		return kolonne;
	}

	public void setKolonne(int teller, int verdi) {
		kolonne[teller] = verdi;
	}
	public int getResultat(int teller) {
		return kolonne[teller];
	}
	
	@Override
	public String toString() {
		String s = "";
		int poeng = 0;
		for(int i = 0; i < 6; i++) {
			s += "Poeng fra Runde " +(i+1)+"\t"+kolonne[i]+"\n" ;
			poeng += kolonne[i];
		}
		s += "-----------------------------------\n";
		s += "Resultat: \t\t" + poeng+"\n";
		return s;
	}
}