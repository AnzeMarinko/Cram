package uporabniskiVmesnik;

import javax.swing.SwingWorker;

import inteligenca.Minimax;
import logika.Igralec;
import logika.Poteza;

public class Racunalnik extends Strateg  {
	private Okno master;
	private Igralec jaz;
	private SwingWorker<Poteza,Object> mislec;

	public Racunalnik(Okno master, Igralec jaz) {
		this.master = master;
		this.jaz = jaz;
	}
	
	@Override
	public void na_potezi() {
		// Za�nemo razmi�ljati
		mislec = new Minimax(master, 2, jaz);
		mislec.execute();
	}

	@Override
	public void prekini() {
		if (mislec != null) {
			mislec.cancel(true);
		}
	}

	@Override
	public void klik(int i, int j) {
	}
	
}