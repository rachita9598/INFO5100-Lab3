/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main_Form;

import java.io.File;

/**
 *
 * @author HP
 */
public class Patient {
    String FirstName;
    String LastName;
    int Age;
    String Email;
    String message;
    String patienttype;
    String Gender;
    String Date;
    File Photo;

    public Patient(String FirstName, String LastName, int Age, String Email, String message, String patienttype, String Gender, String Date, File Photo) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Email = Email;
        this.message = message;
        this.patienttype = patienttype;
        this.Gender = Gender;
        this.Date = Date;
        this.Photo = Photo;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPatienttype() {
        return patienttype;
    }

    public void setPatienttype(String patienttype) {
        this.patienttype = patienttype;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public File getPhoto() {
        return Photo;
    }

    public void setPhoto(File Photo) {
        this.Photo = Photo;
    }
    
   
}
