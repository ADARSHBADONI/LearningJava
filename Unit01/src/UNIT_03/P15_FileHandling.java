package UNIT_03;
import java.io.BufferedReader;
import java.io.File;

public class P15_FileHandling {

	public static void main(String[] args) {
		FileHandlingInJava obj = new FileHandlingInJava();
		obj.takeInputFromAFileNotFromConsole();
	//	obj.saveOutputIntoFile();
	//	obj.createALogFile();

	}
	
}

class FileHandlingInJava{
	void takeInputFromAFileNotFromConsole() {
		String path = "java.txt";
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String st;
		while((st = br.readLine()) != null) {
			System.out.println(st);
		}
		
//		List that holds strings of a file
		List<Stirng> listOfString = new ArrayList<Stirng>();
		
		String line = br.readLine();
	}
	void saveOutputIntoFile() {
		
    }
	void createALogFile() {
		
	}

}