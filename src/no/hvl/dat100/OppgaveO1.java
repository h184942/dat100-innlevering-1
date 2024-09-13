package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		int n = 2;
		
		for (int i = 1; i <= n; i++) {
			int poeng = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn poengsum: "));
			
			if (100 >= poeng && poeng >= 90) {
				JOptionPane.showMessageDialog(null, "Karakter A");
			}
			else if (89 >= poeng && poeng >= 80) {
				JOptionPane.showMessageDialog(null, "Karakter B");
			}
			else if (79 >= poeng && poeng >= 60) {
				JOptionPane.showMessageDialog(null, "Karakter C");
			}
			else if (59 >= poeng && poeng >= 50) {
				JOptionPane.showMessageDialog(null, "Karakter D");
			}
			else if (49 >= poeng && poeng >= 40) {
				JOptionPane.showMessageDialog(null, "Karakter E");
			}
			else if (39 >= poeng && poeng >= 0) {
				JOptionPane.showMessageDialog(null, "Karakter F");
			}
			else {
				n = n + 1;
				JOptionPane.showMessageDialog(null, "Ugyldig poengsum, legg inn på nytt");

			}
		
		}
	}

}