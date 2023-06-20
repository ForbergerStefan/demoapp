package com.example.demo.model;

public class Event {

    private String place;
    private int  count;


    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count>0){
            this.count = count;

        }
    }
}
