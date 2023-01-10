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
public abstract class platoon extends Soldier {
    private Vector <String> name = new Vector<String>();
    public String gname(int n){
        return this.name.get(n);
    }
    public void setName(String platoon, int n){
        this.name.set(n, platoon);
    }
    public void addPlatoon(){
        this.name.add("");
    }
    public void removePlatoon(String Base){
        for (int i = 0; (name.get(i) != Base) && (i < name.size()); i++){
            if(name.get(i) == Base)
                name.remove(i);
        }
    }
}
