package com.SafetyNet.SafetyNetAlerts.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "firestations")
@NoArgsConstructor
public class FireStation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
    private String station;


    public FireStation(String address, String station) {
        this.address=address;
        this.station=station;
    }
}
