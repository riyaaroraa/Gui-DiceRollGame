package GUI;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riyaarora
 */
public class Instructions extends javax.swing.JFrame {

    /**
     * Creates new form Instructions
     */
    public Instructions() {
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

        title = new javax.swing.JLabel();
        Instruction1 = new javax.swing.JLabel();
        Instruction2 = new javax.swing.JLabel();
        Instruction3 = new javax.swing.JLabel();
        Instruction4 = new javax.swing.JLabel();
        Instruction5 = new javax.swing.JLabel();
        Instruction = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 367));
        setSize(new java.awt.Dimension(550, 367));
        getContentPane().setLayout(null);

        title.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Instructions");
        getContentPane().add(title);
        title.setBounds(210, 10, 140, 40);

        Instruction1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Instruction1.setForeground(new java.awt.Color(255, 255, 255));
        Instruction1.setText("You will roll a set of dice by pressing the roll button,");
        getContentPane().add(Instruction1);
        Instruction1.setBounds(20, 130, 460, 20);

        Instruction2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Instruction2.setForeground(new java.awt.Color(255, 255, 255));
        Instruction2.setText("The computer will also role a set of dice at the same time.");
        getContentPane().add(Instruction2);
        Instruction2.setBounds(20, 160, 510, 20);

        Instruction3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Instruction3.setForeground(new java.awt.Color(255, 255, 255));
        Instruction3.setText("The highest value of the two rolls will be the winner.");
        getContentPane().add(Instruction3);
        Instruction3.setBounds(20, 190, 470, 20);

        Instruction4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Instruction4.setForeground(new java.awt.Color(255, 255, 255));
        Instruction4.setText("The best of 11 rolls wins. Ties go to the player.");
        getContentPane().add(Instruction4);
        Instruction4.setBounds(20, 220, 420, 20);

        Instruction5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Instruction5.setForeground(new java.awt.Color(255, 255, 255));
        Instruction5.setText("Good Luck!");
        getContentPane().add(Instruction5);
        Instruction5.setBounds(20, 250, 110, 20);

        Instruction.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        Instruction.setForeground(new java.awt.Color(255, 255, 255));
        Instruction.setText("How to Play:");
        getContentPane().add(Instruction);
        Instruction.setBounds(20, 100, 110, 20);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(30, 310, 75, 29);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, -1, 550, 367);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        java.awt.EventQueue.invokeLater(() -> {//go to intro
            new IntroPage().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instructions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Instruction;
    private javax.swing.JLabel Instruction1;
    private javax.swing.JLabel Instruction2;
    private javax.swing.JLabel Instruction3;
    private javax.swing.JLabel Instruction4;
    private javax.swing.JLabel Instruction5;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
