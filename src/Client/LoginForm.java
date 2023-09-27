package Client;

import Server.Frame;
import Server.LoginValidation;
import Server.UserSession;
import Server.LoginResult;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class LoginForm extends javax.swing.JPanel {

    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoContainer = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginForm = new javax.swing.JPanel();
        greetingMessage = new javax.swing.JLabel();
        usernameContainer = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        passwordContainer = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        passwordLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1365, 730));
        setMinimumSize(new java.awt.Dimension(831, 520));
        setPreferredSize(new java.awt.Dimension(831, 520));

        logoContainer.setBackground(new java.awt.Color(255, 255, 255));
        logoContainer.setPreferredSize(new java.awt.Dimension(420, 500));
        logoContainer.setLayout(null);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        image.setText("jLabel1");
        logoContainer.add(image);
        image.setBounds(10, 70, 390, 440);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 70, 2));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("  Book your appointment now!");
        logoContainer.add(jLabel2);
        jLabel2.setBounds(10, 0, 390, 70);

        loginForm.setBackground(new java.awt.Color(255, 255, 255));
        loginForm.setBorder(null);
        loginForm.setPreferredSize(new java.awt.Dimension(422, 445));
        loginForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greetingMessage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        greetingMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greetingMessage.setText("Welcome!");
        loginForm.add(greetingMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 430, 60));

        usernameContainer.setBackground(new java.awt.Color(255, 255, 255));
        usernameContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        usernameLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        usernameLabel.setText("Username");
        usernameLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout usernameContainerLayout = new javax.swing.GroupLayout(usernameContainer);
        usernameContainer.setLayout(usernameContainerLayout);
        usernameContainerLayout.setHorizontalGroup(
            usernameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(usernameContainerLayout.createSequentialGroup()
                .addComponent(usernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        usernameContainerLayout.setVerticalGroup(
            usernameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameLabel)
                .addGap(8, 8, 8)
                .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        loginForm.add(usernameContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 270, 70));

        passwordContainer.setBackground(new java.awt.Color(255, 255, 255));
        passwordContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        passwordLabel.setText("Password");
        passwordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout passwordContainerLayout = new javax.swing.GroupLayout(passwordContainer);
        passwordContainer.setLayout(passwordContainerLayout);
        passwordContainerLayout.setHorizontalGroup(
            passwordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(password, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(passwordContainerLayout.createSequentialGroup()
                .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        passwordContainerLayout.setVerticalGroup(
            passwordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordLabel)
                .addGap(8, 8, 8)
                .addComponent(password, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
        );

        loginForm.add(passwordContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 270, 70));

        loginButton.setBackground(new java.awt.Color(202, 70, 2));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Log in");
        loginButton.setBorderPainted(false);
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginButton.setFocusPainted(false);
        loginButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginForm.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 270, 40));

        signUpButton.setBackground(new java.awt.Color(255, 255, 255));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(0, 51, 153));
        signUpButton.setText("No account? Sign up here.");
        signUpButton.setBorder(null);
        signUpButton.setBorderPainted(false);
        signUpButton.setContentAreaFilled(false);
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpButton.setFocusPainted(false);
        signUpButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        signUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        loginForm.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 190, 20));

        showPassword.setBackground(new java.awt.Color(255, 255, 255));
        showPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        showPassword.setText("Show password");
        showPassword.setFocusPainted(false);
        showPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        showPassword.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });
        loginForm.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 110, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // get the data entered
        String usernameText = username.getText();
        String passwordText = password.getText();

        LoginValidation loginValidation = new LoginValidation();
        // pass the value in the validateLogin method in LoginValidation class through instantiation of LoginResult class
        LoginResult result = loginValidation.validateLogin(usernameText, passwordText);
        // retrive the returned value in LoginResult class and store it in the variable
        boolean isValidUser = result.isValid();
        int userID = result.getUserID();
        String userRole = result.getUserRole();

        // store the userID retrieved from LoginResult to access it anywhere
        UserSession userManager = UserSession.getInstance();
        userManager.setUserID(userID);
        userManager.setUserRole(userRole);

        // grant access if the credential enetered matches the data in the database
        if (isValidUser) {
            Frame frame = new Frame();
            // redirects user to its own page designation based on their role
            if ("Admin".equals(userRole)) {
                frame.viewFrame("Client.AdminDashboard", "Appointment System - Admin Dashboard");
            } else {
                frame.viewFrame("Client.ClientDashboard", "Appointment System - Client Dashboard");
            }

            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid credentials. Check your username and password.", "Login Form", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        Frame frame = new Frame();
        frame.viewFrame("Client.RegistrationForm", "Registration Form");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_signUpButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel greetingMessage;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginForm;
    private javax.swing.JPanel logoContainer;
    private javax.swing.JPasswordField password;
    private javax.swing.JPanel passwordContainer;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JButton signUpButton;
    private javax.swing.JTextField username;
    private javax.swing.JPanel usernameContainer;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables

}
