package AfrodytaPudlo.GUI;

import AfrodytaPudlo.AreaOfExpertise;
import static AfrodytaPudlo.Main.exportRegistration;
import static AfrodytaPudlo.Main.importRegistration;
import AfrodytaPudlo.Person;
import AfrodytaPudlo.PersonList;
import AfrodytaPudlo.Status;
import AfrodytaPudlo.Student;
import AfrodytaPudlo.Team;
import AfrodytaPudlo.TeamList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CreateTeamFrame extends javax.swing.JFrame {

    String UserId;

    public CreateTeamFrame(String userId) {
        UserId = userId;

        //call methods.
        initComponents();
        fillComboBox();
        populateStudentTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTeamName = new javax.swing.JTextField();
        jTextFieldCollegeName = new javax.swing.JTextField();
        jComboBoxCompetition = new javax.swing.JComboBox<>();
        jButtonCreateTeam = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldIdNumber = new javax.swing.JTextField();
        jTextFieldAddress = new javax.swing.JTextField();
        jTextFieldPhone = new javax.swing.JTextField();
        jComboBoxStatus = new javax.swing.JComboBox<>();
        jButtonAddStudent = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableStudents = new javax.swing.JTable();
        jButtonSubmitTeam = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabelArea = new javax.swing.JLabel();
        jLabelInstitutionName = new javax.swing.JLabel();
        jLabelTeamName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 961, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Team Name :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Institution Name :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Area of Competition :");

        jComboBoxCompetition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonCreateTeam.setText("Create Team");
        jButtonCreateTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateTeamActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 51));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("ID Number :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Address :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Mobile Number :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Education Status :");

        jComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonAddStudent.setText("Add Student");
        jButtonAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddStudentActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Step 2: Add 4 Students.");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonAddStudent)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldIdNumber)
                                .addComponent(jTextFieldAddress)
                                .addComponent(jTextFieldPhone)
                                .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel20)))
                .addGap(0, 33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel20)
                .addGap(31, 31, 31)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextFieldIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAddStudent)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Step 1: Creat a team.");

        jTableStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableStudents);

        jButtonSubmitTeam.setText("Submit Team");
        jButtonSubmitTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitTeamActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Step 3: Submit Team.");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonCreateTeam)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldTeamName)
                                    .addComponent(jTextFieldCollegeName)
                                    .addComponent(jComboBoxCompetition, 0, 201, Short.MAX_VALUE)))))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel19)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSubmitTeam)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jTextFieldCollegeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jComboBoxCompetition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jButtonCreateTeam))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButtonSubmitTeam)))
                .addGap(23, 23, 23))
        );

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Team Name:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Institution Name:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Area:");

        jLabelArea.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelArea.setForeground(new java.awt.Color(255, 255, 255));

        jLabelInstitutionName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelInstitutionName.setForeground(new java.awt.Color(255, 255, 255));

        jLabelTeamName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTeamName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButtonBack)
                .addGap(34, 34, 34)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTeamName)
                .addGap(47, 47, 47)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelInstitutionName)
                .addGap(53, 53, 53)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jLabelArea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(jLabel23)
                        .addComponent(jLabel24)
                        .addComponent(jLabelArea)
                        .addComponent(jLabelInstitutionName)
                        .addComponent(jLabelTeamName))
                    .addComponent(jButtonBack))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validation(String teamName, String collegeName) {

        //boolean returns true if all validation have passed.
        boolean isValis = true;

        //checks that no filds are left empty.
        if (teamName.isEmpty() || collegeName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please make sure to fill in all of the filds.");
            isValis = false;
        }

        //checks that team and college name values only contains letters.
        if (!teamName.matches("^[a-zA-Z]*$") || !collegeName.matches("^[a-zA-Z]*$")) {
            JOptionPane.showMessageDialog(this, "Please only use letters for both the team and college name.");
            isValis = false;
        }

        //returns the result.
        return isValis;
    }

    private boolean validation(String iD, String address, String telephone) {

        //boolean returns true if all validation have passed.
        boolean isValis = true;

        //checks that no filds are left empty.
        if (iD.isEmpty() || address.isEmpty() || telephone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please make sure to fill in all of the filds.");
            isValis = false;
        }

        //checks that student ID value only contains letters.
        if (!iD.matches("^[a-zA-Z]*$")) {
            JOptionPane.showMessageDialog(this, "Please only use letters for student ID.");
            isValis = false;
        }

        //checks that address value only contains letters, numbers and spaces.
        if (!address.matches("^[a-zA-Z0-9 ]*$")) {
            JOptionPane.showMessageDialog(this, "Please do not enter any special charecterd in the address filed.");
            isValis = false;
        }

        //checks mobile number only starts with 0 the second diget is 7, that the length is 11 and that only numbers are entered.
        if (telephone.charAt(0) != '0' && telephone.charAt(1) != '7' && telephone.length() != 11 && !telephone.matches("[0-9+]")) {
            JOptionPane.showMessageDialog(this, "The mobile phone number entered is not valid.");
            isValis = false;
        }

        //returns the result.
        return isValis;
    }

    private void jButtonCreateTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateTeamActionPerformed
        //instance of TeamList class
        TeamList teamList = TeamList.getInstance();
        Team team;

        //Instance veriables
        String teamName = jTextFieldTeamName.getText();
        String areaofCompetition = jComboBoxCompetition.getModel().getSelectedItem().toString();
        String teacherID = UserId;
        String collegeName = jTextFieldCollegeName.getText();

        //chack if values entered are valid.
        boolean isValid = validation(teamName, collegeName);

        //if valid carry on.
        if (isValid == true) {
            //Check if a team from the same education institution and area of competition already exists.
            Team isAreaTaken = teamList.isCompetitionAreTaken(collegeName, areaofCompetition);

            //if isAreaTaken returns null then no such team exists.
            if (isAreaTaken == null) {

                team = new Team(teamName, areaofCompetition, teacherID, collegeName);

                //if isPresent returns 1 then team with the name already exists
                Team isPresent = teamList.getTeam(team.getTeamName());//isPresent(team);
                if (isPresent == null) {
                    //if isPresent dose not return 1 them populate labuls with values enterd (team has not yet been added to external file).
                    jLabelTeamName.setText(teamName);
                    jLabelInstitutionName.setText(collegeName);
                    jLabelArea.setText(areaofCompetition);

                } else {

                    JOptionPane.showMessageDialog(this, "Team with this team name already exists.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Team from with college already exists for this area of competition.");

            }
        }


    }//GEN-LAST:event_jButtonCreateTeamActionPerformed

    private void populateStudentTable() {
        //import latest external files 
        importRegistration();

        // column names
        String[] columns = {"Student ID", "Address", "Telephone", "Status"};

        //table is not editable 
        jTableStudents.setEnabled(false);

        //populate table with column names.
        DefaultTableModel model = (DefaultTableModel) jTableStudents.getModel();
        model.setColumnIdentifiers(columns);
    }
    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        //transfers to TeacherAreaFrame
        TeacherAreaFrame teacherArea = new TeacherAreaFrame(UserId);
        teacherArea.setVisible(true);
        teacherArea.setResizable(false);
        teacherArea.pack();
        teacherArea.setLocationRelativeTo(null);
        teacherArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddStudentActionPerformed
        //get instance of PersonList class
        PersonList personList = PersonList.getInstance();

        DefaultTableModel model = (DefaultTableModel) jTableStudents.getModel();

        //to verify that no less and no more than 4 students are going to be added to the team
        if (jTableStudents.getRowCount() <= 3) {

            //instance veriables 
            String iD = jTextFieldIdNumber.getText();
            String address = jTextFieldAddress.getText();
            String telephone = jTextFieldPhone.getText();
            String status = jComboBoxStatus.getModel().getSelectedItem().toString();

            //check if enterd values are valid
            boolean isValid = validation(iD, address, telephone);

            //if valid carry on
            if (isValid == true) {
                //if person is equal to null (person does not exists in external file) so is added to table
                Person person = personList.personExists(iD);
                if (person == null) {

                    //populates table with values entered
                    Object[] rowData = new Object[4];
                    rowData[0] = iD;
                    rowData[1] = address;
                    rowData[2] = telephone;
                    rowData[3] = status;
                    model.addRow(rowData);

                } else {
                    //is displayed if person exists 
                    JOptionPane.showMessageDialog(this, "Sorry this student already exists.");
                }
                // to clear textfilds
                jTextFieldIdNumber.setText(null);
                jTextFieldAddress.setText(null);
                jTextFieldPhone.setText(null);
            }
        } else {
            //is displayed if teacher tries to enter more than 4 students
            JOptionPane.showMessageDialog(this, "Sorry the maximum number of students per team is 4.");
        }

    }//GEN-LAST:event_jButtonAddStudentActionPerformed

    private void jButtonSubmitTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitTeamActionPerformed
        //get instance of TeamList class
        TeamList teamList = TeamList.getInstance();
        Team team;

        //get instance of PersonList class
        PersonList personList = PersonList.getInstance();
        Student student;

        //if team lables are empty or number of rows in table is not equal to 4 then error message is displayed
        if (jLabelTeamName.getText().equals("") || jTableStudents.getRowCount() != 4) {
            JOptionPane.showMessageDialog(this, "Please make sure to create a team and add 4 students before submitting the team.");

        } else {   //else team is created and added to the approprate external files 

            //veriable are populated from lables 
            String teamName = jLabelTeamName.getText();
            String areaofCompetition = jLabelArea.getText();
            String teacherID = UserId;
            String collegeName = jLabelInstitutionName.getText();

            //new team object is created 
            team = new Team(teamName, areaofCompetition, teacherID, collegeName);

            //.addTeam() method adds team object to extrnal file list
            teamList.addTeam(team);

            //external files and exported and imported 
            exportRegistration();
            importRegistration();

            //loops over table  
            for (int i = 0; i < jTableStudents.getRowCount(); i++) {

                String iD = jTableStudents.getValueAt(i, 0).toString();
                String address = jTableStudents.getValueAt(i, 1).toString();
                String telephone = jTableStudents.getValueAt(i, 2).toString();
                String status = jTableStudents.getValueAt(i, 3).toString();
                String tearcherID = UserId;
                String role = "Student";

                //create a new student object from data in each row.
                student = new Student(status, tearcherID, iD, address, telephone, role);

                //addPerson() method adds student object to extrnal file list.
                personList.addPerson(student);

                //external files and exported and imported 
                exportRegistration();
                importRegistration();
            }

            JOptionPane.showMessageDialog(this, "Thank you, team has been submitted succesfuly.");

            //Updates current teacher object with the team name
            Person person = personList.personExists(UserId);
            person.setTeamName(teamName);
            //external files and exported and imported 
            exportRegistration();
            importRegistration();

            //transfers to TeacherAreaFrame
            TeacherAreaFrame teacherArea = new TeacherAreaFrame(UserId);
            teacherArea.setVisible(true);
            teacherArea.setResizable(false);
            teacherArea.pack();
            teacherArea.setLocationRelativeTo(null);
            teacherArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSubmitTeamActionPerformed

    private void fillComboBox() {
        //populates area of competiotion combo box
        jComboBoxCompetition.setModel(new DefaultComboBoxModel(new String[]{AreaOfExpertise.Option1.toString(), AreaOfExpertise.Option2.toString(), AreaOfExpertise.Option3.toString()}));

        //populates the student status combo box
        jComboBoxStatus.setModel(new DefaultComboBoxModel(new String[]{Status.Option1.toString(), Status.Option2.toString(), Status.Option3.toString()}));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddStudent;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCreateTeam;
    private javax.swing.JButton jButtonSubmitTeam;
    private javax.swing.JComboBox<String> jComboBoxCompetition;
    private javax.swing.JComboBox<String> jComboBoxStatus;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelArea;
    private javax.swing.JLabel jLabelInstitutionName;
    private javax.swing.JLabel jLabelTeamName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableStudents;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldCollegeName;
    private javax.swing.JTextField jTextFieldIdNumber;
    private javax.swing.JTextField jTextFieldPhone;
    private javax.swing.JTextField jTextFieldTeamName;
    // End of variables declaration//GEN-END:variables
}
