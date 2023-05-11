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

public class ZombieMediator implements Mediator {
    private List<OtherClass> otherClasses;

    public ZombieMediator() {
        otherClasses = new ArrayList<>();
    }

    public void registerOtherClass(OtherClass otherClass) {
        otherClasses.add(otherClass);
    }

    @Override
    public void notify(String message) {
        for (OtherClass otherClass : otherClasses) {
            otherClass.receiveNotification(message);
        }
    }
}

