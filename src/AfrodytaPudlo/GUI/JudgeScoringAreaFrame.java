package AfrodytaPudlo.GUI;

import static AfrodytaPudlo.Main.exportRegistration;
import static AfrodytaPudlo.Main.importRegistration;
import AfrodytaPudlo.PersonList;
import AfrodytaPudlo.Score;
import AfrodytaPudlo.ScoreList;
import AfrodytaPudlo.ScoreMap;
import AfrodytaPudlo.Team;
import AfrodytaPudlo.TeamList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JudgeScoringAreaFrame extends javax.swing.JFrame {

    private String UserId = "";

    public JudgeScoringAreaFrame(String userId) {
        initComponents();
        UserId = userId;

        //call methods
        populateTeamTable();
        populateComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonBack = new javax.swing.JButton();
        jButtonGiveScore = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelTeamName = new javax.swing.JLabel();
        jLabelCollege = new javax.swing.JLabel();
        jComboBoxScore = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTeams = new javax.swing.JTable();
        jButtonSubmitScore = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButtonBack)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 100));

        jButtonGiveScore.setText("Give Score");
        jButtonGiveScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGiveScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonGiveScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));

        jLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setText("Team Name :");
        jPanel1.add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Score : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("College Name :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabelTeamName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTeamName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelTeamName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jLabelCollege.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCollege.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jLabelCollege, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, -1, -1));

        jPanel1.add(jComboBoxScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 90, -1));

        jTableTeams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Team Name", "Area of Competition", "College Name", "Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTeams.getTableHeader().setReorderingAllowed(false);
        jTableTeams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTeamsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTeams);
        if (jTableTeams.getColumnModel().getColumnCount() > 0) {
            jTableTeams.getColumnModel().getColumn(0).setResizable(false);
            jTableTeams.getColumnModel().getColumn(1).setResizable(false);
            jTableTeams.getColumnModel().getColumn(2).setResizable(false);
            jTableTeams.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 560, 210));

        jButtonSubmitScore.setText("Submit Score");
        jButtonSubmitScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitScoreActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSubmitScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, -1, -1));

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

    private void jButtonGiveScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGiveScoreActionPerformed
        //gets instance of DefaultTableModel.
        DefaultTableModel model = (DefaultTableModel) jTableTeams.getModel();

        //try catch to prevent exception while no row is selected and the save button is pressed.
        try {
            //score selected form combo box is stored
            String scoreGiven = jComboBoxScore.getModel().getSelectedItem().toString();

            //score is set in 4th column od selected row
            model.setValueAt(scoreGiven, jTableTeams.getSelectedRow(), 3);
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Please select a team by clicking the row the team is in.");
        }
    }//GEN-LAST:event_jButtonGiveScoreActionPerformed

    private void jTableTeamsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTeamsMouseClicked
        //gets instance of DefaultTableModel.
        DefaultTableModel model = (DefaultTableModel) jTableTeams.getModel();

        //stores selected row index
        int selectedRowIndex = jTableTeams.getSelectedRow();

        //populates lables with data from selected table row.
        jLabelTeamName.setText(model.getValueAt(selectedRowIndex, 0).toString());
        jLabelCollege.setText(model.getValueAt(selectedRowIndex, 2).toString());

    }//GEN-LAST:event_jTableTeamsMouseClicked

    // when submit button is pressed 
    private void jButtonSubmitScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitScoreActionPerformed
        //gets instance of ScoreList
        ScoreList scoreList = ScoreList.getInstance();
        Score score;

        //chacks if judge has already scored the teams 
        int hasScored = scoreList.isPresent(UserId);

        //gets instance of ScoreMap
        ScoreMap scoreMap = ScoreMap.getInstance();
        Score scoreForMap;
        
        if (hasScored == 0) {
            //allTeamsScored equals true
            boolean allTeamsScored = true;
            for (int i = 0; i < jTableTeams.getRowCount(); i++) {

                //if any team not been score then allTeamsScored equals false
                if (jTableTeams.getValueAt(i, 3) == null) {
                    JOptionPane.showMessageDialog(this, "Please score each team before submitting.");
                    allTeamsScored = false;
                    return;
                }
            }

            //check if allTeamsScored equals true.
            if (allTeamsScored == true) {

                //loops jTableTeams
                for (int i = 0; i < jTableTeams.getRowCount(); i++) {

                    //populates veriable from data in table.
                    String TeamName = jTableTeams.getValueAt(i, 0).toString();
                    String Score = jTableTeams.getValueAt(i, 3).toString();
                    String JudgeID = UserId;

                    //new object of type score
                    score = new Score(TeamName, Score, JudgeID);

                    // method in scoreList to add to external file
                    scoreList.addSubmittedScore(score);

                    //new object of type score
                    scoreForMap = new Score(TeamName, Score);

                    //method addScore() add to hashMap
                    scoreMap.addScore(scoreForMap);

                    //export to external files 
                    exportRegistration();
                }

                JOptionPane.showMessageDialog(this, "Thank you for submitting your scores.");

                //transfers to main teacher area frame.
                TeacherAreaFrame teacherArea = new TeacherAreaFrame(UserId);
                teacherArea.setVisible(true);
                teacherArea.setResizable(false);
                teacherArea.pack();
                teacherArea.setLocationRelativeTo(null);
                teacherArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(this, "You  have submitted the scores already.");
        }
    }//GEN-LAST:event_jButtonSubmitScoreActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        //transfers to main teacher area frame.
        TeacherAreaFrame teacherArea = new TeacherAreaFrame(UserId);
        teacherArea.setVisible(true);
        teacherArea.setResizable(false);
        teacherArea.pack();
        teacherArea.setLocationRelativeTo(null);
        teacherArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    //method populates Team Table 
    private void populateTeamTable() {
        //imports latest external files 
        importRegistration();

        //gets instance of PersonList class
        PersonList personList = PersonList.getInstance();
        DefaultTableModel model = (DefaultTableModel) jTableTeams.getModel();

        //gets instance of TeamList class
        List<Team> teamList = TeamList.getInstance().getTeamList();
        //gets instance of TeamList class
        List<Score> scorelist = ScoreList.getInstance().getScoreList();
        for (Team team : teamList) {

            //only gets teams that match the area of competiotion to the teacher (judges) area of expertise
            if (team.getAreaofCompetition().equals(personList.personExists(UserId).getAreaOfExpertise())) {
                Object[] rowData = new Object[4];
                rowData[0] = team.getTeamName();
                rowData[1] = team.getAreaofCompetition();
                rowData[2] = team.getCollegeName();

                //gets scores that match the team name that ID of the teacher (judge) that gave the score
                for (Score score : scorelist) {
                    if (score.getTeamName().equals(team.getTeamName()) && score.getJudgeID().equals(personList.personExists(UserId).getiD())) {
                        rowData[3] = score.getScore();
                    }
                }
                model.addRow(rowData);
            }
        }
    }

    private void populateComboBox() {
        //populates combo box with numbers from 0 to 10 
        for (int i = 0; i <= 10; i++) {
            jComboBoxScore.addItem(String.valueOf(i));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonGiveScore;
    private javax.swing.JButton jButtonSubmitScore;
    private javax.swing.JComboBox<String> jComboBoxScore;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelCollege;
    private javax.swing.JLabel jLabelTeamName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTeams;
    // End of variables declaration//GEN-END:variables
}
