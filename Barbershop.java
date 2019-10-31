//Барбершоп

import java.io.*;
//import java.util.Scanner;
import java.util.*;

public class Barbershop {

	private static final String FILE = "Note.txt";

	public static void main(String[] args) throws Exception{
		
		

		ArrayList<String[]> line = new ArrayList<String[]>();		// очередь клиентов

		FileReader fr = new FileReader(FILE);
		Scanner scan = new Scanner (fr);

		while(scan.hasNextLine()){

			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();

			String[] customer = new String[2];							// клиент

			customer[0] = Integer.toString(a * 60 + b);
			System.out.println("time: " + a + ":" + b + "   - " + customer[0] + " min");

			customer[1] = Integer.toString(c);
			System.out.println("agress: " + customer[1]);

			line.add(customer);

			System.out.println();

		}
		fr.close();


		System.out.println("Clients List:");
		System.out.println("Size:" + line.size());
		System.out.println(line.toArray());
		
	}

}