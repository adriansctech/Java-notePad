/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notepad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author adrian
 */
public class notePad extends javax.swing.JFrame {

    /**
     * Creates new form notePad
     */
    
    //String for text
    private String text;
    //Filechooser
    private final JFileChooser fc; 
    //Filter for filechooserSave
    private FileNameExtensionFilter filter;
    
    private FileWriter fw;
    private FileReader fr;
    private File file;
    private BufferedReader br;
    
    
    public notePad() {
        initComponents();
        //Center JFrame
        setLocationRelativeTo(null);
        fc = new JFileChooser();
        filter = new FileNameExtensionFilter("txt", "txt", "text");
        //Aply filter to save text only in .txt format
        fc.setFileFilter(filter);  
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textAreaJpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtextMessage = new javax.swing.JTextArea();
        actionsJpanel = new javax.swing.JPanel();
        saveJbutton = new javax.swing.JButton();
        openJbutton = new javax.swing.JButton();
        clearTextJbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotePad");
        setResizable(false);

        textAreaJpanel.setBackground(new java.awt.Color(210, 210, 210));
        textAreaJpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jtextMessage.setColumns(20);
        jtextMessage.setRows(5);
        jScrollPane1.setViewportView(jtextMessage);

        javax.swing.GroupLayout textAreaJpanelLayout = new javax.swing.GroupLayout(textAreaJpanel);
        textAreaJpanel.setLayout(textAreaJpanelLayout);
        textAreaJpanelLayout.setHorizontalGroup(
            textAreaJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAreaJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        textAreaJpanelLayout.setVerticalGroup(
            textAreaJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(textAreaJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );

        actionsJpanel.setBackground(new java.awt.Color(212, 212, 212));
        actionsJpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Accions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        saveJbutton.setText("Save");
        saveJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveJbuttonActionPerformed(evt);
            }
        });

        openJbutton.setText("Open");
        openJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openJbuttonActionPerformed(evt);
            }
        });

        clearTextJbutton.setText("Clear Text");
        clearTextJbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTextJbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actionsJpanelLayout = new javax.swing.GroupLayout(actionsJpanel);
        actionsJpanel.setLayout(actionsJpanelLayout);
        actionsJpanelLayout.setHorizontalGroup(
            actionsJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(saveJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(openJbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(clearTextJbutton)
                .addContainerGap())
        );
        actionsJpanelLayout.setVerticalGroup(
            actionsJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionsJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actionsJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveJbutton)
                    .addComponent(openJbutton)
                    .addComponent(clearTextJbutton))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textAreaJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionsJpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textAreaJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(actionsJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveJbuttonActionPerformed
        //Show saveDialog
        int returnVal = fc.showSaveDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            try {                
                //Create a file
                file = new File(fc.getSelectedFile().getAbsolutePath());
                //Create a filewriter
                fw = new FileWriter(fc.getSelectedFile().getAbsolutePath()+".txt");
                //Write a text
                fw.write(text = jtextMessage.getText());
                //Close filewriter
                fw.close();
                //Show jOption pane to confirm all is ok
                JOptionPane.showMessageDialog(null, "The file is save correctly");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Any error has ocurred");
            }
            
        }    
        
    }//GEN-LAST:event_saveJbuttonActionPerformed

    private void clearTextJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTextJbuttonActionPerformed
        jtextMessage.setText("");
    }//GEN-LAST:event_clearTextJbuttonActionPerformed

    private void openJbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openJbuttonActionPerformed
        //Show openDialog
        int returnVal =fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            try {
                //Create a fileReader
                fr = new FileReader (fc.getSelectedFile().getAbsolutePath());
                //Create a BufferReader
                br = new BufferedReader(fr);
                try {
                    //While the file have a text read 
                    while((text=br.readLine())!=null){
                        //Put the String of the file in textArea
                        jtextMessage.setText(text);
                    }
                    //Close buffered
                    br.close();
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(null, "Any error has ocurred");
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Any error has ocurred");
            }
        
        
        }
    }//GEN-LAST:event_openJbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(notePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(notePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(notePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(notePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new notePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionsJpanel;
    private javax.swing.JButton clearTextJbutton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtextMessage;
    private javax.swing.JButton openJbutton;
    private javax.swing.JButton saveJbutton;
    private javax.swing.JPanel textAreaJpanel;
    // End of variables declaration//GEN-END:variables
}
