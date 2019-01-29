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

	public int rundeResultat(int runde, Terning[] terningskast) {
		int resultat = 0;
		if(runde<6) {
			for(int i = 0; i<terningskast.length; i++) {
				if(terningskast[i].getResultat() == runde) {
					resultat++;
				}
			}
		}else if(runde==6) {
			if(treLike(terningskast)) {
				resultat = 3;
			}
		}else if(runde==7) {
			if(fireLike(terningskast)) {
				resultat = 4;
			}
		}else if(runde==8) {
			
		}
		
		return resultat;
	}
	public boolean treLike(Terning[] terningskast) {
		boolean treLike = false;
		int antall1 = 0;
		int antall2 = 0;
		int antall3 = 0;
		int antall4 = 0;
		int antall5 = 0;
		int antall6 = 0;
		for(int i = 0; i<terningskast.length; i++) {
			if(terningskast[i].getResultat()==0) {
				antall1++;
			}else if(terningskast[i].getResultat()==1) {
				antall2++;
			}else if(terningskast[i].getResultat()==2) {
				antall3++;
			}else if(terningskast[i].getResultat()==3) {
				antall4++;
			}else if(terningskast[i].getResultat()==4) {
				antall5++;
			}else if(terningskast[i].getResultat()==5) {
				antall6++;
			}
		}
		if(antall1>=3 || antall2>=3 || antall3>=3 || antall4>=3 || antall5>=3 || antall6>=3) {
			treLike = true;
		}
		return treLike;
	}
	public boolean fireLike(Terning[] terningskast) {
		boolean fireLike = false;
		int antall1 = 0;
		int antall2 = 0;
		int antall3 = 0;
		int antall4 = 0;
		int antall5 = 0;
		int antall6 = 0;
		for(int i = 0; i<terningskast.length; i++) {
			if(terningskast[i].getResultat()==0) {
				antall1++;
			}else if(terningskast[i].getResultat()==1) {
				antall2++;
			}else if(terningskast[i].getResultat()==2) {
				antall3++;
			}else if(terningskast[i].getResultat()==3) {
				antall4++;
			}else if(terningskast[i].getResultat()==4) {
				antall5++;
			}else if(terningskast[i].getResultat()==5) {
				antall6++;
			}
		}
		if(antall1>=4 || antall2>=4 || antall3>=4 || antall4>=4 || antall5>=4 || antall6>=4) {
			fireLike = true;
		}
		return fireLike;
	}
	public boolean toPar(Terning[] terningskast) {
		boolean toPar = false;
		int antall1 = 0;
		int antall2 = 0;
		int antall3 = 0;
		int antall4 = 0;
		int antall5 = 0;
		int antall6 = 0;
		for(int i = 0; i<terningskast.length; i++) {
			if(terningskast[i].getResultat()==0) {
				antall1++;
			}else if(terningskast[i].getResultat()==1) {
				antall2++;
			}else if(terningskast[i].getResultat()==2) {
				antall3++;
			}else if(terningskast[i].getResultat()==3) {
				antall4++;
			}else if(terningskast[i].getResultat()==4) {
				antall5++;
			}else if(terningskast[i].getResultat()==5) {
				antall6++;
			}
		}
		if(antall1==2 || antall2>=4 || antall3>=4 || antall4>=4 || antall5>=4 || antall6>=4) {
			toPar = true;
		}
		return toPar;
	}
}

