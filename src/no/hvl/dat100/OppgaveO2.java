package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		int lonn = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn bruttoinntekt: "));
		
		if (0 <= lonn && lonn <= 208050) {
			JOptionPane.showMessageDialog(null, "Du betaler 0kr i trinnskatt.");
		}
		else if (208051 <= lonn && lonn <= 292850) {
			JOptionPane.showMessageDialog(null, "Du betaler " + (int)(lonn * 0.017) + "kr i trinnskatt.");
		}
		else if (292851 <= lonn && lonn <= 670000) {
			JOptionPane.showMessageDialog(null, "Du betaler " + (int)(lonn * 0.04) + "kr i trinnskatt.");
		}
		else if (670001 <= lonn && lonn <= 938900) {
			JOptionPane.showMessageDialog(null, "Du betaler " + (int)(lonn * 0.136) + "kr i trinnskatt.");
		}
		else if (938901 <= lonn && lonn <= 1350000) {
			JOptionPane.showMessageDialog(null, "Du betaler " + (int)(lonn * 0.166) + "kr i trinnskatt.");
		}
		else if (1350001 <= lonn) {
			JOptionPane.showMessageDialog(null, "Du betaler " + (int)(lonn * 0.176) + "kr i trinnskatt.");
		}
	}

}
