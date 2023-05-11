/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author reemahassan
 */
public class ZombieDisplay implements ZombieObserver {
    private Zombie zombie;
    private Mediator mediator;

    public ZombieDisplay(ZombieController controller, Mediator mediator) {
        controller.registerObserver(this);
        this.mediator = mediator;
    }

    @Override
    public void update(Zombie zombie) {
        this.zombie = zombie;
        display();
    }

    @Override
    public void display() {
        String message = "Current Zombie: " + zombie.getType();
        System.out.println(message);
        mediator.notify(message);
    }
}
