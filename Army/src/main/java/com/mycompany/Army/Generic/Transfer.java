/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Generic;

/**
 *
 * @author Andrew Gobert
 */
public class Transfer <x,y> {
    private x platoon;
    private y base;
    
    public void setPlatoon(x Plat){
        platoon = Plat;
    }
    public x getPlatoon(){
        return platoon;
    }
    public void setBase(y Base){
        base = Base;
    }
    public y getBase(){
        return base;
    }
}
