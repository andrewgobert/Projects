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
public class Carrier extends Ship {
    private String[] weapon = new String[3];
    private Vector<String> members = new Vector<String>(0);
    private Vector<String> Position = new Vector<String>(0);
    
    public void setWeapon(String weapon, int n){
        this.weapon[n] = weapon;
    }
    public String getWeapon(int n){
        return this.weapon[n];
    }
    public void setMember(String Member, String Position, int n){
        this.members.add(Member);
        this.Position.add(Position);
        setCrew();
    }
}
