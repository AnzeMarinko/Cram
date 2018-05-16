package uporabniskiVmesnik;

public abstract class Strateg {
	/**
	 * Glavno okno kli�e to metodo, ko je strateg na potezi.
	 */
	public abstract void na_potezi();
	
	
	/**
	 * Strateg naj neha igrati potezo.
	 */
	public abstract void prekini();
	
	
	/**
	 * @param i
	 * @param j
	 * 
	 * Glavno okno kli�e to metodo, ko uporabnik klikne na polje (i,j).
	 */
	public abstract void klik(int i, int j);
	
}
