package fr.service;

import java.io.File;
import java.util.ArrayList;

public class ServiceFactory {

	private ArrayList<String[]> results;

	public Service run(String answer) throws Exception {

		//todo : analyse answer
		//
		String filePathOrigin = "C:\\Users\\Formation\\Workplaces\\Java\\sources\\file.csv";
		String filePathFinale = "C:\\Users\\Formation\\Workplaces\\Java\\sources\\fileDestination.json";
		
		File file = new File(filePathOrigin);
		String extension = getFileExtension(file);
		extension = "csv";
		String format = "yml";
		
		Service from;
		switch(extension) {
			case("csv"):
				from = new CSVService();
				break;
			case("json"):
				from = new CSVService();
				break;
			case("xml"):
				from = new CSVService();
				break;
			default:
				from = new CSVService();
				break;
		}
		
		Service to;
		switch(format) {
			case("csv"):
				to = new JSONService();
				break;
			case("json"):
				to = new JSONService();
				break;
			case("xml"):
				to = new JSONService();
				break;
			case("yml"):
					to = new YMLService();
					break;
			default:
				to = new JSONService();
				break;
		}
		
		try {
			results = from.executeFromUc(file);
			to.executeToUc(results,extension);
			//
		} catch (Exception e ) {
			// error while analysing
		}
		
		return null;
	}

	private static String getFileExtension(File file) {
        String extension = "";
 
        try {
            if (file != null && file.exists()) {
                String name = file.getName();
                extension = name.substring(name.lastIndexOf("."));
            }
        } catch (Exception e) {
            extension = "";
        }
 
        return extension;
 
    }

}
