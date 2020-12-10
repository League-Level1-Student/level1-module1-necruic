package _04_popcorn;

import javax.swing.JOptionPane;

public class Popcorn_Maker {
public static void main(String[] args) {
	String flavor = JOptionPane.showInputDialog("What flavor would you like your popcorn to be?");
	Popcorn Popcorn = new Popcorn(flavor);
	Microwave Microwave  = new Microwave();
	String time = JOptionPane.showInputDialog("How long would you like to cook your popcorn?");
	int cookTimeInMinutes = Integer.parseInt(time);
	Microwave.putInMicrowave(Popcorn);
	Microwave.setTime(cookTimeInMinutes);
	Microwave.startMicrowave();
	
}
}
