package com.SafetyNet.SafetyNetAlerts.repository;

import com.SafetyNet.SafetyNetAlerts.model.FireStation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FireStationRepository extends CrudRepository<FireStation, Long> {
}
