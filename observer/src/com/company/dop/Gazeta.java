package com.company.dop;

import java.util.Observable;

public class Gazeta {
    Observable x;

    private class Nabl extends Observable {

    }

    void addObservable(Observable o) {
        if (x == null) {
            x = new Nabl();
        }
    }


}
