/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

import java.util.Vector;

/**
 *
 * @author Andrew Gobert
 */
public class Fighter extends Plane {
    Vector <String> weapons = new Vector<String>();
    
    public void setWeapon(String weapon){
        this.weapons.add(weapon);
    }
    public String getWeapon(int n){
        return this.weapons.get(n);
    }
}
