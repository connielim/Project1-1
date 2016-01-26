
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
		if(command.equals(INSERT)) {
			//Possible command: insert name x y w h
		} else if(command.equals(REMOVE)) {
			//Possible command: remove name
			//Possible command: remove x y w h
		} else if(command.equals(REGIONSEARCH)) {
			//Possible command: regionsearch
		} else if(command.equals(INTERSECTIONS)) {
			//Possible command: intersections
		} else if (command.equals(SEARCH)) {
			//Possible command: search name
		} else if (command.equals(DUMP)) {
			//Possible command: dump
		} else {
			System.out.println("Bad command read.");
		}
	}
	
	private void insert() {
		
	}
	
	private void remove() {
		
	}
	
	private void regionsearch() {
		
	}
	
	private void intersections() {
		
	}
	
	private void search() {
		
	}
	
	private void dump() {
		
	}
}
