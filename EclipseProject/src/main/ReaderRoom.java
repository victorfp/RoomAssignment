package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderRoom {
	
	final BufferedReader reader;
	
	public ReaderRoom(String path) throws IOException {
		reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(path))));
	}
}
