package com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class TestLectura {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("texto.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linea = br.readLine();
		
		while (linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		}
		
		br.close();
	}
}
