package com.SafetyNet.SafetyNetAlerts.controler;

import com.SafetyNet.SafetyNetAlerts.model.FireStation;
import com.SafetyNet.SafetyNetAlerts.service.FireStationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FireStationController {

    @Autowired
    private FireStationService fireStationService;

    @GetMapping("/firestations")
    public Iterable<FireStation> getFireStations() {
        return fireStationService.getFireStations();
    }
}