/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B5;

/**
 *
 * @author TienDat
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileTWrite implements Runnable{
    private String fileName;
    private String Text;
    private frmRead_Write_Data frmMain;
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public FileTWrite(String fileName, String Text, frmRead_Write_Data frmMain) {
        this.fileName = fileName;
        this.Text = Text;
        this.frmMain = frmMain;
    }
    @Override
    public synchronized void run() {
        frmMain.WriteTxtTask("Write "+fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(new File(this.getFileName()));
            bufferedWriter = new BufferedWriter(fileWriter);         
            bufferedWriter.write(Text);
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally{           
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileTWrite.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileTWrite.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
