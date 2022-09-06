package com.alura.java.io.test;

import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraFileWriter {

	public static void main(String[] args) throws IOException {
		
		PrintStream ps = new PrintStream("texto-printStream.txt");
		
		ps.println("Holis que tal");
		ps.print("Jejejeje");
		
		ps.close();
	}
}
