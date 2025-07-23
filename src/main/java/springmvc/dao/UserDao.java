package springmvc.dao;

import jakarta.transaction.Transactional;
import org.hibernate.SessionFactory;
import springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class UserDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public int saveUser(User user) {
        sessionFactory.getCurrentSession().persist(user);
        // or save(user)
        System.out.println("user dao runned");
        return 0;
    }
}

