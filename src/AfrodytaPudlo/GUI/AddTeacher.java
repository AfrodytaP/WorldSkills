package AfrodytaPudlo.GUI;

import AfrodytaPudlo.AreaOfExpertise;
import AfrodytaPudlo.LevelOfExpertise;
import static AfrodytaPudlo.Main.exportRegistration;
import static AfrodytaPudlo.Main.importRegistration;
import AfrodytaPudlo.Person;
import AfrodytaPudlo.PersonList;
import AfrodytaPudlo.Teacher;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AddTeacher extends javax.swing.JFrame {

    public AddTeacher() {
        initComponents();

        //automaticaly populated combo boxes
        fillComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldIDNumber = new javax.swing.JTextField();
        jButtonRegisterEnter = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldTelephone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jPasswordFieldPasswordConfirm = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxArea = new javax.swing.JComboBox<>();
        jComboBoxLevel = new javax.swing.JComboBox<>();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 51));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Number :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");

        jButtonRegisterEnter.setBackground(new java.awt.Color(0, 153, 153));
        jButtonRegisterEnter.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButtonRegisterEnter.setText("Add New Teacher");
        jButtonRegisterEnter.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegisterEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterEnterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("First Name :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Last Name :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mobile Number :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ConfirmPassword : ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Level of experience :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Area of experience :");

        jComboBoxArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBoxLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonRegisterEnter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jButtonBack))
                                .addGap(54, 54, 54)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldTelephone)
                                    .addComponent(jTextFieldFirstName)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldIDNumber)
                                    .addComponent(jPasswordFieldPassword)
                                    .addComponent(jPasswordFieldPasswordConfirm)
                                    .addComponent(jComboBoxArea, 0, 323, Short.MAX_VALUE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonBack)
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldIDNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jPasswordFieldPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButtonRegisterEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validation(String ID, String FirstName, String Surname, String Telephone, String Password, String ConfirmPassword) {

        //boolean returns true if all validation have passed.
        boolean isValis = true;

        //checks that no filds are left empty.
        if (ID.isEmpty() || FirstName.isEmpty() || Surname.isEmpty() || Telephone.isEmpty() || Password.isEmpty() || ConfirmPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please make sure to fill in all of the filds.");
            isValis = false;
        }

        //checks that first name and surname value only contains letters.
        if (!FirstName.matches("^[a-zA-Z]*$") || !Surname.matches("^[a-zA-Z]*$")) {
            JOptionPane.showMessageDialog(this, "Please only use letters for both the first name and surname.");
            isValis = false;
        }

        //checks mobile number only starts with 0 the second diget is 7, that the length is 11 and that only numbers are entered.
        if (Telephone.charAt(0) != '0' && Telephone.charAt(1) != '7' && Telephone.length() != 11 && !Telephone.matches("[0-9+]")) {
            JOptionPane.showMessageDialog(this, "The mobile phone number entered is not valid.");
            isValis = false;
        }

        //checks that the valie in password and in confirmpassword match.
        if (!Password.equals(ConfirmPassword)) {
            JOptionPane.showMessageDialog(this, "The password and confirm password flilds do not match.");
            isValis = false;
        }

        //returns the result.
        return isValis;
    }

    private void jButtonRegisterEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterEnterActionPerformed
        //import latest personList external file
        importRegistration();

        //get instance of PersonList Class
        PersonList personList = PersonList.getInstance();
        Teacher teacher;

        String ID = jTextFieldIDNumber.getText();
        String FirstName = jTextFieldFirstName.getText();
        String Surname = jTextFieldLastName.getText();
        String AreaOfExpertise = jComboBoxArea.getModel().getSelectedItem().toString();
        String Telephone = jTextFieldTelephone.getText();
        String password = jPasswordFieldPassword.getText();
        String confirmPassword = jPasswordFieldPasswordConfirm.getText();
        String LevelOfExpertise = jComboBoxLevel.getModel().getSelectedItem().toString();
        String teamName = "";
        String role = "Teacher";
        String JudgingPermission = "False";

        //call to validation method.
        boolean isValid = validation(ID, FirstName, Surname, Telephone, password, confirmPassword);

        if (isValid == false) {  // Validation has failed

        } else {
            Person person = personList.personExists(ID); //checks if person with the same ID already exists in external list
            if (person == null) { //if ID is not present the new perosn is added 
                teacher = new Teacher(JudgingPermission, LevelOfExpertise, ID, FirstName, Surname, AreaOfExpertise, Telephone, password, confirmPassword, teamName, role);

                //call method addPerson from personList class, adds new teacher to personList external file
                personList.addPerson(teacher);

                exportRegistration();
                importRegistration();

                JOptionPane.showMessageDialog(this, "Teacher has been added successfully.");

                //redirects to main Admin Frame
                AdminAreaFrame adminArea = new AdminAreaFrame();
                adminArea.setVisible(true);
                adminArea.setResizable(false);
                adminArea.pack();
                adminArea.setLocationRelativeTo(null);
                adminArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.dispose();
            } else { //if ID is present in external file error message is displayed
                JOptionPane.showMessageDialog(this, "Sorry teacher with this ID already exists.");
            }
        }
    }//GEN-LAST:event_jButtonRegisterEnterActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        //transfers to main admin frame
        AdminAreaFrame adminArea = new AdminAreaFrame();
        adminArea.setVisible(true);
        adminArea.setResizable(false);
        adminArea.pack();
        adminArea.setLocationRelativeTo(null);
        adminArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void fillComboBox() {

        //populates Area of competition combo box
        jComboBoxArea.setModel(new DefaultComboBoxModel(new String[]{AreaOfExpertise.Option1.toString(), AreaOfExpertise.Option2.toString(), AreaOfExpertise.Option3.toString()}));

        //populates Level of experiance combo box
        jComboBoxLevel.setModel(new DefaultComboBoxModel(new String[]{LevelOfExpertise.Option1.toString(), LevelOfExpertise.Option2.toString(), LevelOfExpertise.Option3.toString()}));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonRegisterEnter;
    private javax.swing.JComboBox<String> jComboBoxArea;
    private javax.swing.JComboBox<String> jComboBoxLevel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JPasswordField jPasswordFieldPasswordConfirm;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldIDNumber;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldTelephone;
    // End of variables declaration//GEN-END:variables
}
