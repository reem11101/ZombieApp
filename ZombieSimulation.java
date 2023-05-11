/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author reemahassan
 */
public class ZombieSimulation {
    public static void main(String[] args) {
        ZombieController controller = ZombieController.getInstance();
        ZombieMediator mediator = new ZombieMediator();

        ZombieDisplay display = new ZombieDisplay(controller, mediator);
        ZombieStatsDisplay statsDisplay = new ZombieStatsDisplay(controller, mediator);

        OtherClass otherClass1 = new OtherClass("OtherClass1");
        OtherClass otherClass2 = new OtherClass("OtherClass2");

        mediator.registerOtherClass(otherClass1);
        mediator.registerOtherClass(otherClass2);

        controller.changeZombie(new FastZombie());
        controller.changeZombie(new SlowZombie());
        controller.changeZombie(new FastZombie());
    }
}


