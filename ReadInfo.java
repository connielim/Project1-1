
public class ReadInfo {
	final String INSERT = "insert";
	final String REMOVE = "remove";
	final String REGIONSEARCH = "regionsearch";
	final String INTERSECTIONS = "intersections";
	final String SEARCH = "search";
	final String DUMP = "dump";
	
	public void analyzeStr(String str) {
		String[] splitStr = str.split("\\s+"); //Split the input string
		String command = splitStr[0];
		if(command.equals(INSERT)) {
			System.out.print("helo");
		} else if(command.equals(REMOVE)) {
			
		} else if(command.equals(REGIONSEARCH)) {
			
		} else if(command.equals(INTERSECTIONS)) {
			
		} else if (command.equals(SEARCH)) {
			
		} else if (command.equals(DUMP)) {
			
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
