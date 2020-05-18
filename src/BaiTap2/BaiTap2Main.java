/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author ltpnt
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder s = new MyStringBuilder.Builder("lethanhphuong").addString("59cntt3").addFloat(1999).addBool(true).build();
        s.xuatChuoi();
    }
    
}
