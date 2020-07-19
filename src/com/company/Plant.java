package com.company;

public class Plant implements Printable {

    private String detachments;
    private Color color;
    private String name;

    public Plant(String name, String detachments, Color color) {
        this.name = name;
        this.detachments = detachments;
        this.color = color;
    }

    public String getDetachments() {
        return detachments;
    }

    public void setDetachments(String detachments) {
        this.detachments = detachments;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("____________________________"
                +"\n Name - "+ getClass().getSimpleName()
                + "\nDetachment  - " + getDetachments()
                + "\n Color - " + getColor());

    }
}
