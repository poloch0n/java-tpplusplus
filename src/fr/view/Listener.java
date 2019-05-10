package fr.view;

import java.util.Scanner;

import fr.exception.CustomException;

public class Listener {

	Scanner scanner;
	public Listener() {
		 scanner = new Scanner(System.in);
	}
	
	public String getNextLine() throws CustomException {
		try {
			return scanner.nextLine();
		} catch(Exception e)  {
			throw new CustomException("invalide line");
		}
	}
}
