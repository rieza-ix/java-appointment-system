package Functions;

public class UserID {

    private static UserID instance = null;
    private int userid;

    private UserID() {

    }

    public static synchronized UserID getInstance() {
        if (instance == null) {
            instance = new UserID();
        }
        return instance;
    }

    public void setUserID(int userid) {
        this.userid = userid;
    }

    public int getUserID() {
        return userid;
    }
}
