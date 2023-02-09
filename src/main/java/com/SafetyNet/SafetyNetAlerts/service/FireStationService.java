package com.SafetyNet.SafetyNetAlerts.service;

import com.SafetyNet.SafetyNetAlerts.model.FireStation;
import com.SafetyNet.SafetyNetAlerts.repository.FireStationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class FireStationService {

    @Autowired
    private FireStationRepository fireStationRepository;

    public Optional<FireStation> getFireStation(final Long id) {
        return fireStationRepository.findById(id);
    }

    public Iterable<FireStation> getFireStations() {
        return fireStationRepository.findAll();
    }

    public void deleteFireStation(final Long id) {
        fireStationRepository.deleteById(id);
    }

    public void save(List<FireStation> fireStations) {
        fireStationRepository.saveAll(fireStations);
    }

    public void save1 (FireStation fireStations) {
        fireStationRepository.save(fireStations);
    }
}