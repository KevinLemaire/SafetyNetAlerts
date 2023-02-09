package com.SafetyNet.SafetyNetAlerts;

import com.SafetyNet.SafetyNetAlerts.model.FireStation;
import com.SafetyNet.SafetyNetAlerts.service.FireStationService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class SafetyNetAlertsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafetyNetAlertsApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(FireStationService fireStationService) {
		return args -> {
			// read json and write to db
			ObjectMapper mapper = new ObjectMapper();


			FireStation test = new FireStation("1509 Culver St", "3");
			FireStationService station = new FireStationService();
			station.save1(test);

			TypeReference<List<FireStation>> typeReference = new TypeReference<List<FireStation>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/data.json");
			try {
				List<FireStation> fireStations = mapper.readValue(inputStream,typeReference);
				fireStationService.save(fireStations);
				System.out.println("FireStations Saved!");
			} catch (IOException e){
				System.out.println("Unable to save FireStations: " + e.getMessage());
			}
		};
	}

}
