package fr.converter;

import java.io.File;

import fr.exception.CustomException;
import fr.service.ServiceFactory;
import fr.view.Listener;

public class App {

	static Listener reader;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ServiceFactory sf = new ServiceFactory();
		reader = new Listener();

		showText("Début");
		try {			
			sf.run(reader.getNextLine());
				//.executeUc();		
		} catch (CustomException e) {
			
		}

		showText("fin");
	}
	
	public static void showText(String texte) {
		System.out.println(texte);
	}

}
