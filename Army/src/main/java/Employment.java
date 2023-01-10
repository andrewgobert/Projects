/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Andrew Gobert
 */
public class Employment<T, V> {
    private T Num;
    private V Platoon;
    
    public void setNum(T addNum){
        Num = addNum;
    }
    public T getNum(){
        return Num;
    }
    
    public void setPlatoon(V setPlat){
        Platoon = setPlat;
    }
    public V getPlatoon(){
        return Platoon;
    }
}
