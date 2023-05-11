/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author reemahassan
 */
public abstract class Zombie {
    protected String type;

    public String getType() {
        return type;
    }
}

class FastZombie extends Zombie {
    public FastZombie() {
        type = "Fast Zombie";
    }
}

class SlowZombie extends Zombie {
    public SlowZombie() {
        type = "Slow Zombie";
    }
}


