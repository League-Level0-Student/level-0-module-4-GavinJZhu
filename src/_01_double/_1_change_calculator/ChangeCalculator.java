package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		JOptionPane.showMessageDialog(null, "Welcome to the change counter! (nickels and dimes lol i'm too lazy)");
		String nickelCounter = JOptionPane.showInputDialog("How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int intNickel = Integer.parseInt(nickelCounter);
		// Ask the user how many dimes they have, and convert their answer
		String dimeCounter = JOptionPane.showInputDialog("How many dimes do you have?");
		// Ask the user how many quarters they have, and convert their answer
		int intDime = Integer.parseInt(dimeCounter);
		// Calculate how much money the user has.  Hint: Use a double variable 
		double nickelValue = intNickel*0.05;
		double dimeValue = intDime*0.1;
		double change = nickelValue+dimeValue;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "You have $"+change+" in nickels and dimes!");
	}
}

