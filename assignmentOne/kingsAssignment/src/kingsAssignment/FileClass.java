package kingsAssignment;

import java.io.File;

public class FileClass {
	
	String fileName;
	File teamFile;
	
	public FileClass(String teamName) {
		this.fileName = teamName + ".txt";
		createFile();
	}
	
	public void createFile() {
		try {
			
			teamFile = new File(fileName);
			if(teamFile.createNewFile()) {
				System.out.println("Team file created.");
			} else {
				System.out.println("Team file found");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
