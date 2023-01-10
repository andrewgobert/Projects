/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Classes;

import com.mycompany.Army.Interfaces.Recruitment;
import com.mycompany.Army.Classes.base;
import java.io.*;
import java.util.Vector;

/**
 *
 * @author Andrew Gobert
 */
public abstract class Soldier extends base implements Recruitment{
    protected boolean armor = false;
    protected int num;
    private Vector <String> platoon = new Vector<String>();
    
    public boolean getArm(){
        return this.armor;
    }
    public int getNum(){
        return this.num;
    }
    public void setNum (int Num){
        this.num = Num;
    }
    public void setArm (boolean set){
        this.armor = set;
    }
    public void addNum(String Plat){
        num++;
        platoon.add(Plat);
    }
}
