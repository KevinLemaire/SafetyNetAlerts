package com.SafetyNet.SafetyNetAlerts.controler;

import com.SafetyNet.SafetyNetAlerts.model.MedicalRecord;
import com.SafetyNet.SafetyNetAlerts.service.MedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicalRecordController {

    @Autowired
    private MedicalRecordService medicalRecordService;

    @GetMapping("/medicalrecords")
    public Iterable<MedicalRecord> getMedicalRecords() {
        return medicalRecordService.getMedicalRecords();
    }
}