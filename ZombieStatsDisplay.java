/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author reemahassan
 */
public class ZombieStatsDisplay implements ZombieObserver {
    private int fastZombieCount;
    private int slowZombieCount;
    private Mediator mediator;

    public ZombieStatsDisplay(ZombieController controller, Mediator mediator) {
        controller.registerObserver(this);
        this.mediator = mediator;
    }

    @Override
    public void update(Zombie zombie) {
        if (zombie instanceof FastZombie) {
            fastZombieCount++;
        } else if (zombie instanceof SlowZombie) {
            slowZombieCount++;
        }
        display();
    }

    @Override
    public void display() {
        String message = "Fast Zombies: " + fastZombieCount + ", Slow Zombies: " + slowZombieCount;
        System.out.println(message);
        mediator.notify(message);
    }
}