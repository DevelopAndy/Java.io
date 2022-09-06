package com.alura.java.io.test;

import java.io.FileWriter;
import java.io.IOException;

public class TestEscrituraPrintStreamPrintWriter {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("texto-generado.txt");
		
		fw.write("Holis que tal");
		fw.write(System.lineSeparator());
		fw.write("Jejejeje");
		
		fw.close();
	}
}
