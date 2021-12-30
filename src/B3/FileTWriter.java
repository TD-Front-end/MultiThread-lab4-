
package B3;

/**
 *
 * @author TienDat
 */
import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class FileTWriter extends Thread{
    private static final int xsize=10;
    private int x;
    private String name;
    
    public FileTWriter(String ten){
    this.name=ten;
    }
    
    public  void start(){
        try {
            FileWriter fw= new FileWriter(name);
            BufferedWriter bw= new BufferedWriter(fw);
            Random rd = new Random();
            for(int i=0;i<=xsize;i++)
            {
                   x= rd.nextInt(xsize);
                   if(i==9)
                       bw.write(String.valueOf(x));
                   else
                       bw.write(String.valueOf(x)+",");
            }
            bw.close();
            fw.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(),"Thông báo lỗi!",JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
