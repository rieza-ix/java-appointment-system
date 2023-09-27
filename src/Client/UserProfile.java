package Client;

import Server.Frame;
import Server.UserSession;
import Server.UpdateAccount;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class UserProfile extends javax.swing.JPanel {

    public UserProfile() {
        initComponents();

        // retrive the user_id of the user who logged in
        UserSession userManager = UserSession.getInstance();
        int userID = userManager.getUserID();

        try {
            // establish connection to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");
            Statement stmt = con.createStatement();
            if (userID == 0) {
                JOptionPane.showMessageDialog(null, "Error retrieving user_id.", "User Profile", JOptionPane.ERROR_MESSAGE);
            } else {
                // sql query to retrieve all user data from the database
                ResultSet rs = stmt.executeQuery("SELECT * FROM user_account WHERE user_ID = " + userID);

                // display the data in jtextfield
                while (rs.next()) {
                    firstName.setText(rs.getString("first_name"));
                    lastName.setText(rs.getString("last_name"));
                    phoneNumber.setText(rs.getString("phone_number"));
                    emailAddress.setText(rs.getString("email_address"));
                    username.setText(rs.getString("username"));
                    password.setText(rs.getString("password"));
                }
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrationForm = new javax.swing.JPanel();
        fNameLabel = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        lNameLabel = new javax.swing.JLabel();
        pNumberLabel = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailAddress = new javax.swing.JTextField();
        userNameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        logoContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1365, 370));
        setMinimumSize(new java.awt.Dimension(831, 520));
        setPreferredSize(new java.awt.Dimension(831, 520));

        registrationForm.setBackground(new java.awt.Color(255, 255, 255));
        registrationForm.setMinimumSize(new java.awt.Dimension(430, 100));
        registrationForm.setPreferredSize(new java.awt.Dimension(422, 500));

        fNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        fNameLabel.setText("First Name");

        firstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        firstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        lastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        lNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lNameLabel.setText("Last Name");

        pNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        pNumberLabel.setText("Phone Number");

        phoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        phoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        emailLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        emailLabel.setText("Email Address");

        emailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        userNameLabel.setText("Username");

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        passwordLabel.setText("Password");

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        registerButton.setBackground(new java.awt.Color(202, 70, 2));
        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        registerButton.setForeground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Update");
        registerButton.setFocusPainted(false);
        registerButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(202, 70, 2));
        cancelButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Back");
        cancelButton.setFocusPainted(false);
        cancelButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        showPassword.setBackground(new java.awt.Color(255, 255, 255));
        showPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        showPassword.setText("Show password");
        showPassword.setFocusPainted(false);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registrationFormLayout = new javax.swing.GroupLayout(registrationForm);
        registrationForm.setLayout(registrationFormLayout);
        registrationFormLayout.setHorizontalGroup(
            registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationFormLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showPassword)
                    .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pNumberLabel)
                        .addComponent(phoneNumber)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationFormLayout.createSequentialGroup()
                            .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(emailAddress)
                        .addComponent(emailLabel)
                        .addGroup(registrationFormLayout.createSequentialGroup()
                            .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(userNameLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(registrationFormLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrationFormLayout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        registrationFormLayout.setVerticalGroup(
            registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrationFormLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showPassword)
                .addGap(18, 18, 18)
                .addGroup(registrationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        logoContainer.setBackground(new java.awt.Color(255, 255, 255));
        logoContainer.setPreferredSize(new java.awt.Dimension(418, 500));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(202, 70, 2));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update your account here.");
        jLabel1.setPreferredSize(new java.awt.Dimension(350, 120));
        logoContainer.add(jLabel1);

        logo.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        logo.setForeground(new java.awt.Color(202, 70, 2));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/register.jpg"))); // NOI18N
        logoContainer.add(logo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(registrationForm, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
            .addComponent(registrationForm, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // get the data entered
        String lastNameText = lastName.getText();
        String firstNameText = firstName.getText();
        String phoneNumberText = phoneNumber.getText();
        String emailAddressText = emailAddress.getText();
        String usernameText = username.getText();
        String passwordText = password.getText().toString();

        // checks if all fields are not empty
        if (lastNameText.isEmpty() || firstNameText.isEmpty() || phoneNumberText.isEmpty() || emailAddressText.isEmpty() || usernameText.isEmpty() || passwordText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.", "User Profile", JOptionPane.ERROR_MESSAGE);
        } else {
            // pass the value retrieved to update the user account
            UpdateAccount updateData = new UpdateAccount();
            updateData.update(lastNameText, firstNameText, phoneNumberText, emailAddressText, usernameText, passwordText);
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        UserSession userManager = UserSession.getInstance();
        String userRole = userManager.getUserRole();
        Frame frame = new Frame();

        if ("Admin".equals(userRole)) {
            frame.viewFrame("Client.AdminDashboard", "Appointment System - Admin Dashboard");
        } else {
            frame.viewFrame("Client.ClientDashboard", "Appointment System - Client Dashboard");
        }

        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fNameLabel;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lNameLabel;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel logoContainer;
    private javax.swing.JLabel pNumberLabel;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField phoneNumber;
    private javax.swing.JButton registerButton;
    private javax.swing.JPanel registrationForm;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
