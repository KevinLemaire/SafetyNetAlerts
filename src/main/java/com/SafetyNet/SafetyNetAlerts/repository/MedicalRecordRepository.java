package com.SafetyNet.SafetyNetAlerts.repository;

import com.SafetyNet.SafetyNetAlerts.model.MedicalRecord;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalRecordRepository extends CrudRepository<MedicalRecord, Long> {
}
