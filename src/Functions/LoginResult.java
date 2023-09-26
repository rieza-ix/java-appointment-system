package Functions;

public class LoginResult {

    private boolean isValid;
    private int userID;

    public LoginResult(int userID) {
        this.userID = userID;
    }

    public LoginResult(boolean isValid, int userID) {
        this.isValid = isValid;
        this.userID = userID;
    }

    public boolean isValid() {
        return isValid;
    }

    public int getUserID() {
        return userID;
    }

}
