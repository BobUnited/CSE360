package cse360assignment02;


/**
 * A class that can add and subtract.
 */
public class AddingMachine {
	/*public static void main(String []args){
	    AddingMachine fred = new AddingMachine();
	    System.out.println(fred.toString());
	    fred.add(3);
	    fred.subtract(99);
	    System.out.println(fred.toString());
	    System.out.println(fred.getTotal());
	    fred.clear();
	    System.out.println(fred.toString());
	    fred.add(3);
	    System.out.println(fred.toString());
	    fred.clear();
	    fred.add (4); 
	    fred.subtract (2); 
	    fred.add(5);
	    System.out.println(fred.toString());
	 }*/
	/**
	 * The current total of the adding machine.
	 */
	  private int total;
	  /**
		 * The transactions of the adding machine.
		 */
	  private String history;
	  /**
	   * Constructor of AddingMachine, sets total to 0 and history to "".
	   */ 
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    clear();
	  }
	  /**
	   * Returns the total of the adding machine.
	   * @return This AddingMachine's total.
	   */
	  public int getTotal () {
	    return total;
	  }
	  /**
	   * Adds value to this machine's total
	   * @param value The value to add.
	   */
	  public void add (int value) {
		  total += value;
		  history += " + " + value;
	  }
	  /**
	   * Subtracts value from this machine's total
	   * @param value The value to subtract.
	   */
	  public void subtract (int value) {
		  total -= value;
		  history += " - " + value;
	  }
	  /**
	   * Returns a string representation of computations of the adding machine.
	   * @return The string representation of computations of the adding machine
	   */
	  public String toString () {
	    return history;
	  }

	  /**
	   * Sets the memory string to total
	   */
	  public void clear() {
		  total =  0;
		  history = Integer.toString(total);
	  }
	}
