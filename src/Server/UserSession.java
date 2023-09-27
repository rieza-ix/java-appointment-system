package Server;

public class UserSession {

    // this will hold the single instance of the UserSession class
    private static UserSession instance = null;
    private int userID;
    private String userRole;

    private UserSession() {

    }

    // returns an instance of the UserSession class
    public static synchronized UserSession getInstance() {
        //  checks whether the instance variable is null, indicating that no instance of the class has been created yet
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    // setter for userID
    public void setUserID(int userID) {
        this.userID = userID;
    }

    // getter for userID
    public int getUserID() {
        return userID;
    }

    // setter for userRole
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    // getter fir userRole
    public String getUserRole() {
        return userRole;
    }
}
