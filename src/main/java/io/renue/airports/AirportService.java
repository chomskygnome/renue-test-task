package io.renue.airports;

import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import au.com.bytecode.opencsv.CSVReader;

@Service
public class AirportService {

	private String cvs_path = "src\\main\\java\\io\\renue\\airports.csv";

	private LinkedList<Airport> GenerateOutput(String args) throws IOException{
		LinkedList<Airport> airports = new LinkedList<>();
		CSVReader reader = new CSVReader(new FileReader(cvs_path), ',' , '"' , 0);
	    String[] nextLine;
	    
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Введите строку: ");
	    String data = scan.next();
	    scan.close();
	    
	    boolean axios = false;
	    
	    while((nextLine = reader.readNext()) != null) {
	    	if(nextLine != null) {
	    		if(nextLine[Integer.parseInt(args)].contains(data)) {
	    			char[] _nextLine = nextLine[Integer.parseInt(args)].toCharArray();
	    			char[] _data = data.toCharArray();
	    			for(int i = 0; i < _data.length; i++) {
	    				if(_data[i] == _nextLine[i]) {
	    					axios = true;
	    				}
	    				else {axios = false; break;}
	    			}
	    			if(axios) {
			    		 Airport airport = new Airport(nextLine[0], nextLine[1], nextLine[2], 
			   	    		  nextLine[3], nextLine[4], nextLine[5], nextLine[6], nextLine[7],
			   	    		   nextLine[8], nextLine[9], nextLine[10], nextLine[11]);
			    		 airports.add(airport);
	    			}
	    		}
	    	}
	    }
		
		return airports;
	}
	
	public void print_data(String args) throws IOException {
		LinkedList<Airport> airports = GenerateOutput(args);
		System.out.println("Поиск по "+ args + " столбцу:");
		for(int i = 0; i < airports.size(); i++) {
			Airport airport = airports.get(i);
			System.out.println(airport.getId() + " | " + airport.getTitle()+ " | " + airport.getCity()+ 
					" | " + airport.getCountry() + " | " + airport.getAbb_0() + " | " + airport.getAbb_1() + 
					" | " + airport.getLatitude() + " | " + airport.getLongitude() + " | " + airport.getType() + 
					" | " + airport.getLocation() + " | " + airport.getName() + " | " + airport.getGroup());
		}
		long m = System.currentTimeMillis();
		System.out.println("----------------------------------------");
		System.out.println("Выведено "+airports.size()+" элементов.");
		System.out.println("Программа выполнялась "+(float)m+" ms" );
	}
}
