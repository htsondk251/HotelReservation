package com.company;

public class Room {
    String id;
    Double area;
    int numOfPerson;
    boolean isAvailable;
    Double price;

    public Room(String id, Double area, int numOfPerson, boolean isAvailable, Double price) {
        setAvailable(isAvailable);
        setNumOfPerson(numOfPerson);
        setArea(area);
        setId(id);
        setPrice(price);
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public void setNumOfPerson(int numOfPerson) {
        this.numOfPerson = numOfPerson;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Double getPrice() {
        return price;
    }

    public String getId() {
        return id;
    }

    public Double getArea() {
        return area;
    }

    public int getNumOfPerson() {
        return numOfPerson;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    //TODO: refine
    public String view() {
        return "";
    }

    //TODO: refine
    public Room update(Double area, int numOfPerson, Double price, boolean isAvailable) {
        setArea(area);
        setNumOfPerson(numOfPerson);
        setAvailable(isAvailable);
        setPrice(price);
        return this;
    }

    //    public String update(Double area, int numOfPerson, boolean isAvailable) {
//        setArea(area);
//        setNumOfPerson(numOfPerson);
//        setAvailable(isAvailable);
//        return getId();
//    }

}
