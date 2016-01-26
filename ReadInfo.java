
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
			
		} else if(command.equals(REMOVE)) {
			
		} else if(command.equals(REGIONSEARCH)) {
			
		} else if(command.equals(INTERSECTIONS)) {
			
		} else if (command.equals(SEARCH)) {
			
		} else if (command.equals(DUMP)) {
			
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
