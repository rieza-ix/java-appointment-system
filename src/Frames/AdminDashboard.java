package Frames;

import Functions.Frame;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class AdminDashboard extends javax.swing.JPanel {

    // Creates new form LoginForm
    public AdminDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBar = new javax.swing.JPanel();
        moduleTitle = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        clients = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        bookForm = new javax.swing.JPanel();
        formTitle = new javax.swing.JLabel();
        time = new javax.swing.JFormattedTextField();
        date = new javax.swing.JFormattedTextField();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        purposeLabel = new javax.swing.JLabel();
        purpose = new javax.swing.JTextField();
        bookAppointmentButton = new javax.swing.JButton();
        upcomingContainer = new javax.swing.JPanel();
        upcomingContainerTitle = new javax.swing.JLabel();
        allAppointmentsContainer = new javax.swing.JPanel();
        allAppointmentsTitle = new javax.swing.JLabel();
        cancelledContainer = new javax.swing.JPanel();
        cancelledLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1365, 730));
        setMinimumSize(new java.awt.Dimension(831, 520));
        setPreferredSize(new java.awt.Dimension(831, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navBar.setBackground(new java.awt.Color(202, 70, 2));
        navBar.setToolTipText("");
        navBar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        moduleTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        moduleTitle.setForeground(new java.awt.Color(255, 255, 255));
        moduleTitle.setText("Dashboard");
        moduleTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Log out");

        clients.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clients.setForeground(new java.awt.Color(255, 255, 255));
        clients.setText("Clients");

        profile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("Profile");
        profile.setBorder(null);
        profile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(moduleTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, Short.MAX_VALUE)
                .addComponent(clients)
                .addGap(18, 18, 18)
                .addComponent(profile)
                .addGap(18, 18, 18)
                .addComponent(logout)
                .addGap(50, 50, 50))
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(moduleTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(profile, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(clients, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 40));

        bookForm.setBackground(new java.awt.Color(255, 255, 255));
        bookForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        formTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTitle.setText("Add an appointment");

        time.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        time.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        time.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });

        date.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dateLabel.setText("Date");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        timeLabel.setText("Time");

        purposeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        purposeLabel.setText("Purpose");

        purpose.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        purpose.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        bookAppointmentButton.setBackground(new java.awt.Color(202, 70, 2));
        bookAppointmentButton.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        bookAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        bookAppointmentButton.setText("Book Appointment");
        bookAppointmentButton.setFocusPainted(false);
        bookAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookAppointmentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bookFormLayout = new javax.swing.GroupLayout(bookForm);
        bookForm.setLayout(bookFormLayout);
        bookFormLayout.setHorizontalGroup(
            bookFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bookFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(time)
                    .addComponent(date)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purposeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purpose)
                    .addComponent(bookAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        bookFormLayout.setVerticalGroup(
            bookFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookFormLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(formTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purposeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(bookAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        add(bookForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 320, 420));

        upcomingContainer.setBackground(new java.awt.Color(255, 255, 255));
        upcomingContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        upcomingContainerTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        upcomingContainerTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        upcomingContainerTitle.setText("Upcoming Appointments");
        upcomingContainerTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout upcomingContainerLayout = new javax.swing.GroupLayout(upcomingContainer);
        upcomingContainer.setLayout(upcomingContainerLayout);
        upcomingContainerLayout.setHorizontalGroup(
            upcomingContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(upcomingContainerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
        );
        upcomingContainerLayout.setVerticalGroup(
            upcomingContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upcomingContainerTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(207, Short.MAX_VALUE))
        );

        add(upcomingContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 420, 250));

        allAppointmentsContainer.setBackground(new java.awt.Color(255, 255, 255));
        allAppointmentsContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        allAppointmentsTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        allAppointmentsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allAppointmentsTitle.setText("All Appointments");

        javax.swing.GroupLayout allAppointmentsContainerLayout = new javax.swing.GroupLayout(allAppointmentsContainer);
        allAppointmentsContainer.setLayout(allAppointmentsContainerLayout);
        allAppointmentsContainerLayout.setHorizontalGroup(
            allAppointmentsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allAppointmentsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
        );
        allAppointmentsContainerLayout.setVerticalGroup(
            allAppointmentsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allAppointmentsContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(allAppointmentsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        add(allAppointmentsContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 195, 143));

        cancelledContainer.setBackground(new java.awt.Color(255, 255, 255));
        cancelledContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        cancelledLabel.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        cancelledLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelledLabel.setText("Cancelled");

        javax.swing.GroupLayout cancelledContainerLayout = new javax.swing.GroupLayout(cancelledContainer);
        cancelledContainer.setLayout(cancelledContainerLayout);
        cancelledContainerLayout.setHorizontalGroup(
            cancelledContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelledLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cancelledContainerLayout.setVerticalGroup(
            cancelledContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelledContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cancelledLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        add(cancelledContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 70, 195, 143));
    }// </editor-fold>//GEN-END:initComponents

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void bookAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookAppointmentButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allAppointmentsContainer;
    private javax.swing.JLabel allAppointmentsTitle;
    private javax.swing.JButton bookAppointmentButton;
    private javax.swing.JPanel bookForm;
    private javax.swing.JPanel cancelledContainer;
    private javax.swing.JLabel cancelledLabel;
    private javax.swing.JLabel clients;
    private javax.swing.JFormattedTextField date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel moduleTitle;
    private javax.swing.JPanel navBar;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField purpose;
    private javax.swing.JLabel purposeLabel;
    private javax.swing.JFormattedTextField time;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JPanel upcomingContainer;
    private javax.swing.JLabel upcomingContainerTitle;
    // End of variables declaration//GEN-END:variables

}
