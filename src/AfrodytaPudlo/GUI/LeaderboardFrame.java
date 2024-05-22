/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfrodytaPudlo.GUI;

import static AfrodytaPudlo.Main.importRegistration;
import AfrodytaPudlo.ScoreMap;
import AfrodytaPudlo.TeamList;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class LeaderboardFrame extends javax.swing.JFrame {

    CardLayout cardLayout;

    public LeaderboardFrame() {
        initComponents();
        leaderboard();
        cardLayout = (CardLayout) (jPanelMain.getLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonSoftwareDevelopment = new javax.swing.JButton();
        jButtonNetworking = new javax.swing.JButton();
        jButton3WebDesign = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jPanelMain = new javax.swing.JPanel();
        jPanelSD = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableLeaderboardSD = new javax.swing.JTable();
        jPanelNet = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableLeaderboardNet = new javax.swing.JTable();
        jPanelWeb = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableLeaderboardWeb = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jButtonSoftwareDevelopment.setText("Software Development");
        jButtonSoftwareDevelopment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSoftwareDevelopmentActionPerformed(evt);
            }
        });

        jButtonNetworking.setText("Networking");
        jButtonNetworking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNetworkingActionPerformed(evt);
            }
        });

        jButton3WebDesign.setText("Web Design");
        jButton3WebDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3WebDesignActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Click the area of competition to see it's leaderboard");

        jLabel3.setText("Leaderboard");

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonBack)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jButton3WebDesign)
                                        .addGap(74, 74, 74)
                                        .addComponent(jButtonNetworking)
                                        .addGap(62, 62, 62)
                                        .addComponent(jButtonSoftwareDevelopment))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSoftwareDevelopment)
                    .addComponent(jButton3WebDesign)
                    .addComponent(jButtonNetworking))
                .addGap(388, 388, 388))
        );

        jPanelMain.setLayout(new java.awt.CardLayout());

        jPanelSD.setBackground(new java.awt.Color(0, 0, 51));

        jTableLeaderboardSD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableLeaderboardSD);

        javax.swing.GroupLayout jPanelSDLayout = new javax.swing.GroupLayout(jPanelSD);
        jPanelSD.setLayout(jPanelSDLayout);
        jPanelSDLayout.setHorizontalGroup(
            jPanelSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSDLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanelSDLayout.setVerticalGroup(
            jPanelSDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelSD, "card5");

        jPanelNet.setBackground(new java.awt.Color(0, 0, 51));

        jTableLeaderboardNet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableLeaderboardNet);

        javax.swing.GroupLayout jPanelNetLayout = new javax.swing.GroupLayout(jPanelNet);
        jPanelNet.setLayout(jPanelNetLayout);
        jPanelNetLayout.setHorizontalGroup(
            jPanelNetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNetLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanelNetLayout.setVerticalGroup(
            jPanelNetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelNet, "card5");

        jPanelWeb.setBackground(new java.awt.Color(0, 0, 51));
        jPanelWeb.setPreferredSize(new java.awt.Dimension(684, 326));

        jTableLeaderboardWeb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableLeaderboardWeb);

        javax.swing.GroupLayout jPanelWebLayout = new javax.swing.GroupLayout(jPanelWeb);
        jPanelWeb.setLayout(jPanelWebLayout);
        jPanelWebLayout.setHorizontalGroup(
            jPanelWebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWebLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanelWebLayout.setVerticalGroup(
            jPanelWebLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelWebLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMain.add(jPanelWeb, "card5");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSoftwareDevelopmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSoftwareDevelopmentActionPerformed
        //only lets panel with software development leaderboard show 
        jPanelSD.setVisible(true);
        jPanelWeb.setVisible(false);
        jPanelNet.setVisible(false);

        //sets a darker color of software development button 
        setColor(jButtonSoftwareDevelopment);
        resetColor(jButton3WebDesign);
        resetColor(jButtonNetworking);

        //colors the entire background of button
        jButtonNetworking.setOpaque(true);
        jButtonSoftwareDevelopment.setOpaque(true);
        jButton3WebDesign.setOpaque(true);
    }//GEN-LAST:event_jButtonSoftwareDevelopmentActionPerformed

    private void jButton3WebDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3WebDesignActionPerformed
        //only lets panel with web design leaderboard show 
        jPanelSD.setVisible(false);
        jPanelWeb.setVisible(true);
        jPanelNet.setVisible(false);

        //sets a darker color of web design button 
        setColor(jButton3WebDesign);
        resetColor(jButtonSoftwareDevelopment);
        resetColor(jButtonNetworking);
        
        //colors the entire background of button
        jButtonNetworking.setOpaque(true);
        jButtonSoftwareDevelopment.setOpaque(true);
        jButton3WebDesign.setOpaque(true);
    }//GEN-LAST:event_jButton3WebDesignActionPerformed

    private void jButtonNetworkingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNetworkingActionPerformed
        //only lets panel with networking leaderboard show 
        jPanelSD.setVisible(false);
        jPanelWeb.setVisible(false);
        jPanelNet.setVisible(true);
        
        //sets a darker color of networking button 
        setColor(jButtonNetworking);
        resetColor(jButtonSoftwareDevelopment);
        resetColor(jButton3WebDesign);

        //colors the entire background of button
        jButtonNetworking.setOpaque(true);
        jButtonSoftwareDevelopment.setOpaque(true);
        jButton3WebDesign.setOpaque(true);
    }//GEN-LAST:event_jButtonNetworkingActionPerformed

    void setColor(JButton jButton) {
        //sets button color when button is pressed 
        jButton.setBackground(new Color(153, 153, 153));
    }

    void resetColor(JButton jButton) {
        //sets button color when button is not pressed 
        jButton.setBackground(new Color(240, 240, 240));
    }
    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        //transfers to welcome frame.
        WelcomeFrame welcome = new WelcomeFrame();
        welcome.setVisible(true);
        welcome.setResizable(false);
        welcome.pack();
        welcome.setLocationRelativeTo(null);
        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void leaderboard() {
        //imports latest external files
        importRegistration();

        //gets instance of TeamList Class
        TeamList teamList = TeamList.getInstance();

        //sets tables to not be editable 
        jTableLeaderboardSD.setEnabled(false);
        jTableLeaderboardWeb.setEnabled(false);
        jTableLeaderboardNet.setEnabled(false);

        //gets 3 instances of DefaultTableModel
        DefaultTableModel model1 = (DefaultTableModel) jTableLeaderboardSD.getModel();
        DefaultTableModel model2 = (DefaultTableModel) jTableLeaderboardWeb.getModel();
        DefaultTableModel model3 = (DefaultTableModel) jTableLeaderboardNet.getModel();

        //populates all 3 tables with colums titels 
        String[] columns = {"Team Name", "Score"};
        model1.setColumnIdentifiers(columns);
        model2.setColumnIdentifiers(columns);
        model3.setColumnIdentifiers(columns);

        //gets instance of ScoreMap class
        ScoreMap scoreMap = ScoreMap.getInstance();
        
        //populates table with teams of specific area of competition attribute from hashmap in Score list external file
        for (Map.Entry<?, ?> data : scoreMap.sortTeamScore().entrySet()) {
            String name = data.getKey().toString();
            if (null != teamList.getTeam(name).getAreaofCompetition()) {
                switch (teamList.getTeam(name).getAreaofCompetition()) { // displays leaderboard table corresponding to the button pressed 
                    case "Software Development":
                        model1.addRow(new Object[]{name, data.getValue()});
                        break;
                    case "Networking":
                        model3.addRow(new Object[]{name, data.getValue()});
                        break;
                    case "Web Design":
                        model2.addRow(new Object[]{name, data.getValue()});
                        break;
                    default:
                        break;
                }
            }else{
                
                JOptionPane.showMessageDialog(this, "Team scores have not jet been submitted.");
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3WebDesign;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonNetworking;
    private javax.swing.JButton jButtonSoftwareDevelopment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelMain;
    private javax.swing.JPanel jPanelNet;
    private javax.swing.JPanel jPanelSD;
    private javax.swing.JPanel jPanelWeb;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableLeaderboardNet;
    private javax.swing.JTable jTableLeaderboardSD;
    private javax.swing.JTable jTableLeaderboardWeb;
    // End of variables declaration//GEN-END:variables
}
