package org.andrewkydev.api.database;


import org.andrewkydev.api.database.models.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.Properties;

public class SessionFactoryMaker {

    private static SessionFactory sessionFactory;


    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = getConfiguration();

                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(UserStatistic.class);
                configuration.addAnnotatedClass(AuthInformation.class);
                configuration.addAnnotatedClass(Economy.class);
                configuration.addAnnotatedClass(EconomyTransactions.class);

                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();

                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }

    @NotNull
    private static Configuration getConfiguration() {
        Configuration configuration = new Configuration();

        Properties settings = new Properties();
        settings.put(Environment.DRIVER, "org.postgresql.Driver");
        settings.put(Environment.URL, "jdbc:postgresql://localhost:5432/db");
        settings.put(Environment.USER, "postgres");
        settings.put(Environment.PASS, "pass");
        settings.put(Environment.DIALECT, "org.hibernate.dialect.PostgreSQLDialect");

        settings.put(Environment.SHOW_SQL, "true");

        settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

        settings.put(Environment.HBM2DDL_AUTO, "create-drop");

        configuration.setProperties(settings);
        return configuration;
    }



}
