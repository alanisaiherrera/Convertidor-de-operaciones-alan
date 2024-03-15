/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conversiones_V1;
import java.lang.Integer;
/**
 *
 * @author theal
 */
public class Conversion {
    public String inToHex(int n){
    return Integer.toHexString(n).toUpperCase();
}
    public String inToBin(int n){
    return Integer.toBinaryString(n);
    }
    public String inToOct(int n){
    return Integer.toOctalString(n);
    }
}
