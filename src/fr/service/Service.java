package fr.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

public abstract class Service {

	protected abstract ArrayList<String[]> executeFromUc(File file) throws FileNotFoundException;

	protected abstract ArrayList<String[]> executeToUc(ArrayList<String[]> reader,String from) throws UnsupportedEncodingException, FileNotFoundException, IOException;

}
