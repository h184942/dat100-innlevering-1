package no.hvl.dat100;

import javax.swing.JOptionPane;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn en verdi n: "));
		
		if(n < 0) {
			JOptionPane.showMessageDialog(null, "Verdien må være positiv");
		} else {
			printFakultet(n);
		}

	}
	
	public static void printFakultet(int n) {
		int nFakultet = 1;
		for(int i = 1; i <= n; i++) {
			nFakultet *= i;
		}
		JOptionPane.showMessageDialog(null, nFakultet);
	}

}
