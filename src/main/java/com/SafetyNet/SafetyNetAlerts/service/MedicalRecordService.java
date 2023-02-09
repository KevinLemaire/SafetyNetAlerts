package com.SafetyNet.SafetyNetAlerts.service;

import com.SafetyNet.SafetyNetAlerts.model.MedicalRecord;
import com.SafetyNet.SafetyNetAlerts.repository.MedicalRecordRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class MedicalRecordService {

    @Autowired
    private MedicalRecordRepository medicalRecordRepository;

    public Optional<MedicalRecord> getMedicalRecord(final Long id) {
        return medicalRecordRepository.findById(id);
    }

    public Iterable<MedicalRecord> getMedicalRecords() {
        return medicalRecordRepository.findAll();
    }

    public void deleteMedicalRecord(final Long id) {
        medicalRecordRepository.deleteById(id);
    }

    public void save(List<MedicalRecord> medicalRecords) {
        medicalRecordRepository.saveAll(medicalRecords);
    }
}