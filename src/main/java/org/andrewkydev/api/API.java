package org.andrewkydev.api;

import lombok.Getter;
import org.andrewkydev.api.database.SessionFactoryMaker;
import org.bukkit.plugin.java.JavaPlugin;
import org.hibernate.SessionFactory;


import java.util.logging.Logger;

public final class API extends JavaPlugin {

    @Getter
    private static Logger jlogger;

    @Getter
    private static API instance;


    @Override
    public void onEnable() {
        instance = this;
        jlogger = super.getLogger();
        jlogger.info("plugin is enabled1");
        SessionFactory  sessionFactory = SessionFactoryMaker.getSessionFactory();
        jlogger.info(String.valueOf(sessionFactory.isOpen()));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
