package no.hvl.dat109;

import java.util.Random;

/**
 * @author Anders Kvams�e
 *
 */
public class Terning {
	public boolean keep;
	public int resultat;
	
	public Dyr[] terning;
	
	private Dyr l�ve = new Dyr("L�ve", "oransje", 1);
	private Dyr slange = new Dyr("Slange", "gr�nn", 2);
	private Dyr panda = new Dyr("Panda", "svart", 3);
	private Dyr gris = new Dyr("Gris", "rosa", 4);
	private Dyr elefant = new Dyr("Elefant", "gr�", 5);
	private Dyr hval = new Dyr("Hval", "bl�", 6);
	
	/*
	 * Konstrukt�r
	 */
	public Terning() {
		terning = new Dyr[6];
		terning[0] = l�ve;
		terning[1] = slange;
		terning[2] = panda;
		terning[3] = gris;
		terning[4] = elefant;
		terning[5] = hval;
		
		keep = false;
	}
	
	/**
	 * Triller terning returner tilfelding int mellom 0 og 5
	 * @return int
	 */
	public int trill() {
		Random ran = new Random();
		int tall = ran.nextInt(6);
		return tall;
	}
	
	/**
	 * Endrer verdien som bestemmer om terningen skal kastest igjen
	 */
	public void Keep() {
		keep = true;
	}
	
	/**
	 * Returnerer verdien til terningen
	 * @return boolean
	 */
	public boolean getKeep() {
		return keep;
	}
	

	public int getResultat() {
		return resultat;
	}
	

	public void setResultat(int resultat) {
		this.resultat = resultat;
	}
}
