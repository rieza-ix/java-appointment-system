package Frames;

import Functions.Frame;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JPanel {

    // Creates new form LoginForm
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
        loginLabel = new javax.swing.JLabel();
        forgotPassword = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        google = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        signUpButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1365, 730));
        setMinimumSize(new java.awt.Dimension(860, 520));
        setPreferredSize(new java.awt.Dimension(831, 520));

        logoContainer.setBackground(new java.awt.Color(255, 255, 255));
        logoContainer.setPreferredSize(new java.awt.Dimension(420, 500));
        logoContainer.setLayout(null);

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        image.setText("jLabel1");
        logoContainer.add(image);
        image.setBounds(20, 70, 380, 440);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(202, 70, 2));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("  Book you appointment now!");
        logoContainer.add(jLabel2);
        jLabel2.setBounds(20, 0, 380, 70);

        loginForm.setBackground(new java.awt.Color(255, 255, 255));
        loginForm.setBorder(null);
        loginForm.setPreferredSize(new java.awt.Dimension(422, 445));
        loginForm.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greetingMessage.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        greetingMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        greetingMessage.setText("Hello there!");
        loginForm.add(greetingMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 430, 60));

        usernameContainer.setBackground(new java.awt.Color(255, 255, 255));
        usernameContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

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
                .addGap(0, 187, Short.MAX_VALUE))
        );
        usernameContainerLayout.setVerticalGroup(
            usernameContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usernameContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usernameLabel)
                .addGap(8, 8, 8)
                .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginForm.add(usernameContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 270, 70));

        passwordContainer.setBackground(new java.awt.Color(255, 255, 255));
        passwordContainer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

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
                .addGap(0, 192, Short.MAX_VALUE))
        );
        passwordContainerLayout.setVerticalGroup(
            passwordContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(passwordLabel)
                .addGap(8, 8, 8)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginForm.add(passwordContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 270, 70));

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("----------------  or  ----------------");
        loginForm.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 430, -1));

        forgotPassword.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        forgotPassword.setForeground(new java.awt.Color(0, 51, 153));
        forgotPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        forgotPassword.setText("Forgot password? ");
        forgotPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        forgotPassword.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        loginForm.add(forgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 110, -1));

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
        loginForm.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 270, 40));

        google.setBackground(new java.awt.Color(255, 255, 255));
        google.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        google.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/google.png"))); // NOI18N
        google.setText(" Log in with Google");
        google.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        google.setFocusPainted(false);
        google.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        google.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                googleActionPerformed(evt);
            }
        });
        loginForm.add(google, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 270, 40));

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
        loginForm.add(showPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 120, -1));

        signUpButton.setBackground(new java.awt.Color(255, 255, 255));
        signUpButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        signUpButton.setText("Sign up");
        signUpButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpButton.setFocusPainted(false);
        signUpButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        loginForm.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 270, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void googleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_googleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_googleActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (username.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter you username.", "Username field empty.", JOptionPane.INFORMATION_MESSAGE);
        } else if (password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter your password.", "Password field empty.", JOptionPane.INFORMATION_MESSAGE);
        } else if (username.getText().contains("riezxcvii") && password.getText().contains("rmjb100900.")) {
//            JOptionPane.showMessageDialog(null, "Login successful.", "Access granted.", JOptionPane.INFORMATION_MESSAGE);
            Frame frame = new Frame();
            frame.viewFrame("Frames.Admin", "Appointment System - Dashboard");
        } else {
            JOptionPane.showMessageDialog(null, "Invalid credentials. Check your username and password.", "Access denied.", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        if (showPassword.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_signUpButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel forgotPassword;
    private javax.swing.JButton google;
    private javax.swing.JLabel greetingMessage;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel loginForm;
    private javax.swing.JLabel loginLabel;
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
