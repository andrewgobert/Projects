/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

/**
 *
 * @author Andrew Gobert
 */
public class Warthog extends Plane {
    private String[] weapon = new String[3];
    
    public void setWeapon(String weapon, int n){
        this.weapon[n] = weapon;
    }
    public String getWeapon(int n){
        return this.weapon[n];
    }
}
