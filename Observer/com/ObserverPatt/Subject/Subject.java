package com.ObserverPatt.Subject;

import com.ObserverPatt.Observer.Observer;

public interface Subject {
public void registerObserver(Observer o);
public void removeObserver(Observer o);
public void noyifyObserver();
}
