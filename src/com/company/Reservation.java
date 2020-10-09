package com.company;

import java.util.Date;

public class Reservation {
    String number, cardNumber;
    Date date;
    int numOfDay, numOfPerson;
    Double payment;
    boolean isPayment;
    double discount;
    ReservationStatus status;

    public Reservation(String number, String cardNumber, Date date, int numOfDay, int numOfPerson, Double payment, boolean isPayment, double discount, ReservationStatus status) {
        this.number = number;
        this.cardNumber = cardNumber;
        this.date = date;
        this.numOfDay = numOfDay;
        this.numOfPerson = numOfPerson;
        this.payment = payment;
        this.isPayment = isPayment;
        this.discount = discount;
        this.status = status;
    }

    public Reservation update(Reservation reservation) {
        return null;
    }

    public void confirm() {
        setStatus(ReservationStatus.CONFIRMED);
    }

    public void cancel() {
        setStatus(ReservationStatus.CANCELED);
    }

    public void done() {
        setStatus(ReservationStatus.DONE);
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNumOfDay(int numOfDay) {
        this.numOfDay = numOfDay;
    }

    public void setNumOfPerson(int numOfPerson) {
        this.numOfPerson = numOfPerson;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public void setPayment(boolean payment) {
        isPayment = payment;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public String getNumber() {
        return number;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public Date getDate() {
        return date;
    }

    public int getNumOfDay() {
        return numOfDay;
    }

    public int getNumOfPerson() {
        return numOfPerson;
    }

    public Double getPayment() {
        return payment;
    }

    public boolean isPayment() {
        return isPayment;
    }

    public double getDiscount() {
        return discount;
    }

    public ReservationStatus getStatus() {
        return status;
    }
}
