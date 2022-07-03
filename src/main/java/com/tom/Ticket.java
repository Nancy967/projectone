package com.tom;

public class Ticket {
    int origin;
    int destination;
    int price;

    public Ticket() {
    }

    public Ticket(int origin, int destination, int price) {
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }

    public int getOrigin() {
        return origin;
    }

    public void setOrigin(int origin) {
        this.origin = origin;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
