/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author reemahassan
 */
import java.util.ArrayList;
import java.util.List;

public class ZombieController {
    private List<ZombieObserver> observers;
    private Zombie currentZombie;

    private static ZombieController instance = null;

    private ZombieController() {
        observers = new ArrayList<>();
    }

    public static ZombieController getInstance() {
        if (instance == null) {
            instance = new ZombieController();
        }
        return instance;
    }

    public void registerObserver(ZombieObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(ZombieObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (ZombieObserver observer : observers) {
            observer.update(currentZombie);
        }
    }

    public void changeZombie(Zombie newZombie) {
        currentZombie = newZombie;
        notifyObservers();
    }
}
