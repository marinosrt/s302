package org.example.n1exercici1.observer;

import org.example.n1exercici1.subject.Subject;

public abstract class Observer {

    protected Subject subject;
    public abstract void update();

}
