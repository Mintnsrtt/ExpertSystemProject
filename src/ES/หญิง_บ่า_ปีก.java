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
public class หญิง_บ่า_ปีก extends javax.swing.JFrame {

    /**
     * Creates new form หญิง_บ่า_ปีก
     */
    public หญิง_บ่า_ปีก() {
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        ย้อนกลับ = new javax.swing.JButton();
        หน้าแรก = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expert system of hairstyles evolution since the past until the present.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("DSU_MonTaNa", 1, 42)); // NOI18N
        jLabel1.setText("สมัยอยุธยาตอนกลาง ถึง รัตนโกสินทร์ รัชกาลที่ ๔");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ES/บ่า-ปีก.png"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DSU_MaiThai", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("       ช่วง พ.ศ.๒๑๗๓ - ๒๒๗๕ สตรีในสำนักไว้ผมแบบหญิง\nพม่าและล้านนาไทย ส่วนหญิงชาวบ้านตัดผมสั้นตอนบน\nแล้วถอนไรผมรอบๆ ผมตอนที่ถัดลงมาไว้ยาวประบ่า เรียก\nว่า \"ผมปีก\" ");
        jScrollPane1.setViewportView(jTextArea1);

        ย้อนกลับ.setFont(new java.awt.Font("DSU_MaiThai", 1, 18)); // NOI18N
        ย้อนกลับ.setText("ย้อนกลับ");
        ย้อนกลับ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ย้อนกลับActionPerformed(evt);
            }
        });

        หน้าแรก.setFont(new java.awt.Font("DSU_MaiThai", 1, 18)); // NOI18N
        หน้าแรก.setText("หน้าแรก");
        หน้าแรก.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                หน้าแรกActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(ย้อนกลับ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(หน้าแรก))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ย้อนกลับ)
                    .addComponent(หน้าแรก))
                .addGap(49, 49, 49))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void หน้าแรกActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_หน้าแรกActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_หน้าแรกActionPerformed

    private void ย้อนกลับActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ย้อนกลับActionPerformed
        new หญิง_บ่า().setVisible(true);
        dispose();
    }//GEN-LAST:event_ย้อนกลับActionPerformed

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
            java.util.logging.Logger.getLogger(หญิง_บ่า_ปีก.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(หญิง_บ่า_ปีก.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(หญิง_บ่า_ปีก.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(หญิง_บ่า_ปีก.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new หญิง_บ่า_ปีก().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton ย้อนกลับ;
    private javax.swing.JButton หน้าแรก;
    // End of variables declaration//GEN-END:variables
}
