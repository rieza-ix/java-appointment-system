package Server;

// encapsulate the result of a validateLogin
public class LoginResult {

    private boolean isValid;
    private int userID;
    private String userRole;

    public LoginResult(int userID) {
        this.userID = userID;
    }

    public LoginResult(boolean isValid, int userID, String userRole) {
        this.isValid = isValid;
        this.userID = userID;
        this.userRole = userRole;
    }

    public boolean isValid() {
        return isValid;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserRole() {
        return userRole;
    }
}
