import java.io.File;
import java.util.ArrayList;


public class Util {
	
	public static ArrayList<String> listFilesForFolder(final File folder) {
		
		if(!folder.isDirectory())
			return null;
		
		ArrayList<String> fileNames = new ArrayList<String>();
	    
		for (final File fileEntry : folder.listFiles()) 
	    	fileNames.add(fileEntry.getName());
		
		return fileNames;

	}
}
