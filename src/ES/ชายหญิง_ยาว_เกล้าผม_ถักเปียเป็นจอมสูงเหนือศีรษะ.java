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
public class ชายหญิง_ยาว_เกล้าผม_ถักเปียเป็นจอมสูงเหนือศีรษะ extends javax.swing.JFrame {

    /**
     * Creates new form ชายหญิง_ยาว_เกล้า_ถักเปียเป็นจอมสูงเหนือศีรษะ
     */
    public ชายหญิง_ยาว_เกล้าผม_ถักเปียเป็นจอมสูงเหนือศีรษะ() {
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

        ย้อนกลับ = new javax.swing.JButton();
        หน้าแรก = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Expert system of hairstyles evolution since the past until the present.");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        setResizable(false);

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

        jLabel1.setFont(new java.awt.Font("DSU_MonTaNa", 1, 48)); // NOI18N
        jLabel1.setText("สมัยทวารวดี");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ES/ยาว-เกล้า-เปีย.jpg"))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("DSU_MaiThai", 0, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("       ช่วงพุทธศตวรรษที่ ๑๑ - ๑๖ จากการศึกษา\nประติมากรรมบุรุษนิยมไว้ผมยาวแล้วเกล้ามวยผม\nไว้ด้านหลังศีรษะ  บนศีรษะมีการประดับผมทั้งเพื่อ\nความสวยงาม แสดงฐานันดรศักดิ์ และอาจมีการ\nทักเปียยกสูงมั่นเป็น");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(ย้อนกลับ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(หน้าแรก)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ย้อนกลับ)
                    .addComponent(หน้าแรก))
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ย้อนกลับActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ย้อนกลับActionPerformed
        new ชายหญิง_ยาว_เกล้าผม().setVisible(true);
        dispose();
    }//GEN-LAST:event_ย้อนกลับActionPerformed

    private void หน้าแรกActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_หน้าแรกActionPerformed
        new Home().setVisible(true);
        dispose();
    }//GEN-LAST:event_หน้าแรกActionPerformed

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
            java.util.logging.Logger.getLogger(ชายหญิง_ยาว_เกล้าผม_ถักเปียเป็นจอมสูงเหนือศีรษะ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ชายหญิง_ยาว_เกล้าผม_ถักเปียเป็นจอมสูงเหนือศีรษะ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ชายหญิง_ยาว_เกล้าผม_ถักเปียเป็นจอมสูงเหนือศีรษะ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ชายหญิง_ยาว_เกล้าผม_ถักเปียเป็นจอมสูงเหนือศีรษะ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ชายหญิง_ยาว_เกล้าผม_ถักเปียเป็นจอมสูงเหนือศีรษะ().setVisible(true);
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
