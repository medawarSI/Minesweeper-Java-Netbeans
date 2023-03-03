/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package minesweeper;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Omar
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        updateUI();
    }
    Color grey192 = new Color(192,192,192);
    Color black92 = new Color(92,92,92);
    ImageIcon GenericBackground500x500 = new ImageIcon("src/minesweeper/resources/Generic-Background-500x500.png");
    ImageIcon GenericBackgroundDark500x500 = new ImageIcon("src/minesweeper/resources/Generic-Background-DM-500x500.png");
    ImageIcon Bliss = new ImageIcon("src/minesweeper/resources/bliss.jpg");
    ImageIcon msWallpaper = new ImageIcon("src/minesweeper/resources/msWallpaper.jpg");
    ImageIcon Welcome = new ImageIcon("src/minesweeper/resources/welcome.png");
    ImageIcon WelcomeDark = new ImageIcon("src/minesweeper/resources/welcome-DM.png");
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startGameBtn = new java.awt.Button();
        settingsBtn = new java.awt.Button();
        welcomeLabel = new javax.swing.JLabel();
        exitBtn = new java.awt.Button();
        mainMenuBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        startGameBtn.setBackground(new java.awt.Color(192, 192, 192));
        startGameBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        startGameBtn.setForeground(new java.awt.Color(92, 92, 92));
        startGameBtn.setLabel("Start Game");
        startGameBtn.setMaximumSize(new java.awt.Dimension(120, 50));
        startGameBtn.setMinimumSize(new java.awt.Dimension(120, 50));
        startGameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameBtnActionPerformed(evt);
            }
        });

        settingsBtn.setBackground(new java.awt.Color(192, 192, 192));
        settingsBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        settingsBtn.setForeground(new java.awt.Color(92, 92, 92));
        settingsBtn.setLabel("Settings");
        settingsBtn.setMaximumSize(new java.awt.Dimension(120, 50));
        settingsBtn.setMinimumSize(new java.awt.Dimension(120, 50));
        settingsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsBtnActionPerformed(evt);
            }
        });

        welcomeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minesweeper/resources/Welcome.png"))); // NOI18N

        exitBtn.setBackground(new java.awt.Color(192, 192, 192));
        exitBtn.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(92, 92, 92));
        exitBtn.setLabel("Exit");
        exitBtn.setMaximumSize(new java.awt.Dimension(120, 50));
        exitBtn.setMinimumSize(new java.awt.Dimension(120, 50));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        mainMenuBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minesweeper/resources/Generic-Background-500x500.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(190, 190, 190)
                            .addComponent(startGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(mainMenuBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(293, 293, 293)
                            .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(213, 213, 213)
                            .addComponent(startGameBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(mainMenuBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startGameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameBtnActionPerformed
        normalv5 n = new normalv5();
        this.dispose();
        n.setVisible(true);
    }//GEN-LAST:event_startGameBtnActionPerformed

    private void settingsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsBtnActionPerformed
        Settings n = new Settings();
        this.dispose();
        n.setVisible(true);
    }//GEN-LAST:event_settingsBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        StartScreen n = new StartScreen();
        this.dispose();
        n.setVisible(true);
    }//GEN-LAST:event_exitBtnActionPerformed
    private void updateUI(){
        if(Minesweeper.isDarkMode){
            welcomeLabel.setIcon(WelcomeDark);
            startGameBtn.setBackground(black92);
            settingsBtn.setBackground(black92);
            exitBtn.setBackground(black92);
            startGameBtn.setForeground(grey192);
            settingsBtn.setForeground(grey192);
            exitBtn.setForeground(grey192);
        }
        else {
            welcomeLabel.setIcon(Welcome);
            startGameBtn.setBackground(grey192);
            settingsBtn.setBackground(grey192);
            exitBtn.setBackground(grey192);
            startGameBtn.setForeground(black92);
            settingsBtn.setForeground(black92);
            exitBtn.setForeground(black92);
        }
        if(Minesweeper.isDarkMode && Minesweeper.wallpaper.equals("Default"))
            mainMenuBackground.setIcon(GenericBackgroundDark500x500);
        else if (Minesweeper.isDarkMode == false && Minesweeper.wallpaper.equals("Default"))
            mainMenuBackground.setIcon(GenericBackground500x500);
        else if (Minesweeper.wallpaper.equals("Bliss"))
            mainMenuBackground.setIcon(Bliss);
        else if (Minesweeper.wallpaper.equals("Minesweeper Art"))
            mainMenuBackground.setIcon(msWallpaper);
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button exitBtn;
    private javax.swing.JLabel mainMenuBackground;
    private java.awt.Button settingsBtn;
    private java.awt.Button startGameBtn;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables
}