//Барбершоп

import java.io.*;
//import java.util.Scanner;
import java.util.*;

public class Barbershop {

	private static final String FILE = "Note.txt";

	

	public static void main(String[] args) throws Exception{
		ArrayList clients = new ArrayList();
		clients = create(FILE);

		System.out.println("Clients List:");
		clientsPrint(clients);
	}


	// Метод для создания очереди клиентов

	private static ArrayList create(String file) throws Exception{
		FileReader fr = new FileReader(file);
		Scanner scan = new Scanner (fr);

		ArrayList ochered = new ArrayList();

		int hours = 0;
		int minutes = 0;
		int agress = 0;
		int time = 0;


		while(scan.hasNextLine()){
				hours = scan.nextInt();
				System.out.println("hours: " + hours);
				
				minutes = scan.nextInt();
				System.out.println("minutes: " + minutes);
				
				agress = scan.nextInt();
				System.out.println("agress: " + agress);

				System.out.println();

				time = hours * 60 + minutes;

				System.out.println("time: " + time + "\n\n");
		}
		fr.close();
		return ochered;
	}


	private static void clientsPrint(ArrayList clients){
		for(int i=0; i<clients.size(); i++){
			System.out.println(clients.get(i));
		}
	}



}