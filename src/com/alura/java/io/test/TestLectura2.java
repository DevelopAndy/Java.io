package com.alura.java.io.test;

import java.io.File;
import java.util.Scanner;

public class TestLectura2 {

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(new File("texto-copia.txt"));
		
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            System.out.println(linea);
        }
        
        scanner.close();
    }
}
