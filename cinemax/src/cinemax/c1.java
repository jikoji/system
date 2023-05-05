package cinemax;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.parser.ParseException;

public class c1 extends javax.swing.JFrame {


 

    public c1() throws IOException, FileNotFoundException, ParseException {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd1 = new javax.swing.JLabel();
        jt1 = new javax.swing.JButton();
        jt2 = new javax.swing.JButton();
        jt3 = new javax.swing.JButton();
        jt4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jd2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jt5 = new javax.swing.JButton();
        jt6 = new javax.swing.JButton();
        jt7 = new javax.swing.JButton();
        jt8 = new javax.swing.JButton();
        jd3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jt9 = new javax.swing.JButton();
        jt10 = new javax.swing.JButton();
        jt11 = new javax.swing.JButton();
        jt12 = new javax.swing.JButton();
        jd4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jt13 = new javax.swing.JButton();
        jt14 = new javax.swing.JButton();
        jt15 = new javax.swing.JButton();
        jt16 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jd1.setText("Sunday, 21 May 2023");

        jt1.setText("10:00 AM");
        jt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt1ActionPerformed(evt);
            }
        });

        jt2.setText("01:00 PM");

        jt3.setText("04:00 PM");

        jt4.setText("7:00 PM");

        jLabel2.setText("IMAX");

        jd2.setText("Monday, 22 May 2023");

        jLabel4.setText("IMAX");

        jt5.setText("10:00 AM");

        jt6.setText("01:00 PM");

        jt7.setText("04:00 PM");

        jt8.setText("7:00 PM");

        jd3.setText("Tuesday, 23 May 2023");

        jLabel5.setText("IMAX");

        jt9.setText("10:00 AM");

        jt10.setText("01:00 PM");

        jt11.setText("04:00 PM");

        jt12.setText("7:00 PM");

        jd4.setText("Wednesday, 24 May 2023");

        jLabel6.setText("IMAX");

        jt13.setText("10:00 AM");

        jt14.setText("01:00 PM");

        jt15.setText("04:00 PM");

        jt16.setText("7:00 PM");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jd1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jd4)
                            .addComponent(jLabel5)
                            .addComponent(jd3)
                            .addComponent(jLabel4)
                            .addComponent(jd2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt14))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt6))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jt1)
                                .addGap(189, 189, 189)
                                .addComponent(jt2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt3)
                                .addGap(168, 168, 168)
                                .addComponent(jt4))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jt15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jt16)))
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jd1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt1)
                    .addComponent(jt2)
                    .addComponent(jt3)
                    .addComponent(jt4))
                .addGap(41, 41, 41)
                .addComponent(jd2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt5)
                    .addComponent(jt6)
                    .addComponent(jt7)
                    .addComponent(jt8))
                .addGap(52, 52, 52)
                .addComponent(jd3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt9)
                    .addComponent(jt10)
                    .addComponent(jt11)
                    .addComponent(jt12))
                .addGap(47, 47, 47)
                .addComponent(jd4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jt13)
                    .addComponent(jt14)
                    .addComponent(jt15)
                    .addComponent(jt16))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt1ActionPerformed
          
    
     new info().setVisible(true);
     dispose();
     
     
    }//GEN-LAST:event_jt1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(c1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try { 
                    new c1().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(c1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ParseException ex) {
                    Logger.getLogger(c1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jd1;
    private javax.swing.JLabel jd2;
    private javax.swing.JLabel jd3;
    private javax.swing.JLabel jd4;
    private javax.swing.JButton jt1;
    private javax.swing.JButton jt10;
    private javax.swing.JButton jt11;
    private javax.swing.JButton jt12;
    private javax.swing.JButton jt13;
    private javax.swing.JButton jt14;
    private javax.swing.JButton jt15;
    private javax.swing.JButton jt16;
    private javax.swing.JButton jt2;
    private javax.swing.JButton jt3;
    private javax.swing.JButton jt4;
    private javax.swing.JButton jt5;
    private javax.swing.JButton jt6;
    private javax.swing.JButton jt7;
    private javax.swing.JButton jt8;
    private javax.swing.JButton jt9;
    // End of variables declaration//GEN-END:variables
}
