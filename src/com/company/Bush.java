package com.company;

public class Bush extends Plant{

    private  int height;

    public Bush(String name, String detachments, Color color, int height) {
        super(name, detachments, color);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Height - " + getHeight());
    }
}
