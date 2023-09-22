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
        greetingMessage = new javax.swing.JLabel();
        bookAppointmentContainer = new javax.swing.JPanel();
        bookAppointmentButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(1365, 730));
        setMinimumSize(new java.awt.Dimension(831, 520));
        setPreferredSize(new java.awt.Dimension(831, 520));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navBar.setBackground(new java.awt.Color(202, 70, 2));
        navBar.setToolTipText("");
        navBar.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        greetingMessage.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        greetingMessage.setForeground(new java.awt.Color(255, 255, 255));
        greetingMessage.setText("Hello there!");

        javax.swing.GroupLayout navBarLayout = new javax.swing.GroupLayout(navBar);
        navBar.setLayout(navBarLayout);
        navBarLayout.setHorizontalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(greetingMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(683, Short.MAX_VALUE))
        );
        navBarLayout.setVerticalGroup(
            navBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navBarLayout.createSequentialGroup()
                .addComponent(greetingMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(navBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 859, 40));

        bookAppointmentContainer.setBackground(new java.awt.Color(255, 255, 255));
        bookAppointmentContainer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(202, 70, 2), 2, true));

        bookAppointmentButton.setBackground(new java.awt.Color(202, 70, 2));
        bookAppointmentButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bookAppointmentButton.setForeground(new java.awt.Color(255, 255, 255));
        bookAppointmentButton.setText("Book Appointment");
        bookAppointmentButton.setFocusPainted(false);

        javax.swing.GroupLayout bookAppointmentContainerLayout = new javax.swing.GroupLayout(bookAppointmentContainer);
        bookAppointmentContainer.setLayout(bookAppointmentContainerLayout);
        bookAppointmentContainerLayout.setHorizontalGroup(
            bookAppointmentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookAppointmentContainerLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(bookAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        bookAppointmentContainerLayout.setVerticalGroup(
            bookAppointmentContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bookAppointmentContainerLayout.createSequentialGroup()
                .addContainerGap(428, Short.MAX_VALUE)
                .addComponent(bookAppointmentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        add(bookAppointmentContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 32, -1, 490));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookAppointmentButton;
    private javax.swing.JPanel bookAppointmentContainer;
    private javax.swing.JLabel greetingMessage;
    private javax.swing.JPanel navBar;
    // End of variables declaration//GEN-END:variables

}
