package fr.exception;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
	}

	public static void showText(String texte) {
		System.out.println(texte);
	}
}