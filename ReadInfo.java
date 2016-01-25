
public class ReadInfo {
	public static String[] lines;
	private int nextIndex = 0;
	
	//Push onto the 'lines' array using a set index
	public void push(String s) {
		lines[nextIndex] = s;
		nextIndex++;
	}
	
	//Push onto the 'lines' array using a given index
	public void push(String s, int lineNumber) {
		lines[lineNumber] = s;
	}
	
	private void resetNextIndex() {
		nextIndex = 0;
	}
	
	public void setLinesSize(int x) {
		lines = new String[x];
	}
}
