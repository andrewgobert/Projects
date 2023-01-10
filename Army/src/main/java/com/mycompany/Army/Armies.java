/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Army;

import com.mycompany.Army.Generic.Employment;
import com.mycompany.Army.Classes.Army;
import java.util.Vector;
import java.lang.Exception;
import static org.apache.commons.lang3.StringUtils.isNumeric;

/**
 *
 * @author Andrew Gobert
 */
public class Armies {

    public static void main(String[] args) {
        Army army1 = new Army();
        Army army2 = new Army();
        Employment <Integer, Boolean> Employ1 = new Employment<Integer, Boolean>();
        Employment <Integer, Boolean> Employ2 = new Employment<Integer, Boolean>();
        boolean arm1 = false;
        boolean arm2 = false;
        int num1;
        int num2;
        try{
            if (args.length ==0 ){
                MyException m = new MyException("There's no arguments");
                throw m;
            }
            else{
                if (isNumeric(args[0]) == true){
                    num1 = Integer.parseInt(args[0]);
                    army1.setNum(num1);
                }
                else{
                    MyException m = new MyException("The argument isn't an integer");
                    throw m;
                }
                if (isNumeric(args[2]) == true){
                    num2 = Integer.parseInt(args[2]);
                    army2.setNum(num2);
                }
                else{
                    MyException m = new MyException("The argument isn't an integer");
                    throw m;
                }
                if (args[1] == "true" || args[1] == "false"){
                    arm1 = Boolean.parseBoolean(args[1]);
                    army1.setArm(arm1);
                }
                else{
                    MyException m = new MyException("The argument isn't boolean");
                    throw m;
                }
                if (args[3] == "true" || args[3] == "false"){
                    arm2 = Boolean.parseBoolean(args[1]);
                    army2.setArm(arm2);
                }
                else{
                    MyException m = new MyException("The argument isn't boolean");
                    throw m;
                }
                if (arm1 ==true && arm2 == false){
                    if (num2 < (num1*1.125))
                        System.out.print("The first army will win");
                    else
                        System.out.print("The second army will win");
                }
                else
                    if (arm2 ==true && arm1 == false){
                        if (num1 < (num2*1.125))
                            System.out.print("The second army will win");
                        else
                            System.out.print("The first army will win");
                    }
            }
        }
        catch(MyException e){
            e.printStackTrace();
        }
    }
}