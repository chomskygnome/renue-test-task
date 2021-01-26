package io.renue.main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.renue.airports.AirportService;


@SpringBootApplication
public class Main implements CommandLineRunner {
		
	private AirportService airportService = new AirportService();
	
	public static void main(String[] args) throws IOException {
		SpringApplication app = new SpringApplication(Main.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
	
	@Override
	public void run(String... args) {
		try {
			Properties appProps = new Properties();
			appProps.load(new FileInputStream("src\\main\\java\\io\\renue\\main\\app.properties"));
			
			String key;
			if(args.length > 0)
				key = args[0];
			else key = appProps.getProperty("filter_column");
			airportService.print_data(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
