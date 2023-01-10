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
public class base {
    private Vector<String> name = new Vector<String>();
    public String gname(int n){
        return name.get(n);
    }
    public void setBase(String Base, int n){
        name.set(n, Base);
    }
    public void addBase(String Base){
        name.add(Base);
    }
    public void removeBase(String Base){
        for (int i = 0; (name.get(i) != Base) && (i < name.size()); i++){
            if(name.get(i) == Base)
                name.remove(i);
        }
    }
}
