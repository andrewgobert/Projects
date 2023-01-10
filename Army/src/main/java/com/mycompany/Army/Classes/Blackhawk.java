/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

/**
 *
 * @author Andrew Gobert
 */
public class Blackhawk extends Helicopter {
    int passangers;
    String gunner[] = new String [2];
    void setPassangers(int passangers){
        this.passangers = passangers;
    }
    void setGunner(String gunner, int position){
        this.gunner[position] = gunner;
    }
    int getPassangers(){
        return passangers;
    }
    String getGunner(int position){
        return gunner[position];
    }
}
