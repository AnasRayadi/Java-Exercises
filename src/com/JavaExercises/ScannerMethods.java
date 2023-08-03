package com.JavaExercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerMethods {

        public static void main(String[] args) throws FileNotFoundException {
            readFile();
        }
        public static void readFile() throws FileNotFoundException {
            File inputFile = new File("/Users/Anas/Desktop/input.txt");
            Scanner Scan = new Scanner(inputFile);
            while (Scan.hasNext()) {
                String input=Scan.nextLine();
                System.out.println(input);
            }
        }
}
