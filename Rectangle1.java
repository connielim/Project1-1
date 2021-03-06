import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * { your description of the project here }
 */

/**
 * The class containing the main method, the entry point of
 * the application.
 * 
 * @author Van Le and Connie Lim
 */

// On my honor:
//
// - I have not used source code obtained from another student,
// or any other unauthorized source, either modified or
// unmodified.
//
// - All source code and documentation used in my program is
// either my original work, or was derived by me from the
// source code published in the textbook for this course.
//
// - I have not discussed coding details about this project with
// anyone other than my partner (in the case of a joint
// submission), instructor, ACM/UPE tutors or the TAs assigned
// to this course. I understand that I may discuss the concepts
// of this program with other students, and that another student
// may help me debug my program so long as neither of us writes
// anything during the discussion or modifies any computer file
// during the discussion. I have violated neither the spirit nor
// letter of this restriction.


public class Rectangle1 {
	
	/**
	 * The entry point of the application.
	 * 
	 * @param args The name of the command file passed
	 * 		in as a command line argument.
	 */
	public static void main(String[] args) {
		//Check if there are 0 or more than 1 arguments in the command line
		//The project specifications only want 1 argument
		if(args.length == 0) {
			System.out.println("No input file was detected.");
			System.exit(0);
		} else if (args.length > 1) {
			System.out.println("Too many command line arguments detected.");
			System.exit(0);
		}
		//The file is the first argument
		String file = args[0];
		String line = null;
		//Our created class
		ReadInfo dataCollector = new ReadInfo();
		
		
		try {
			//Use filereader nad bufferedreader to read from the text file
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			//Keep reading each line in the bufferedreader until it ends
			while( (line = bufferedReader.readLine()) != null) {
				//Declare a temporary string that is a line of the bufferedreader
				//Trim the line as well to remove whitespace from the left and right side of the line
				String temp = line.trim();
				//Make sure the string contains actual values
				if(!temp.isEmpty() || !temp.equals("")) {
					dataCollector.analyzeStr(temp);
				}
			}
			//Close the bufferedreader
			bufferedReader.close();
		} catch (IOException ex) {
			System.out.println("Error, could not read " + file);
		}
	}
}