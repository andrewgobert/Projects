/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Army.Generic;

import java.util.Vector;

/**
 *
 * @author Andrew Gobert
 */
public class Employment <a, b> {
    a number;
    b armor;
    void setEmployment(a number, b armor){
        this.number = number;
        this.armor = armor;
    }
    a getNumber(){
        return this.number;
    }
    b getArmor(){
        return this.armor;
    }
}
