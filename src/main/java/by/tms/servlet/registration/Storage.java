package by.tms.servlet.registration;

import java.util.ArrayList;

public class Storage {
    ArrayList<User> list = new ArrayList<>();

    public String addUser(String name, String userName, String password) {

        User user = new User(name, userName, password);

        if (list.contains(user)) {
            return "User exists";
        } else {
            list.add(user);
        }
        return "Successful";
    }
}

