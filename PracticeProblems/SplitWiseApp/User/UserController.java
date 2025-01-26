package User;

import java.util.ArrayList;
import java.util.List;

public class UserController {
    List<User> users;

    public UserController() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(String userId){
        for(User user : users){
            if(user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers(){
        return users;
    }

}
