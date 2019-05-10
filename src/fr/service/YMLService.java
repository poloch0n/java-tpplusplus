package fr.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public class YMLService extends Service{

	@Override
	protected ArrayList<String[]>executeFromUc(File file) throws FileNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ArrayList<String[]> executeToUc( ArrayList<String[]> reader, String from)
			throws UnsupportedEncodingException, FileNotFoundException, IOException {

		File fileFinale = new File("C:\\Users\\Formation\\Workplaces\\Java\\sources\\testresultyml.yml");
		fileFinale.createNewFile();
		
		PrintWriter writer = new PrintWriter(fileFinale, "UTF-8");
		
		writer.println("---");
		switch(from) {
			case "csv":
				//get first line
				for(int i = 1; i < reader.size();i++) {
					writer.println("-");
					
					for(int j = 0; j < reader.get(i).length;j++) {
						writer.println("\t"+reader.get(0)[j].trim()+": "+reader.get(i)[j].trim()+" ,");	
					}
				}
				break;
			default:
				break;
		}

		writer.println("...");
		writer.close();
		return null;
	}

}
