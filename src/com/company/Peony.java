package com.company;

import org.w3c.dom.ls.LSOutput;

public class Peony extends Plant {

    private int lifeCycle;

    public Peony(String name, String detachments, Color color, int lifeCycle) {
        super(name, detachments, color);
        this.lifeCycle = lifeCycle;
    }

    public int getLifeCycle() {
        return lifeCycle;
    }

    public void setLifeCycle(int lifeCycle) {
        this.lifeCycle = lifeCycle;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Lyfecycle - " + lifeCycle);

    }
}
