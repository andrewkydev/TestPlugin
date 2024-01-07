package org.andrewkydev.api.database.dao;

import org.andrewkydev.api.database.SessionFactoryMaker;
import org.andrewkydev.api.database.models.User;
import org.hibernate.Session;

public class UserDao {

    private static final Session session = (Session) SessionFactoryMaker.getSessionFactory();


    public static void saveUser(User user) {
        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction();
    }
}
