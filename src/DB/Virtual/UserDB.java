package DB.Virtual;

import Model.User;
import java.util.ArrayList;

public class UserDB {
    public static ArrayList<User> users;

    public static boolean checkEmailExist(String email) {
        for (User u : users) {
            if (email.equals(u.getEmail())) {
                return true;
            }
        }
        return false;
    }
}
