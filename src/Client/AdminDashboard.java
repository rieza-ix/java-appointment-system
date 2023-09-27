package Client;

import Server.Frame;
import Server.BookAppointment;
import Server.UserSession;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;

public class AdminDashboard extends javax.swing.JPanel {

    public AdminDashboard() {
        initComponents();
        upcomingAppointments();
    }

    private void upcomingAppointments() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        try {
            // establish connection to MySQL database
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/appointment_system", "root", "");
            Statement stmt = con.createStatement();
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String formattedDate = dateFormat.format(currentDate);

            // sql query to retrieve client, time, and purpose from the database
            String sql = "SELECT client, time, purpose FROM appointment WHERE date = '" + formattedDate + "' AND status = 'Approved' ORDER BY time ASC";
            ResultSet rs = stmt.executeQuery(sql);

            // display data in rows
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString("client"), rs.getString("time"), rs.getString("purpose")});
            }

            // sql query for counting all upcoming appointments as well as cancelled appointment for the current day
            String sql2 = "SELECT status FROM appointment WHERE status IN ('Approved', 'Cancelled') AND date = '" + formattedDate + "' ORDER BY date, time ASC";
            ResultSet rs2 = stmt.executeQuery(sql2);
            int appointmentCount = 0, cancelledCount = 0;

            // count the total
            while (rs2.next()) {
                String status = rs2.getString("status");

                if ("Approved".equals(status)) {
                    appointmentCount++;
                } else if ("Cancelled".equals(status)) {
                    cancelledCount++;
                }
            }
            con.close();

            // display the total in jlabel
            totalAppointments.setText(Integer.toString(appointmentCount));
            cancelledAppointments.setText(Integer.toString(cancelledCount));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "There was an error retrieving data from database.", "Book AppointmentAdmin Dashboard", JOptionPane.ERROR_MESSAGE);
        }
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
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        purposeLabel = new javax.swing.JLabel();
        purpose = new javax.swing.JTextField();
        bookAppointmentButton = new javax.swing.JButton();
        date = new com.toedter.calendar.JDateChooser();
        time = new javax.swing.JFormattedTextField();
        clientName = new javax.swing.JTextField();
        clientLabel = new javax.swing.JLabel();
        upcomingContainer = new javax.swing.JPanel();
        upcomingContainerTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        allAppointmentsContainer = new javax.swing.JPanel();
        allAppointmentsTitle = new javax.swing.JLabel();
        totalAppointments = new javax.swing.JLabel();
        cancelledContainer = new javax.swing.JPanel();
        cancelledLabel = new javax.swing.JLabel();
        cancelledAppointments = new javax.swing.JLabel();

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

        logout.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Log out");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        clients.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        clients.setForeground(new java.awt.Color(255, 255, 255));
        clients.setText("Clients");
        clients.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientsMouseClicked(evt);
            }
        });

        profile.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        profile.setForeground(new java.awt.Color(255, 255, 255));
        profile.setText("Profile");
        profile.setBorder(null);
        profile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(moduleTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 459, Short.MAX_VALUE)
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

        dateLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        dateLabel.setText("Date");

        timeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        timeLabel.setText("Time");

        purposeLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        purposeLabel.setText("Purpose");

        purpose.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        purpose.setActionCommand("<Not Set>");
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

        date.setBackground(new java.awt.Color(255, 255, 255));
        date.setBorder(null);
        date.setDateFormatString("yyyy-MM-dd");
        date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        time.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        time.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        time.setFocusLostBehavior(javax.swing.JFormattedTextField.COMMIT);
        time.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        clientName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clientName.setActionCommand("<Not Set>");
        clientName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        clientLabel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        clientLabel.setText("Client Name");

        javax.swing.GroupLayout bookFormLayout = new javax.swing.GroupLayout(bookForm);
        bookForm.setLayout(bookFormLayout);
        bookFormLayout.setHorizontalGroup(
            bookFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(formTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookFormLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(bookFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purposeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(purpose)
                    .addComponent(bookAppointmentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(time)
                    .addComponent(clientName)
                    .addComponent(clientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
        bookFormLayout.setVerticalGroup(
            bookFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(formTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purposeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(purpose, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bookAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        add(bookForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 320, 420));

        upcomingContainer.setBackground(java.awt.SystemColor.control);
        upcomingContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 2, true));

        upcomingContainerTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        upcomingContainerTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        upcomingContainerTitle.setText("Upcoming Appointments");
        upcomingContainerTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTable1.setBackground(java.awt.SystemColor.control);
        jTable1.setBorder(null);
        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Client", "Time", "Purpose"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(java.awt.SystemColor.control);
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View All");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout upcomingContainerLayout = new javax.swing.GroupLayout(upcomingContainer);
        upcomingContainer.setLayout(upcomingContainerLayout);
        upcomingContainerLayout.setHorizontalGroup(
            upcomingContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(upcomingContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(upcomingContainerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        upcomingContainerLayout.setVerticalGroup(
            upcomingContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upcomingContainerLayout.createSequentialGroup()
                .addGroup(upcomingContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(upcomingContainerTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
        );

        add(upcomingContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 420, 250));

        allAppointmentsContainer.setBackground(new java.awt.Color(255, 255, 255));
        allAppointmentsContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        allAppointmentsContainer.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N

        allAppointmentsTitle.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        allAppointmentsTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        allAppointmentsTitle.setText("Appointments");
        allAppointmentsTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        totalAppointments.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        totalAppointments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout allAppointmentsContainerLayout = new javax.swing.GroupLayout(allAppointmentsContainer);
        allAppointmentsContainer.setLayout(allAppointmentsContainerLayout);
        allAppointmentsContainerLayout.setHorizontalGroup(
            allAppointmentsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(allAppointmentsTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addComponent(totalAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        allAppointmentsContainerLayout.setVerticalGroup(
            allAppointmentsContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allAppointmentsContainerLayout.createSequentialGroup()
                .addComponent(allAppointmentsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(totalAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        add(allAppointmentsContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 195, 143));

        cancelledContainer.setBackground(new java.awt.Color(255, 255, 255));
        cancelledContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        cancelledLabel.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        cancelledLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelledLabel.setText("Cancelled");
        cancelledLabel.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        cancelledAppointments.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        cancelledAppointments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout cancelledContainerLayout = new javax.swing.GroupLayout(cancelledContainer);
        cancelledContainer.setLayout(cancelledContainerLayout);
        cancelledContainerLayout.setHorizontalGroup(
            cancelledContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cancelledLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
            .addComponent(cancelledAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        cancelledContainerLayout.setVerticalGroup(
            cancelledContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cancelledContainerLayout.createSequentialGroup()
                .addComponent(cancelledLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(cancelledAppointments, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        add(cancelledContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 70, 195, 143));
    }// </editor-fold>//GEN-END:initComponents

    private void bookAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookAppointmentButtonActionPerformed
        // get the data entered
        String clientNameText = clientName.getText();
        Date selectedDate = date.getDate();
        String timeText = time.getText();
        String purposeText = purpose.getText();

        // checks if all fields are not empty
        if (clientNameText.isEmpty() || selectedDate == null || timeText.isEmpty() || purposeText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Book Appointment", JOptionPane.INFORMATION_MESSAGE);
        } else {
            clientName.setText("");
            date.setDate(null);
            time.setText("");
            purpose.setText("");

            // retrive the user_id of the user who logged in
            UserSession userManager = UserSession.getInstance();
            int userID = userManager.getUserID();
            String userRole = userManager.getUserRole();

            // pass the data to book the appointment
            BookAppointment ba = new BookAppointment();
            ba.book(userID, userRole, clientNameText, selectedDate, timeText, purposeText);
        }
    }//GEN-LAST:event_bookAppointmentButtonActionPerformed

    private void clientsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientsMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.ClientAccounts", "Appointment System - Client Accounts");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_clientsMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.LoginForm", "Appointment System");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.AllAppointments", "Appointment System - All Appointments");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        Frame frame = new Frame();
        frame.viewFrame("Client.UserProfile", "Appointment System - User Profile");
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_profileMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel allAppointmentsContainer;
    private javax.swing.JLabel allAppointmentsTitle;
    private javax.swing.JButton bookAppointmentButton;
    private javax.swing.JPanel bookForm;
    private javax.swing.JLabel cancelledAppointments;
    private javax.swing.JPanel cancelledContainer;
    private javax.swing.JLabel cancelledLabel;
    private javax.swing.JLabel clientLabel;
    private javax.swing.JTextField clientName;
    private javax.swing.JLabel clients;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel moduleTitle;
    private javax.swing.JPanel navBar;
    private javax.swing.JLabel profile;
    private javax.swing.JTextField purpose;
    private javax.swing.JLabel purposeLabel;
    private javax.swing.JFormattedTextField time;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel totalAppointments;
    private javax.swing.JPanel upcomingContainer;
    private javax.swing.JLabel upcomingContainerTitle;
    // End of variables declaration//GEN-END:variables

}
