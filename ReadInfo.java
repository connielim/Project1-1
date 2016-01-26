
public class ReadInfo {
	final String INSERT = "insert";
	final String REMOVE = "remove";
	final String REGIONSEARCH = "regionsearch";
	final String INTERSECTIONS = "intersections";
	final String SEARCH = "search";
	final String DUMP = "dump";
	
	//Read the input string to determine what to do with the string
	public void analyzeStr(String str) {
		//Split the input string into an array to read later
		String[] splitStr = str.split("\\s+");
		String command = splitStr[0]; //the command is always the first element in the array
		int arrayLength = splitStr.length;  //the length the array 
		if(command.equals(INSERT)) {
			//checking to see if the user entered the right number of inputs
			if(arrayLength == 6){  
				insert(splitStr[1], splitStr[2], splitStr[3], splitStr[4], splitStr[5]);
			}
			//if not, output the error message based on the number of inputs
			else {
				wrongInputMessage(6, arrayLength);
			}
		} else if(command.equals(REMOVE)) {
			//if the user only enters one input after the command, the user
			//wants to remove a rectangle by its name
			if(arrayLength == 2){
				remove(splitStr[1]);
			}
			//else the user wants to remove a rectangle by its info because
			//there are 4 inputs after the command line
			else if(arrayLength == 5){
				remove(splitStr[1], splitStr[2], splitStr[3], splitStr[4]);
			}
			//if not, output the error message based on the number of inputs
			else {
				wrongInputMessage(5, arrayLength);
			}
		} else if(command.equals(REGIONSEARCH)) {
			//checks to see if the user entered the right number of inputs
			if(arrayLength == 5){
				regionsearch(splitStr[1], splitStr[2], splitStr[3], splitStr[4]);
			}
			//if not, output the error message based on the number of inputs
			else {
				wrongInputMessage(5, arrayLength);
			}
		} else if(command.equals(INTERSECTIONS)) {
			intersections();
		} else if (command.equals(SEARCH)) {
			//checks to see if the user entered the right number of inputs
			if(arrayLength == 2){
				search(splitStr[1]);
			}
			//if not, output the error message based on the number of inputs
			else {
				wrongInputMessage(2, arrayLength);
			}
		} else if (command.equals(DUMP)) {
			dump();
		} else {
			System.out.println("Bad command read.");
		}
	}
	
	/**
	 * Calls the insert function from the skip list after converting
	 * the appropriate strings to ints. 
	 * Inserts the rectangle's name and coordinates into the skip list
	 * @param name - the name of the rectanglel
	 * @param x - the x coordinate of the top left corner of the rectangle
	 * @param y - the y coordinate of the top left corner of the rectangle
	 * @param w - the width of the rectangle
	 * @param h - the height of the rectangle
	 */
	private void insert(String name, String x, String y, String w, String h) {
		if(checkIfDigit(x) && checkIfDigit(y) && checkIfDigit(w) && checkIfDigit(h)){
			Integer.parseInt(x);
			Integer.parseInt(y);
			Integer.parseInt(w);
			Integer.parseInt(h);
			//then call the function
		}
		else{
			System.out.println("You've entered in a wrong coordinates, width, or height.");
		}
	}
	
	/**
	 * Calls the remove function from the skip list
	 * Removes the rectangle from the list
	 * @param name - the name of the rectangle
	 */
	private void remove(String name) {
		//then call the function
	}
	
	/**
	 * Calls the remove function from the skip list after converting
	 * the strings to ints
	 * Removes the rectangle from the list
	 * @param x - the x coor of the top left corner of the rectangle
	 * @param y - the y coor of the top left corner of the rectangle
	 * @param w - the width of the rectangle
	 * @param h - the height of the rectangle
	 */
	private void remove(String x, String y, String w, String h) {
		if(checkIfDigit(x) && checkIfDigit(y) && checkIfDigit(w) && checkIfDigit(h)){
			Integer.parseInt(x);
			Integer.parseInt(y);
			Integer.parseInt(w);
			Integer.parseInt(h);
			//then call the function
		}
		else{
			System.out.println("You've entered in a wrong coordinates, width, or height.");
		}
	}
	
	/**
	 * Calls the regionsearch from the skip list after converting the
	 * strings to ints 
	 * @param x - the x coor of the top left corner of the rectangle
	 * @param y - the y coor of the top left corner of the rectangle
	 * @param w - the width of the rectangle
	 * @param h - the height of the rectangle
	 */
	private void regionsearch(String x, String y, String w, String h) {
		
		if(checkIfDigit(x) && checkIfDigit(y) && checkIfDigit(w) && checkIfDigit(h)){
			Integer.parseInt(x);
			Integer.parseInt(y);
			Integer.parseInt(w);
			Integer.parseInt(h);
			//then call the function
		}
		else{
			System.out.println("You've entered in a wrong coordinate, width, or height.");
		}
	}
	
	/**
	 * Calls the intersection function from the skip list
	 */
	private void intersections() {
		//then call the function
	}
	
	/**
	 * Calls the search method from the skip list
	 * @param name - the name of the rectangle
	 */
	private void search(String name) {
		//then call the function
	}
	
	/**
	 * Calls the dump function from the skip list
	 */
	private void dump() {
		//then call the function
	}
	
	/**
	 * Displays an error message depending on whether the user entered
	 * too less or too much arguments in the execution line
	 * @param desiredLength - this is what the total length of the 
	 * 						  input array should be 
	 * @param size - the actual length of the input line array
	 */
	private void wrongInputMessage(int desiredLength, int size){
		if(size < desiredLength){
			System.out.println("Too less inputs.");
		}
		else {
			System.out.println("Too many inputs.");
		}
	}
	
	/**
	 * Checks to see if the string are just numbers 
	 * @return - if true, that means that the strings are 
	 *           all numbers, else there is an invalid 
	 *           character in there
	 * @param check - the string that we want to check
	 */
	private boolean checkIfDigit(String check){
		boolean isADigit = true;
		for(int i = 0; i < check.length(); i++){
			if(!Character.isDigit(check.charAt(i))){
				isADigit = false;
			}
		}
		return isADigit;
	}
}