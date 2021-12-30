/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B4;

/**
 *
 * @author TienDat
 */
public class Main {
    public static void main(String[] args) {
        FileRead r1 = new FileRead("D:\\THlaptrinhmangmt\\path\\file1.txt");
        r1.start();
        FileRead r2 = new FileRead("D:\\THlaptrinhmangmt\\path\\file2.txt");
        r2.start();
        FileRead r3 = new FileRead("D:\\THlaptrinhmangmt\\path\\file3.txt");
        r3.start();
    }
    
}
