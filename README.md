<h2>
    📁Appointment System
    <img width="13%" style="vertical-align:middle" src="https://badgen.net/badge/status/finished/blue" />
</h2>

📝 A simple appointment system designed to streamline the process of scheduling and managing appointments allows users to easily book appointments with businesses, professionals, or service providers. Users can choose their preferred date and time slots, and businesses/admins can choose to either approve or cancel the appointment. This efficient system enhances communication, reduces scheduling conflicts, and provides a convenient way for customers and businesses to keep track of their appointments, ensuring a smooth and organized appointment booking experience.

## 💻 Technologies

<p align="left">
    <img width="5.6%" align="center" src="https://www.svgrepo.com/show/303388/java-4-logo.svg">
    <img width="6.8%" align="center" src="https://www.qfs.de/fileadmin/_processed_/8/0/csm_java-swing_c77435cfa9.png">
    <img width="4.8%" align="center" src="https://www.sitesbay.com/awt/files/sublogo.png">
    <img width="6.4%" align="center" src="https://pbs.twimg.com/media/FkApeNZWAAAdE8l.png">
    <img width="7.8%" align="center" src="https://www.svgrepo.com/show/303251/mysql-logo.svg">
    <img width="3.5%" align="center" src="https://seeklogo.com/images/N/netbeans-logo-335EBA952E-seeklogo.com.png">
    <img width="3.6%" align="center" src="https://www.apachefriends.org/images/xampp-logo-ac950edf.svg">
</p>

## 📖 Manual

- Set-up XAMPP

  > - Download the XAMPP application here: https://www.apachefriends.org/download.html
  > - Install the application.

- Install the project.

  > - Navigate to your desired path.
  > - Clone this repository: https://github.com/rieza-ix/java-appointment-system

  or

  > - Download the zip file.
  > - Unzip the project file at your desired location.

- Set-up database

  > - In your http://localhost/phpmyadmin/, create a new database and name it 'appointment_system'
  > - Select the 'appointment_system'
  > - Click 'Import' in the tabs.
  > - Click the 'Choose File' button.
  > - Then select the file from the project folder located in src > Database > appointment_system.sql.

- Run the project.
  > - Open the XAMPP Control Panel.
  > - Start Apache and MySQL.
  >   Navigate to the 'App.java' file inside the 'src' folder and run the code.

## ✨ Features

- The admin can register an account for the client, and the client itself can create its own account.
  <img width="50%" src="./assets/snapshots/registration-form.png" />
- Both admins and users can update their own account details.
  <img width="50%" src="./assets/snapshots/user-profile.png" />
- The user can book an appointment, but it is pending approval from the admin.
  <br>
- The user can view their upcoming appointments or cancelled appointments.
  <img width="50%" src="./assets/snapshots/book-appointment.png" />
- Admin can add, view, approve, or cancel an appointment.
  <img width="50%" src="./assets/snapshots/approve-appointment.png" />
