package com.company;

import com.sun.source.tree.BreakTree;

public class Main {

    public static void main(String[] args) {
        createObject("Peony").print();
        createObject("Chamomile").print();
        createObject("Bush").print();
    }

    public static Printable createObject(String className) {
      Printable printable = null;
        switch (className){
            case "Peony":
                printable = new Peony("Peony", "Open-seed", Color.PINK, 3);
                break;
            case "Chamomile":
                printable = new Chamomile("Chamomile", "Open - seed", Color.WHITE, "Cladanthus mixtus");
                break;
            case "Bush":
                printable = new Bush("Bush", "No seed", Color.GREEN, 90);
                break;
        }
        return printable;
    }

}
