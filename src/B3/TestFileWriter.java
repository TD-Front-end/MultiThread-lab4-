
package B3;

import javax.swing.JFileChooser;
import java.io.File; 
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author TienDat
 */
public class TestFileWriter extends javax.swing.JFrame {

    /**
     * Creates new form TestFileWriter
     */
    public TestFileWriter() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jLabel1 = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        btnBrower = new javax.swing.JButton();
        btnStart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Lưu 3 tệp tin");

        txtPath.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnBrower.setBackground(new java.awt.Color(153, 255, 153));
        btnBrower.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBrower.setText("Browser");
        btnBrower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowerActionPerformed(evt);
            }
        });

        btnStart.setBackground(new java.awt.Color(153, 255, 153));
        btnStart.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnStart.setText("Thực hiện");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBrower, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrower))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnStart)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBrowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowerActionPerformed
        //chọn đường dẫn
    JFileChooser chooser = new JFileChooser();
    String choosefile ="";
    chooser = new JFileChooser(); 
    chooser.setCurrentDirectory(new java.io.File("."));
    chooser.setDialogTitle(choosefile);
    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    // vô hiệu hóa tùy chọn "Tất cả các tệp".
    chooser.setAcceptAllFileFilterUsed(false);
    //    
    if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) 
    { 
       txtPath.setText( chooser.getSelectedFile().toString());
       System.out.println("getSelectedFile() : " +  chooser.getSelectedFile());
    }
    else {
      System.out.println("No Selection ");
      }
    }//GEN-LAST:event_btnBrowerActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        //bắt dầu dghi file
        if (txtPath.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Bạn chưa chọn thư mục!!");
        } else {

            try {
                String path = txtPath.getText();
                FileTWriter f1 = new FileTWriter(path + "\\file1.txt");
                f1.start();
                FileTWriter f2 = new FileTWriter(path + "\\file2.txt");
                f2.start();
                FileTWriter f3 = new FileTWriter(path + "\\file3.txt");
                f3.start();
                JOptionPane.showMessageDialog(null, "Ghi file thành công vào: " + path);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ghi file Thất bại rồi!! Mã lỗi:  " + e);
            }
        }     // TODO add your handling code here:
    }//GEN-LAST:event_btnStartActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TestFileWriter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestFileWriter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestFileWriter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestFileWriter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestFileWriter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrower;
    private javax.swing.JButton btnStart;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}
