package Server;

public class UserID {

    // this will hold the single instance of the UserID class
    private static UserID instance = null;
    private int userid;

    private UserID() {

    }

    // returns an instance of the UserID class
    public static synchronized UserID getInstance() {
        //  checks whether the instance variable is null, indicating that no instance of the class has been created yet
        if (instance == null) {
            instance = new UserID();
        }
        return instance;
    }

    // setter
    public void setUserID(int userid) {
        this.userid = userid;
    }

    // getter
    public int getUserID() {
        return userid;
    }
}
