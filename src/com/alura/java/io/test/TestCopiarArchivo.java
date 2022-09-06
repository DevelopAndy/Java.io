package com.alura.java.io.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TestCopiarArchivo {

	public static void main(String[] args) throws IOException {
		
		InputStream is = System.in;
		Reader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream fileOutputStream = new FileOutputStream("texto-copia.txt");
        Writer osw = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bw = new BufferedWriter(osw);
		
		String linea;
		
		while ((linea = br.readLine()) != null) {	
			bw.write(linea);
			bw.newLine();
		}
			
		bw.close();
	}
}
