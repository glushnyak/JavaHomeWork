package com.pb.glushnyak.hw12;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Clients {
    private String name;
    private LocalDate Birthday;
    private ArrayList<String> tel;
    private String address;
    private String dateEdit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        if(this.Birthday != null){
            return Birthday;
        } else {
            return null;
        }
    }

    public void setBirthday(LocalDate Birthday) {
        this.Birthday = Birthday;
        setdateEdit();
    }

    public ArrayList<String> gettel() {
        return tel;
    }

    public void settel(ArrayList<String> tel) {
        this.tel = tel;
        setdateEdit();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        setdateEdit();
    }

    public String getdateEdit() {
        return dateEdit;
    }

    public void setdateEdit() {
        this.dateEdit = new SimpleDateFormat("yyyy.MM.dd_HH-mm-ss").format(Calendar.getInstance().getTime());
    }

    public Clients(){
        setdateEdit();
    }

    public Clients (String name, ArrayList<String> tel) {
        this.name = name;
        this.tel = tel;
        setdateEdit();
    }

    public Clients(String name, LocalDate Birthday, ArrayList<String> tel, String address) {
        this.name = name;
        this.Birthday = Birthday;
        this.tel = tel;
        this.address = address;
        setdateEdit();
    }

    public Clients(String name, LocalDate Birthday, ArrayList<String> tel) {
        this.name = name;
        this.Birthday = Birthday;
        this.tel = tel;
        setdateEdit();
    }

    public Clients(String name, ArrayList<String> tel, String address) {
        this.tel = tel;
        this.address = address;
        setdateEdit();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Birthday, tel, address, dateEdit);
    }

    @Override
    public String toString() {
        return "UniqContact{" +
                "fio='" + name + '\'' +
                ", dateBirthday=" + Birthday +
                ", phones=" + tel +
                ", address='" + address + '\'' +
                ", dateCreate='" + dateEdit + '\'' +
                '}';


    }
}
