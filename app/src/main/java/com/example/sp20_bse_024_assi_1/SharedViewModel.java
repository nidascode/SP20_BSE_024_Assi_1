package com.example.sp20_bse_024_assi_1;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class SharedViewModel extends ViewModel {
    private ArrayList<Record> records;

    public void initialize(){
        records = new ArrayList<>();
    }

    public ArrayList<Record> getAllRecords(){
        return records;
    }

    public void addRecord(String mail, String name, String age, String address){
        records.add(new Record(mail, name, age, address));
    }
}

class Record {
    private String mail;
    private String name;
    private String age;
    private String address;

    public Record(String mail, String name, String age, String address) {
        this.mail = mail;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}