package Frames;

public class AdminDashboard extends javax.swing.JPanel {

    // Creates new form LoginForm
    public AdminDashboard() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navBar = new javax.swing.JPanel();
        bookAppointmentContainer = new javax.swing.JPanel();
        appointmentContainer = new javax.swing.JPanel();
        cancelledContainer = new javax.swing.JPanel();
        ongoingAppointments = new javax.swing.JPanel();
        upcomingAppointments = new javax.swing.JPanel();
        appointmentContainer1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1365, 730));
        setMinimumSize(new java.awt.Dimension(831, 520));
        setPreferredSize(new java.awt.Dimension(831, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navBar.setBackground(new java.awt.Color(202, 70, 2));

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
        );

        add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, -1));

        bookAppointmentContainer.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bookAppointmentContainerLayout = new javax.swing.GroupLayout(bookAppointmentContainer);
        bookAppointmentContainer.setLayout(bookAppointmentContainerLayout);
        bookAppointmentContainerLayout.setHorizontalGroup(
            bookAppointmentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        bookAppointmentContainerLayout.setVerticalGroup(
            bookAppointmentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        add(bookAppointmentContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 42, -1, 480));

        appointmentContainer.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout appointmentContainerLayout = new javax.swing.GroupLayout(appointmentContainer);
        appointmentContainer.setLayout(appointmentContainerLayout);
        appointmentContainerLayout.setHorizontalGroup(
            appointmentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );
        appointmentContainerLayout.setVerticalGroup(
            appointmentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        add(appointmentContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 70, -1, -1));

        cancelledContainer.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout cancelledContainerLayout = new javax.swing.GroupLayout(cancelledContainer);
        cancelledContainer.setLayout(cancelledContainerLayout);
        cancelledContainerLayout.setHorizontalGroup(
            cancelledContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        cancelledContainerLayout.setVerticalGroup(
            cancelledContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        add(cancelledContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 70, -1, -1));

        ongoingAppointments.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout ongoingAppointmentsLayout = new javax.swing.GroupLayout(ongoingAppointments);
        ongoingAppointments.setLayout(ongoingAppointmentsLayout);
        ongoingAppointmentsLayout.setHorizontalGroup(
            ongoingAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );
        ongoingAppointmentsLayout.setVerticalGroup(
            ongoingAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        add(ongoingAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 207, 240, 290));

        upcomingAppointments.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout upcomingAppointmentsLayout = new javax.swing.GroupLayout(upcomingAppointments);
        upcomingAppointments.setLayout(upcomingAppointmentsLayout);
        upcomingAppointmentsLayout.setHorizontalGroup(
            upcomingAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 241, Short.MAX_VALUE)
        );
        upcomingAppointmentsLayout.setVerticalGroup(
            upcomingAppointmentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(upcomingAppointments, new org.netbeans.lib.awtextra.AbsoluteConstraints(292, 207, -1, 290));

        appointmentContainer1.setBackground(new java.awt.Color(51, 153, 255));

        javax.swing.GroupLayout appointmentContainer1Layout = new javax.swing.GroupLayout(appointmentContainer1);
        appointmentContainer1.setLayout(appointmentContainer1Layout);
        appointmentContainer1Layout.setHorizontalGroup(
            appointmentContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );
        appointmentContainer1Layout.setVerticalGroup(
            appointmentContainer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 112, Short.MAX_VALUE)
        );

        add(appointmentContainer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 70, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appointmentContainer;
    private javax.swing.JPanel appointmentContainer1;
    private javax.swing.JPanel bookAppointmentContainer;
    private javax.swing.JPanel cancelledContainer;
    private javax.swing.JPanel navBar;
    private javax.swing.JPanel ongoingAppointments;
    private javax.swing.JPanel upcomingAppointments;
    // End of variables declaration//GEN-END:variables

}
