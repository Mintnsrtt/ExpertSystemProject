/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ES;

import java.awt.Toolkit;

/**
 *
 * @author Asus
 */
public class ชาย_ยาว extends javax.swing.JFrame {

    /**
     * Creates new form ชาย_ยาว
     */
    public ชาย_ยาว() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        แสกกลาง = new javax.swing.JRadioButton();
        ย้อนกลับ = new javax.swing.JButton();
        ต่อไป = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expert system of hairstyles evolution since the past until the present.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("DSU_MonTaNa", 1, 48)); // NOI18N
        jLabel1.setText("ผมยาว");

        แสกกลาง.setFont(new java.awt.Font("DSU_MaiThai", 0, 24)); // NOI18N
        แสกกลาง.setText("แสกกลาง");
        แสกกลาง.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                แสกกลางActionPerformed(evt);
            }
        });

        ย้อนกลับ.setFont(new java.awt.Font("DSU_MaiThai", 1, 18)); // NOI18N
        ย้อนกลับ.setText("ย้อนกลับ");
        ย้อนกลับ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ย้อนกลับActionPerformed(evt);
            }
        });

        ต่อไป.setFont(new java.awt.Font("DSU_MaiThai", 1, 18)); // NOI18N
        ต่อไป.setText("ต่อไป");
        ต่อไป.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ต่อไปActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(352, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(แสกกลาง)
                    .addComponent(jLabel1))
                .addGap(348, 348, 348))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(ย้อนกลับ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ต่อไป, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(แสกกลาง)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ย้อนกลับ)
                    .addComponent(ต่อไป))
                .addGap(37, 37, 37))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ย้อนกลับActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ย้อนกลับActionPerformed
         new เพศชาย().setVisible(true);
        dispose();
    }//GEN-LAST:event_ย้อนกลับActionPerformed

    private void แสกกลางActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_แสกกลางActionPerformed
        if(แสกกลาง.isSelected()) {
        }
    }//GEN-LAST:event_แสกกลางActionPerformed

    private void ต่อไปActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ต่อไปActionPerformed
        if(แสกกลาง.isSelected()){
            new ชาย_ยาว_มวยผมไว้หลังท้ายทอย().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_ต่อไปActionPerformed

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
            java.util.logging.Logger.getLogger(ชาย_ยาว.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ชาย_ยาว.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ชาย_ยาว.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ชาย_ยาว.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ชาย_ยาว().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ต่อไป;
    private javax.swing.JButton ย้อนกลับ;
    private javax.swing.JRadioButton แสกกลาง;
    // End of variables declaration//GEN-END:variables
}
