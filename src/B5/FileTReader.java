package B5;

/**
 *
 * @author TienDat
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileTReader implements Runnable {
    private String fileName;
    private frmRead_Write_Data frmMain;
    public FileTReader(String fileName, frmRead_Write_Data frmMain) {
        this.fileName = fileName;
        this.frmMain = frmMain;
    }
    @Override
    public synchronized void run() {
        frmMain.WriteTxtTask("Read "+fileName);
        BufferedReader bufferedReader = null;
        FileReader fileReader = null;
        try {
            //Đợi cho quá trình ghi file hoàn tất sau đó mới đọc file
            Thread.sleep(5);
            fileReader = new FileReader(new File(fileName));
            bufferedReader = new BufferedReader(fileReader);
            frmMain.WriteTxtDataOutput("[" + bufferedReader.readLine()+"]");
            
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally{
            if(bufferedReader != null){
                try {
                    bufferedReader.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileTReader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(fileReader != null){
                try {
                    fileReader.close();
                } catch (IOException ex) {
                    Logger.getLogger(FileTReader.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        }
    }
}
