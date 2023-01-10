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
public class Cargo extends Plane {
    Vector <String> Cargo = new Vector<String>();
    Vector <Integer> Quantity = new Vector<Integer>();
    
    void setCargo(String Item, int quantity){
        this.Cargo.add(Item);
        this.Quantity.add(quantity);
    }
    String getCargo(int n){
        return this.Cargo.get(n);
    }
    int getQuantity(int n){
        return this.Quantity.get(n);
    }
}
