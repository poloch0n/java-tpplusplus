package fr.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVService extends Service {
	
	private ArrayList<String[]> results;

	public ArrayList<String[]> executeFromUc(File file) throws FileNotFoundException{
		
		// to think : find the delimiters param
		String line;

		results = new ArrayList<String[]>(1);
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(file);
		while (scanner.hasNext()){
			
			line = scanner.nextLine();
			results.add(line.split(","));
		}

		return results;
		
	}
	
	@SuppressWarnings(value = {"unused" })
	private void getParam(String line) {
		String[] resultsVirgule = line.split(",");
		String[] resultsPoint = line.split(".");
		String[] resultsPointVirgule = line.split(";");
		String[] resultsTabulation = line.split("	");
		//to think : find seperating element
		// try max element , ; tab
	}

	@Override
	protected ArrayList<String[]> executeToUc(ArrayList<String[]> reader,String from) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
}
