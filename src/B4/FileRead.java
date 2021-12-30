/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B4;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author TienDat
 */
public class FileRead extends Thread{
    String name;
    public FileRead(String name){
        this.name = name;
    }
    public void start(){
        try {
            FileReader fr = new FileReader(name);
            BufferedReader br = new BufferedReader(fr);
            int ch;
            while((ch = br.read())!= -1){
                System.out.println(this.name+":"+(char)ch+"\n");
            }
            br.close();
            fr.close();  
            JOptionPane.showMessageDialog(null, "Thành công");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), " thông báo lỗi!", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
}
