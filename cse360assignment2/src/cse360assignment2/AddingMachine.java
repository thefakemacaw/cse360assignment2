package cse360assignment2;

public class AddingMachine {
	
	/*
	 * A simple adding machine class that can add and subtract a variable
	 */
	
	private int total;
	private String history;

		/**
		 * Constructor for the AddingMachine Class
		 */
		public AddingMachine () {
			total = 0;  // not needed - included for clarity
			history = "0";
		}

		/**
		 * Getter method that returns total
		 * 
		 * @return		total
		 */
		public int getTotal () {
			return total;
		}
		
		/**
		 * Adds value parameter to total and updates the history string
		 * 
		 * @param	value	the number to be added to total
		 */
		public void add (int value) {
			total += value;
			history = history + " + " + value;
		}

		/**
		 * Subtracts value parameter from total and updates the history string
		 * 
		 * @param	value	the number to be subtracted from total
		 */
		public void subtract (int value) {
			total -= value;
			history = history + " - " + value;
		}

		public String toString () {
			return history;
		}

		/**
		 * Empty for now
		 */
		public void clear() {
			
		}
}
