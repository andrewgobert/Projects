/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

/**
 *
 * @author Andrew Gobert
 */
public class Army extends platoon {
    private String name;
    public String gname(){
        return this.name;
    }
    public void setName(String army){
        this.name = army;
    }

    @Override
    public void addNum() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}