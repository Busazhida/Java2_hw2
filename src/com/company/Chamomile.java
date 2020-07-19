package com.company;

public class Chamomile extends Plant{

    private String type;

    public Chamomile(String name, String detachments, Color color, String type) {
        super(name, detachments, color);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Chamomile type -" + getType());
    }
}

