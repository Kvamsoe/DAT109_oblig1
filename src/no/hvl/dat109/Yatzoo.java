package no.hvl.dat109;

/**
 * @author Anders Kvamsøe
 *
 */
public class Yatzoo {

	public static void main(String[] args) {
		int antallSpillere = 5;
		Kolonne[] Brett = new Kolonne[antallSpillere];
		for (int i = 0; i < antallSpillere; i++) {
			Brett[i] = new Kolonne(i);
		}
		boolean avslutt = false;
		int teller = 0;
		while (!avslutt) {
			if (teller < 6) {
				for (int spiller = 0; spiller < antallSpillere; spiller++) {
					Terning[] terninger = new Terning[5];
					for (int i = 0; i < terninger.length; i++) {
						terninger[i] = new Terning();
					}
					int antallKast = 0;
					boolean ferdig = false;
					while (antallKast < 3 && ferdig == false) {
						for (int i = 0; i < 5; i++) {
							if (terninger[i].getKeep() == false) {
								terninger[i].setResultat(terninger[i].trill());
							}
						}

						ferdig = true;
						for (int i = 0; i < terninger.length; i++) {
							if (terninger[i].getResultat() == teller) {
								terninger[i].Keep();
							}
							if (terninger[i].getKeep() == false) {
								ferdig = false;
							}
						}
						antallKast++;
					}
					int poeng = 0;
					for (int i = 0; i < terninger.length; i++) {
						if (terninger[i].getKeep() == true) {
							poeng += 1;
						}
					}
					Brett[spiller].setKolonne(teller, poeng);
				}
			}
//			if (teller == 6) {
//				for (int spiller = 0; spiller < antallSpillere; spiller++) {
//					Terning[] terninger = new Terning[5];
//					for (int i = 0; i < terninger.length; i++) {
//						terninger[i] = new Terning();
//					}
//					int antallKast = 0;
//					boolean ferdig = false;
//					while (antallKast < 3 && ferdig == false) {
//						for (int i = 0; i < 5; i++) {
//							if (terninger[i].getKeep() == false) {
//								terninger[i].setResultat(terninger[i].trill());
//							}
//						}
//						int[] terningResultat = new int[6];
//						for (int i = 0; i < terninger.length; i++) {
//							if (terninger[i].getResultat() == 0) {
//								terningResultat[0] += 1;
//							}
//							if (terninger[i].getResultat() == 1) {
//								terningResultat[1] += 1;
//							}
//							if (terninger[i].getResultat() == 2) {
//								terningResultat[2] += 1;
//							}
//							if (terninger[i].getResultat() == 3) {
//								terningResultat[3] += 1;
//							}
//							if (terninger[i].getResultat() == 4) {
//								terningResultat[4] += 1;
//							}
//							if (terninger[i].getResultat() == 5) {
//								terningResultat[5] += 1;
//							}
//						}
//						boolean par = false;
//						int i = 0;
//						while (!par && i<5) {
//							if (terningResultat[i] > 2) {
//								par = true;
//								for (int j = 0; j < terninger.length; j++) {
//									if (terninger[j].getResultat() == i) {
//										terninger[j].Keep();
//									}
//								}
//							}
//							i++;
//						}
//						antallKast++;
//					}
					teller++;
					if (teller == 11) {
						avslutt = true;

					}

				}
				for (int i = 0; i < 5; i++) {
					System.out.println("Spiller " + (i + 1));
					System.out.println(Brett[i]);
				}
			}
		
	}

