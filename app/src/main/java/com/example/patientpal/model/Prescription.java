package com.example.patientpal.model;

import java.util.Date;
import java.util.Map;

public class Prescription {

    int prescriptionID;
    Map<String, Integer> medItems;
    String instructions;
    String status;
    String pictureURL;
    Date prescriptionCreationDate;


    public Prescription() {
    }

    public Prescription(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public int getPrescriptionID() {
        return prescriptionID;
    }

    public void setPrescriptionID(int prescriptionID) {
        this.prescriptionID = prescriptionID;
    }

    public void setMedItems(Map<String, Integer> medItems) {
        this.medItems = medItems;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getPrescriptionCreationDate() {
        return prescriptionCreationDate;
    }

    public void setPrescriptionCreationDate(Date prescriptionCreationDate) {
        this.prescriptionCreationDate = prescriptionCreationDate;
    }

    public Map<String, Integer> getMedItems() {
        return medItems;
    }

    public String getPictureURL() {
        return pictureURL;
    }

    public void setPictureURL(String pictureURL) {
        this.pictureURL = pictureURL;
    }
}
