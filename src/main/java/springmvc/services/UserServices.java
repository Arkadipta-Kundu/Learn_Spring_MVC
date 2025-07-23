package springmvc.services;

import springmvc.dao.UserDao;
import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserDao userDao;

    public int createUser(User user){
        System.out.println("userservices runned");
        return this.userDao.saveUser(user);
    }
}
