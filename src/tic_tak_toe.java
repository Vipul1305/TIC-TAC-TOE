
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

public class tic_tak_toe extends javax.swing.JFrame {
    
    private String turn;
    private int totalBtn;
    private int xCount;
    private int oCount;
    
    public tic_tak_toe() {
        initComponents();
        turn = "O";
        totalBtn = 0;
        xCount = 0;
        oCount = 0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scoreO = new javax.swing.JLabel();
        scoreX = new javax.swing.JLabel();
        exitButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFocusableWindowState(false);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Button2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button2.setPreferredSize(new java.awt.Dimension(90, 90));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button1.setPreferredSize(new java.awt.Dimension(90, 90));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button3.setPreferredSize(new java.awt.Dimension(90, 90));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button5.setPreferredSize(new java.awt.Dimension(90, 90));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button4.setPreferredSize(new java.awt.Dimension(90, 90));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button6.setPreferredSize(new java.awt.Dimension(90, 90));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button9.setPreferredSize(new java.awt.Dimension(90, 90));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button7.setPreferredSize(new java.awt.Dimension(90, 90));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        Button8.setPreferredSize(new java.awt.Dimension(90, 90));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("OCR-A BT", 1, 48)); // NOI18N
        jLabel2.setText("SCORE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("OCR-A BT", 0, 24)); // NOI18N
        jLabel3.setText("Player X -");

        jLabel4.setFont(new java.awt.Font("OCR-A BT", 0, 24)); // NOI18N
        jLabel4.setText("Player 0 -");

        scoreO.setFont(new java.awt.Font("OCR-A BT", 0, 24)); // NOI18N
        scoreO.setText("0");

        scoreX.setFont(new java.awt.Font("OCR-A BT", 0, 24)); // NOI18N
        scoreX.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scoreO)
                    .addComponent(scoreX))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(scoreX))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(scoreO))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        exitButton.setBackground(new java.awt.Color(255, 0, 51));
        exitButton.setText("EXIT");
        exitButton.setPreferredSize(new java.awt.Dimension(110, 90));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(153, 255, 153));
        resetButton.setText("RESET");
        resetButton.setPreferredSize(new java.awt.Dimension(110, 90));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Aulternate Symbol
    private void alterTurn(){
        if (turn.equals("O")){
            turn = "X";
        }else{
            turn = "O";
        }
    }
    // method to change button
    private void buttonFuntion (JButton button){
        if (!(button.getText().equals(""))) return;
        button.setText(turn);
        if (button.getText().equals("O")){
            button.setForeground(Color.RED);
        }else{
            button.setForeground(Color.MAGENTA);
        }
        totalBtn++;
        checkWin();// after every press check for winner
        alterTurn();// and alter button
    }
    
    // if Player wins Updating Score Board
    private void perform(JButton buttonX, JButton buttonY, JButton buttonZ){
        buttonX.setBackground(Color.GREEN);
        buttonY.setBackground(Color.GREEN);
        buttonZ.setBackground(Color.GREEN);

        JOptionPane.showMessageDialog(this, "Player " + turn + " Wins!!", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);
        
        if (turn.equals("O")){
            oCount++;
        }else{
            xCount++;
        }
        updateScore();
    }
    
    //// Check win Function
    private void checkWin(){
        if (Button1.getText().equals(Button2.getText()) && Button2.getText().equals(Button3.getText()) && Button1.getText() != ""){
            perform(Button1,Button2, Button3);
        }else if (Button4.getText().equals(Button5.getText()) && Button5.getText().equals(Button6.getText()) && Button4.getText() != ""){
            perform(Button4,Button5, Button6);
        }else if (Button7.getText().equals(Button8.getText()) && Button8.getText().equals(Button9.getText()) && Button7.getText() != ""){
            perform(Button7,Button8, Button9);
        }else if (Button1.getText().equals(Button5.getText()) && Button5.getText().equals(Button9.getText()) && Button1.getText() != ""){
            perform(Button1,Button5, Button9);
        }else if (Button3.getText().equals(Button5.getText()) && Button5.getText().equals(Button7.getText()) && Button3.getText() != ""){
            perform(Button3,Button5, Button7);
        }else if (Button1.getText().equals(Button4.getText()) && Button4.getText().equals(Button7.getText()) && Button1.getText() != ""){
            perform(Button1,Button4, Button7);
        }else if (Button2.getText().equals(Button5.getText()) && Button5.getText().equals(Button8.getText()) && Button2.getText() != ""){
            perform(Button2,Button5, Button8);
        }else if (Button3.getText().equals(Button6.getText()) && Button6.getText().equals(Button9.getText()) && Button3.getText() != ""){
            perform(Button3,Button6, Button9);
        }else if (totalBtn == 9){ // game got draw
            JOptionPane.showMessageDialog(this, "Draw !", "TIC TAK TOE", JOptionPane.INFORMATION_MESSAGE);
            resetKey();
        }
    }
    //// Exit the game
    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        if (JOptionPane.showConfirmDialog(this, "Would you like to EXIT ?", "TIC TAC TOE", JOptionPane.YES_NO_OPTION )== JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        if (!(Button1.getText().equals(""))) return; // if button is already has same char
        Button1.setText(turn);
        if (Button1.getText().equals("O")){
            Button1.setForeground(Color.RED);
        }else{
            Button1.setForeground(Color.MAGENTA);
        }
        totalBtn++;// count to check for draw
        checkWin();
        alterTurn();
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
        if (!(Button2.getText().equals(""))) return;
        Button2.setText(turn);
        if (Button2.getText().equals("O")){
            Button2.setForeground(Color.RED);
        }else{
            Button2.setForeground(Color.MAGENTA);
        }
        totalBtn++;// count to check for draw
        checkWin();
        alterTurn();
        // after this button i have all upper commend in " buttonFunction(Button2)
    }//GEN-LAST:event_Button2ActionPerformed

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button3ActionPerformed
        // TODO add your handling code here:
        buttonFuntion(Button3);
    }//GEN-LAST:event_Button3ActionPerformed

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button4ActionPerformed
        // TODO add your handling code here:
        buttonFuntion(Button4);
    }//GEN-LAST:event_Button4ActionPerformed

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button5ActionPerformed
        // TODO add your handling code here:
        buttonFuntion(Button5);
    }//GEN-LAST:event_Button5ActionPerformed

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button6ActionPerformed
        // TODO add your handling code here:
        buttonFuntion(Button6);
    }//GEN-LAST:event_Button6ActionPerformed

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button7ActionPerformed
        // TODO add your handling code here:
        buttonFuntion(Button7);
    }//GEN-LAST:event_Button7ActionPerformed

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button8ActionPerformed
        // TODO add your handling code here:
        buttonFuntion(Button8);
    }//GEN-LAST:event_Button8ActionPerformed

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button9ActionPerformed
        // TODO add your handling code here:
        buttonFuntion(Button9);
    }//GEN-LAST:event_Button9ActionPerformed

    //// ReSet Functionality
    private void resetKey(){
        // clear all button text
        Button1.setText("");
        Button2.setText("");
        Button3.setText("");
        Button4.setText("");
        Button5.setText("");
        Button6.setText("");
        Button7.setText("");
        Button8.setText("");
        Button9.setText("");
        
        //change all button background to white
        Button1.setBackground(Color.white);
        Button2.setBackground(Color.white);
        Button3.setBackground(Color.white);
        Button4.setBackground(Color.white);
        Button5.setBackground(Color.white);
        Button6.setBackground(Color.white);
        Button7.setBackground(Color.white);
        Button8.setBackground(Color.white);
        Button9.setBackground(Color.white);
        totalBtn = 0;
    }
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        // TODO add your handling code here:
        resetKey();
    }//GEN-LAST:event_resetButtonActionPerformed

    // Updating Score Board
    private void updateScore(){
        scoreX.setText(String.valueOf(xCount));
        scoreO.setText(String.valueOf(oCount));
    }
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
            java.util.logging.Logger.getLogger(tic_tak_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic_tak_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic_tak_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic_tak_toe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic_tak_toe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel scoreO;
    private javax.swing.JLabel scoreX;
    // End of variables declaration//GEN-END:variables
}
