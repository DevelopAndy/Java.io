package com.alura.java.io.test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestEscritura {

	public static void main(String[] args) throws IOException {
		
		OutputStream fos = new FileOutputStream("texto.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Holis que tal");
		bw.newLine();
		bw.write("Jejejeje");
		
		bw.close();
	}
}
